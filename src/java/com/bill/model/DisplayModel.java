/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.model;

/**
 *
 * @author Saroj
 */
public class DisplayModel {
    private String date;
    private String fine_dsc;
    private Double Amt;
    private Double fine_dsc_amt;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the fine_dsc
     */
    public String getFine_dsc() {
        return fine_dsc;
    }

    /**
     * @param fine_dsc the fine_dsc to set
     */
    public void setFine_dsc(String fine_dsc) {
        this.fine_dsc = fine_dsc;
    }

    /**
     * @return the Amt
     */
    public Double getAmt() {
        return Amt;
    }

    /**
     * @param Amt the Amt to set
     */
    public void setAmt(Double Amt) {
        this.Amt = Amt;
    }

    /**
     * @return the fine_dsc_amt
     */
    public Double getFine_dsc_amt() {
        return fine_dsc_amt;
    }

    /**
     * @param fine_dsc_amt the fine_dsc_amt to set
     */
    public void setFine_dsc_amt(Double fine_dsc_amt) {
        this.fine_dsc_amt = fine_dsc_amt;
    }
}
