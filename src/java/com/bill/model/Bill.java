/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.model;

import java.util.Date;

/**
 *
 * @author Saroj
 */
public class Bill {
    private int id;
    private double Last_Reading_Value;
    private double Units;
    private double Reading_Bill;
    private double Balance;
    private double Actual_Bill;
    private String Bill_No;
    private String Invoice_No;
    private String Bill_by ;
    private Date Bill_date ;
    private Boolean isUsed ;
    private Boolean Editble ;

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

    /**
     * @return the Last_Reading_Value
     */
    public double getLast_Reading_Value() {
        return Last_Reading_Value;
    }

    /**
     * @param Last_Reading_Value the Last_Reading_Value to set
     */
    public void setLast_Reading_Value(double Last_Reading_Value) {
        this.Last_Reading_Value = Last_Reading_Value;
    }

    /**
     * @return the Units
     */
    public double getUnits() {
        return Units;
    }

    /**
     * @param Units the Units to set
     */
    public void setUnits(double Units) {
        this.Units = Units;
    }

    /**
     * @return the Reading_Bill
     */
    public double getReading_Bill() {
        return Reading_Bill;
    }

    /**
     * @param Reading_Bill the Reading_Bill to set
     */
    public void setReading_Bill(double Reading_Bill) {
        this.Reading_Bill = Reading_Bill;
    }

    /**
     * @return the Balance
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the Actual_Bill
     */
    public double getActual_Bill() {
        return Actual_Bill;
    }

    /**
     * @param Actual_Bill the Actual_Bill to set
     */
    public void setActual_Bill(double Actual_Bill) {
        this.Actual_Bill = Actual_Bill;
    }

    /**
     * @return the Bill_No
     */
    public String getBill_No() {
        return Bill_No;
    }

    /**
     * @param Bill_No the Bill_No to set
     */
    public void setBill_No(String Bill_No) {
        this.Bill_No = Bill_No;
    }

    /**
     * @return the Invoice_No
     */
    public String getInvoice_No() {
        return Invoice_No;
    }

    /**
     * @param Invoice_No the Invoice_No to set
     */
    public void setInvoice_No(String Invoice_No) {
        this.Invoice_No = Invoice_No;
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
     * @return the isUsed
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    /**
     * @param isUsed the isUsed to set
     */
    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * @return the Editble
     */
    public Boolean getEditble() {
        return Editble;
    }

    /**
     * @param Editble the Editble to set
     */
    public void setEditble(Boolean Editble) {
        this.Editble = Editble;
    }
}
