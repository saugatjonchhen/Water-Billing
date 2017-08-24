/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.dao;

import com.bill.connection.ConnectionString_bill;
import com.cusinfo.model.CustomerInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saugat
 */
public class customerDAO {

    public void insertnewCusInfo(CustomerInfo cusinfo) {
        try {
            Connection con = ConnectionString_bill.connectme();
            String qry = "INSERT INTO customerinfo(CustomerId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,GrandParentFName,GrandParentMName,GrandParentLName,ReasonForInstallation,NoOfMembers,DailyConsumption,ApplicantPhoto,LandOwnerPhoto,CitizenshipScanPhoto,ElectricityBillReceipt,NaxaPassCertifiacte,RegisteredDate,RegisteredBy,MobileNumber,CitizenShipNumber) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, cusinfo.getCustomerId());
            pst.setString(2, cusinfo.getApplicant_fname());
            pst.setString(3, cusinfo.getApplicant_mname());
            pst.setString(4, cusinfo.getApplicant_lname());
            pst.setString(5, cusinfo.getParents_fname());
            pst.setString(6, cusinfo.getParents_mname());
            pst.setString(7, cusinfo.getParents_lname());
            pst.setString(8, cusinfo.getGrand_parent_fname());
            pst.setString(9, cusinfo.getGrand_parent_mname());
            pst.setString(10, cusinfo.getGrand_parent_lname());
            pst.setString(11, cusinfo.getReason_for_installation());
            pst.setInt(12, cusinfo.getNo_of_members());
            pst.setInt(13, cusinfo.getDaily_Consumption());
            pst.setString(14, cusinfo.getApplicant_Photo());
            pst.setString(15, cusinfo.getLand_Owner_Photo());
            pst.setString(16, cusinfo.getCitizenship_Scan_Certificate());
            pst.setString(17, cusinfo.getElectricity_Bill_Reciept());
            pst.setString(18, cusinfo.getNaxa_Pass_Certificate());
            pst.setDate(19, (java.sql.Date)cusinfo.getRegisteredDate());
            pst.setString(20, "Saugat");
            pst.setString(21, cusinfo.getMobileNo());
            pst.setString(22, cusinfo.getCitizenShipNumber());
            pst.execute();
            con.close();
        } catch (Exception e) {
            System.out.println("error " + e);

            e.printStackTrace();
        }
    }

    public List<CustomerInfo> getMemberInfo() {
        try {
            List<CustomerInfo> customer = new ArrayList<CustomerInfo>();
            Connection con = ConnectionString_bill.connectme();
            String qry = "Select * from customerinfo";
            PreparedStatement pst = con.prepareStatement(qry);
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                i++;
                CustomerInfo m = new CustomerInfo();
                m.setRegistration_no(rs.getInt("RegistrationId"));
                m.setCustomerId(rs.getString("CustomerId"));
                m.setApplicant_fname(rs.getString("ApplicantFName"));
                m.setApplicant_mname(rs.getString("ApplicantMName"));
                m.setApplicant_lname(rs.getString("ApplicantLName"));
                m.setParents_fname(rs.getString("ParentFName"));
                m.setParents_mname(rs.getString("ParentMName"));
                m.setParents_lname(rs.getString("ParentLName"));
                m.setGrand_parent_fname(rs.getString("GrandParentFName"));
                m.setGrand_parent_mname(rs.getString("GrandParentMName"));
                m.setGrand_parent_lname(rs.getString("GrandParentLName"));
                m.setReason_for_installation(rs.getString("ReasonForInstallation"));
                m.setNo_of_members(rs.getInt("NoOfMembers"));
                m.setRegistration_no(rs.getInt("DailyConsumption"));
                m.setApplicant_Photo(rs.getString("ApplicantPhoto"));
                m.setCitizenship_Scan_Certificate(rs.getString("CitizenshipScanPhoto"));
                m.setLand_Owner_Photo(rs.getString("LandOwnerPhoto"));
                m.setElectricity_Bill_Reciept(rs.getString("ElectricityBillReceipt"));
                m.setNaxa_Pass_Certificate(rs.getString("NaxaPassCertifiacte"));
                m.setMobileNo("MobileNumber");
                m.setCitizenShipNumber("CitizenShipNumber");
                //System.out.println(i);
                customer.add(m);
            }
            System.out.println(i);
            con.close();
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
