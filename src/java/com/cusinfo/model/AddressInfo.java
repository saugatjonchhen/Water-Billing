/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.model;

/**
 *
 * @author User
 */
public class AddressInfo {
    private String CustomerId;
    private String state;
    private String district;
    private String municipality;
    private String ward_no;
    private String house_no;

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the municipality
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * @param municipality the municipality to set
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * @return the ward_no
     */
    public String getWard_no() {
        return ward_no;
    }

    /**
     * @param ward_no the ward_no to set
     */
    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    /**
     * @return the house_no
     */
    public String getHouse_no() {
        return house_no;
    }

    /**
     * @param house_no the house_no to set
     */
    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    /**
     * @return the CustomerId
     */
    public String getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }
    
}
