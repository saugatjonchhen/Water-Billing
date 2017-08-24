
import com.bill.connection.ConnectionString_water_bill_customer;
import com.bill.modelOLD.Customer;
import com.bill.readingOLD.insertreadingDAO;
import java.sql.*;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroj
 */
public class reading_test {
    public static void main(String[] args) {
        insertreadingDAO d = new insertreadingDAO();
        Customer customer = new Customer();
                customer.setLast_Reading_Value(11);
                customer.setRead_by("user1");
                customer.setReading_not_Editing(false);
        int insertreading = d.insertreading(customer, "1a");
        if(insertreading >=1){
            System.out.println("sucessfulee");
        }else{
            System.out.println("faiiled");
        }
    }
}
