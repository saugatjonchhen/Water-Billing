package com.bill.modelOLD;
import java.util.Date;
public class Customer {
    private int id;
    private int Last_Reading_Value;
    private int Units;
    private String Read_by;
    private Date Read_date;
    private Double Reading_bill_amt; //unts ko calcuated value
    private Boolean Reading_not_Editing; // flag 0 for editle 1 for non editble
    private Double Reading_bill_actaul_amt; // bill = readingbill + balance
    private Double Fine;
    private Double Discount;
    private Double Actual_bill_amt;  //= reeading_billactl+fine-discount
    private Double Amount_paid;
    private Double Balance;
    private String Bill_by;
    private Date Bill_date;
    private Boolean isBillpaid;
    private Boolean isSurplus;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

 
    public int getUnits() {
        return Units;
    }

    /**
     * @param Units the Units to set
     */
    public void setUnits(int Units) {
        this.Units = Units;
    }

    /**
     * @return the Read_by
     */
    public String getRead_by() {
        return Read_by;
    }

    /**
     * @param Read_by the Read_by to set
     */
    public void setRead_by(String Read_by) {
        this.Read_by = Read_by;
    }

    /**
     * @return the Read_date
     */
    public Date getRead_date() {
        return Read_date;
    }

    /**
     * @param Read_date the Read_date to set
     */
    public void setRead_date(Date Read_date) {
        this.Read_date = Read_date;
    }


    /**
     * @return the Reading_flag
     */

    /**
     * @return the Reading_bill_actaul_amt
     */
    public Double getReading_bill_actaul_amt() {
        return Reading_bill_actaul_amt;
    }

    /**
     * @param Reading_bill_actaul_amt the Reading_bill_actaul_amt to set
     */
    public void setReading_bill_actaul_amt(Double Reading_bill_actaul_amt) {
        this.Reading_bill_actaul_amt = Reading_bill_actaul_amt;
    }

    /**
     * @return the Fine
     */
    public Double getFine() {
        return Fine;
    }

    /**
     * @param Fine the Fine to set
     */
    public void setFine(Double Fine) {
        this.Fine = Fine;
    }

    /**
     * @return the Discount
     */
    public Double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    /**
     * @return the Actual_bill_amt
     */
    public Double getActual_bill_amt() {
        return Actual_bill_amt;
    }

    /**
     * @param Actual_bill_amt the Actual_bill_amt to set
     */
    public void setActual_bill_amt(Double Actual_bill_amt) {
        this.Actual_bill_amt = Actual_bill_amt;
    }

    /**
     * @return the Amount_paid
     */
    public Double getAmount_paid() {
        return Amount_paid;
    }

    /**
     * @param Amount_paid the Amount_paid to set
     */
    public void setAmount_paid(Double Amount_paid) {
        this.Amount_paid = Amount_paid;
    }

    /**
     * @return the Balance
     */
    public Double getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the Bill_by
     */
    public String getBill_by() {
        return Bill_by;
    }

    /**
     * @param Bill_by the Bill_by to set
     */
    public void setBill_by(String Bill_by) {
        this.Bill_by = Bill_by;
    }

    /**
     * @return the Bill_date
     */
    public Date getBill_date() {
        return Bill_date;
    }

    /**
     * @param Bill_date the Bill_date to set
     */
    public void setBill_date(Date Bill_date) {
        this.Bill_date = Bill_date;
    }

    /**
     * @return the Last_Reading_Value
     */
    public int getLast_Reading_Value() {
        return Last_Reading_Value;
    }

    /**
     * @param Last_Reading_Value the Last_Reading_Value to set
     */
    public void setLast_Reading_Value(int Last_Reading_Value) {
        this.Last_Reading_Value = Last_Reading_Value;
    }

    /**
     * @return the Reading_not_Editing
     */
    public Boolean getReading_not_Editing() {
        return Reading_not_Editing;
    }

    /**
     * @param Reading_not_Editing the Reading_not_Editing to set
     */
    public void setReading_not_Editing(Boolean Reading_not_Editing) {
        this.Reading_not_Editing = Reading_not_Editing;
    }

    /**
     * @return the Reading_bill_amt
     */
    public Double getReading_bill_amt() {
        return Reading_bill_amt;
    }

    /**
     * @param Reading_bill_amt the Reading_bill_amt to set
     */
    public void setReading_bill_amt(Double Reading_bill_amt) {
        this.Reading_bill_amt = Reading_bill_amt;
    }
}
