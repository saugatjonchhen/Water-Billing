/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class CustomerInfo {
    
    private int Registration_no;
    private String CustomerId;
    private String Applicant_fname;
    private String Applicant_mname;
    private String Applicant_lname;
    private String Parents_fname;
    private String Parents_mname;
    private String Parents_lname;
    private String Grand_parent_fname;
    private String Grand_parent_mname;
    private String Grand_parent_lname;
    private String Reason_for_installation;
    private int No_of_members;
    private int Daily_Consumption;
    private String Applicant_Photo;
    private String Land_Owner_Photo;
    private String Citizenship_Scan_Certificate;
    private String Electricity_Bill_Reciept;
    private String Naxa_Pass_Certificate;
    private AddressInfo address;
    private CharKillaInfo charkilla;
    private Date RegisteredDate;
    private String RegisteredBy;
    private String mobileNo;
    private String CitizenShipNumber;

    /**
     * @return the Registration_no
     */
    public int getRegistration_no() {
        return Registration_no;
    }

    /**
     * @param Registration_no the Registration_no to set
     */
    public void setRegistration_no(int Registration_no) {
        this.Registration_no = Registration_no;
    }

    /**
     * @return the Applicant_fname
     */
    public String getApplicant_fname() {
        return Applicant_fname;
    }

    /**
     * @param Applicant_fname the Applicant_fname to set
     */
    public void setApplicant_fname(String Applicant_fname) {
        this.Applicant_fname = Applicant_fname;
    }

    /**
     * @return the Applicant_mname
     */
    public String getApplicant_mname() {
        return Applicant_mname;
    }

    /**
     * @param Applicant_mname the Applicant_mname to set
     */
    public void setApplicant_mname(String Applicant_mname) {
        this.Applicant_mname = Applicant_mname;
    }

    /**
     * @return the Applicant_lname
     */
    public String getApplicant_lname() {
        return Applicant_lname;
    }

    /**
     * @param Applicant_lname the Applicant_lname to set
     */
    public void setApplicant_lname(String Applicant_lname) {
        this.Applicant_lname = Applicant_lname;
    }

    /**
     * @return the Parents_fname
     */
    public String getParents_fname() {
        return Parents_fname;
    }

    /**
     * @param Parents_fname the Parents_fname to set
     */
    public void setParents_fname(String Parents_fname) {
        this.Parents_fname = Parents_fname;
    }

    /**
     * @return the Parents_mname
     */
    public String getParents_mname() {
        return Parents_mname;
    }

    /**
     * @param Parents_mname the Parents_mname to set
     */
    public void setParents_mname(String Parents_mname) {
        this.Parents_mname = Parents_mname;
    }

    /**
     * @return the Parents_lname
     */
    public String getParents_lname() {
        return Parents_lname;
    }

    /**
     * @param Parents_lname the Parents_lname to set
     */
    public void setParents_lname(String Parents_lname) {
        this.Parents_lname = Parents_lname;
    }

    /**
     * @return the Grand_parent_fname
     */
    public String getGrand_parent_fname() {
        return Grand_parent_fname;
    }

    /**
     * @param Grand_parent_fname the Grand_parent_fname to set
     */
    public void setGrand_parent_fname(String Grand_parent_fname) {
        this.Grand_parent_fname = Grand_parent_fname;
    }

    /**
     * @return the Grand_parent_mname
     */
    public String getGrand_parent_mname() {
        return Grand_parent_mname;
    }

    /**
     * @param Grand_parent_mname the Grand_parent_mname to set
     */
    public void setGrand_parent_mname(String Grand_parent_mname) {
        this.Grand_parent_mname = Grand_parent_mname;
    }

    /**
     * @return the Grand_parent_lname
     */
    public String getGrand_parent_lname() {
        return Grand_parent_lname;
    }

    /**
     * @param Grand_parent_lname the Grand_parent_lname to set
     */
    public void setGrand_parent_lname(String Grand_parent_lname) {
        this.Grand_parent_lname = Grand_parent_lname;
    }

    /**
     * @return the Reason_for_installation
     */
    public String getReason_for_installation() {
        return Reason_for_installation;
    }

    /**
     * @param Reason_for_installation the Reason_for_installation to set
     */
    public void setReason_for_installation(String Reason_for_installation) {
        this.Reason_for_installation = Reason_for_installation;
    }

    /**
     * @return the No_of_members
     */
    public int getNo_of_members() {
        return No_of_members;
    }

    /**
     * @param No_of_members the No_of_members to set
     */
    public void setNo_of_members(int No_of_members) {
        this.No_of_members = No_of_members;
    }

    /**
     * @return the Daily_Consumption
     */
    public int getDaily_Consumption() {
        return Daily_Consumption;
    }

    /**
     * @param Daily_Consumption the Daily_Consumption to set
     */
    public void setDaily_Consumption(int Daily_Consumption) {
        this.Daily_Consumption = Daily_Consumption;
    }

    /**
     * @return the Applicant_Photo
     */
    public String getApplicant_Photo() {
        return Applicant_Photo;
    }

    /**
     * @param Applicant_Photo the Applicant_Photo to set
     */
    public void setApplicant_Photo(String Applicant_Photo) {
        this.Applicant_Photo = Applicant_Photo;
    }

    /**
     * @return the Land_Owner_Photo
     */
    public String getLand_Owner_Photo() {
        return Land_Owner_Photo;
    }

    /**
     * @param Land_Owner_Photo the Land_Owner_Photo to set
     */
    public void setLand_Owner_Photo(String Land_Owner_Photo) {
        this.Land_Owner_Photo = Land_Owner_Photo;
    }

    /**
     * @return the Citizenship_Scan_Certificate
     */
    public String getCitizenship_Scan_Certificate() {
        return Citizenship_Scan_Certificate;
    }

    /**
     * @param Citizenship_Scan_Certificate the Citizenship_Scan_Certificate to set
     */
    public void setCitizenship_Scan_Certificate(String Citizenship_Scan_Certificate) {
        this.Citizenship_Scan_Certificate = Citizenship_Scan_Certificate;
    }

    /**
     * @return the Electricity_Bill_Reciept
     */
    public String getElectricity_Bill_Reciept() {
        return Electricity_Bill_Reciept;
    }

    /**
     * @param Electricity_Bill_Reciept the Electricity_Bill_Reciept to set
     */
    public void setElectricity_Bill_Reciept(String Electricity_Bill_Reciept) {
        this.Electricity_Bill_Reciept = Electricity_Bill_Reciept;
    }

    /**
     * @return the Naxa_Pass_Certificate
     */
    public String getNaxa_Pass_Certificate() {
        return Naxa_Pass_Certificate;
    }

    /**
     * @param Naxa_Pass_Certificate the Naxa_Pass_Certificate to set
     */
    public void setNaxa_Pass_Certificate(String Naxa_Pass_Certificate) {
        this.Naxa_Pass_Certificate = Naxa_Pass_Certificate;
    }

    /**
     * @return the address
     */
    public AddressInfo getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    /**
     * @return the charkilla
     */
    public CharKillaInfo getCharkilla() {
        return charkilla;
    }

    /**
     * @param charkilla the charkilla to set
     */
    public void setCharkilla(CharKillaInfo charkilla) {
        this.charkilla = charkilla;
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

    /**
     * @return the RegisteredDate
     */
    public Date getRegisteredDate() {
        return RegisteredDate;
    }

    /**
     * @param RegisteredDate the RegisteredDate to set
     */
    public void setRegisteredDate(Date RegisteredDate) {
        this.RegisteredDate = RegisteredDate;
    }

    /**
     * @return the RegisteredBy
     */
    public String getRegisteredBy() {
        return RegisteredBy;
    }

    /**
     * @param RegisteredBy the RegisteredBy to set
     */
    public void setRegisteredBy(String RegisteredBy) {
        this.RegisteredBy = RegisteredBy;
    }

    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the CitizenShipNumber
     */
    public String getCitizenShipNumber() {
        return CitizenShipNumber;
    }

    /**
     * @param CitizenShipNumber the CitizenShipNumber to set
     */
    public void setCitizenShipNumber(String CitizenShipNumber) {
        this.CitizenShipNumber = CitizenShipNumber;
    }
    
        
    
    
}
