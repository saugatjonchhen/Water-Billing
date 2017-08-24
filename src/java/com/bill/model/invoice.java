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
public class invoice {
    private int Invoice_Id;
    private int bill_id;
    private String Invoice_No;
    private Double Bill_amt;
    private Double Fine;
    private Double Discount;
    private String Payment_Mode;
    private Date Invoice_date;
    private String Invoice_By;

    /**
     * @return the Invoice_Id
     */
    public int getInvoice_Id() {
        return Invoice_Id;
    }

    /**
     * @param Invoice_Id the Invoice_Id to set
     */
    public void setInvoice_Id(int Invoice_Id) {
        this.Invoice_Id = Invoice_Id;
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
     * @return the Bill_amt
     */
    public Double getBill_amt() {
        return Bill_amt;
    }

    /**
     * @param Bill_amt the Bill_amt to set
     */
    public void setBill_amt(Double Bill_amt) {
        this.Bill_amt = Bill_amt;
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
     * @return the Payment_Mode
     */
    public String getPayment_Mode() {
        return Payment_Mode;
    }

    /**
     * @param Payment_Mode the Payment_Mode to set
     */
    public void setPayment_Mode(String Payment_Mode) {
        this.Payment_Mode = Payment_Mode;
    }

    /**
     * @return the Invoice_date
     */
    public Date getInvoice_date() {
        return Invoice_date;
    }

    /**
     * @param Invoice_date the Invoice_date to set
     */
    public void setInvoice_date(Date Invoice_date) {
        this.Invoice_date = Invoice_date;
    }

    /**
     * @return the Invoice_By
     */
    public String getInvoice_By() {
        return Invoice_By;
    }

    /**
     * @param Invoice_By the Invoice_By to set
     */
    public void setInvoice_By(String Invoice_By) {
        this.Invoice_By = Invoice_By;
    }

    /**
     * @return the bill_id
     */
    public int getBill_id() {
        return bill_id;
    }

    /**
     * @param bill_id the bill_id to set
     */
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }
}
