import com.bill.calculator.*;
import com.bill.invoice.invoiceDAO;
import com.bill.model.Bill;
import com.bill.model.DisplayModel;
import com.bill.model.invoice;
import java.util.ArrayList;
import java.util.Date;

public class NewClass {
    public static void main(String[] args) {
        invoiceDAO inDAO = new invoiceDAO();
        ArrayList<Bill> RemainingList = inDAO.get_bills("1a");
        Double select_last_balance_from_paid = inDAO.select_last_balance_from_paid("1a");

        ArrayList<invoice> bill_List = new ArrayList();
        if (!RemainingList.isEmpty()) {
            int i = 0;
            Date d;
            discount_calculator dsc = new discount_calculator();
            fine_calculator fine = new fine_calculator();
            for (Bill b : RemainingList) {
                invoice invoic = new invoice();
                        invoic.setBill_amt(b.getReading_Bill());
                    if ((select_last_balance_from_paid <= 0)&&(i==0)) {
                        invoic.setBill_amt(b.getReading_Bill() + select_last_balance_from_paid);
                    }
                 i++;
                 invoic.setBill_id(b.getId());
                invoic.setInvoice_date(b.getBill_date());
                d= b.getBill_date();
                invoic.setDiscount(dsc.calculate_disc(invoic.getBill_amt(), d));
                invoic.setFine(fine.calculate_fine(invoic.getBill_amt(), d));
                bill_List.add(invoic);
            }
        }
        System.out.println(bill_List.size());
    }
}