/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search;

import com.bill.connection.ConnectionString_bill;
import com.cusinfo.model.CustomerInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Saugat
 */
public class searchDAO {
    public List<CustomerInfo> FirstName_Search(String fname, List<CustomerInfo> list) {
        try {
            Connection con = ConnectionString_bill.connectme();
            String sql = "select RegistrationId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,RegisteredDate from customerinfo where ApplicantFName like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, fname);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                CustomerInfo info = new CustomerInfo();
                info.setRegistration_no(rs.getInt("RegistrationId"));
                info.setApplicant_fname(rs.getString("ApplicantFName"));
                info.setApplicant_mname(rs.getString("ApplicantMName"));
                info.setApplicant_lname(rs.getString("ApplicantLName"));
                info.setParents_fname(rs.getString("ParentFName"));
                info.setParents_mname(rs.getString("ParentMName"));
                info.setParents_lname(rs.getString("ParentLName"));
                info.setRegisteredDate(rs.getDate("RegisteredDate"));
                list.add(info);
            }
        } catch (Exception e) {
            System.out.println("query error" + e);
        }
        return list;
    }

    public List<CustomerInfo> MiddleName_Search(String mname, List<CustomerInfo> list) {
        try {
            Connection con = ConnectionString_bill.connectme();
            String sql = "select RegistrationId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,RegisteredDate from customerinfo where ApplicantMName like?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, mname);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
//                System.out.println("Middle Name " + mname + "      " + rs.getString("Surname"));
                CustomerInfo info = new CustomerInfo();
                info.setRegistration_no(rs.getInt("RegistrationId"));
                info.setApplicant_fname(rs.getString("ApplicantFName"));
                info.setApplicant_mname(rs.getString("ApplicantMName"));
                info.setApplicant_lname(rs.getString("ApplicantLName"));
                info.setParents_fname(rs.getString("ParentFName"));
                info.setParents_mname(rs.getString("ParentMName"));
                info.setParents_lname(rs.getString("ParentLName"));
                info.setRegisteredDate(rs.getDate("RegisteredDate"));
                list.add(info);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<CustomerInfo> LastName_Search(String sname, List<CustomerInfo> list) {
        try {
            Connection con = ConnectionString_bill.connectme();
            String sql = "select RegistrationId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,RegisteredDate from customerinfo where ApplicantLName like?";

//            String sql = "select * from customerinfo where ApplicantLName  like?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sname);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                CustomerInfo info = new CustomerInfo();
                info.setRegistration_no(rs.getInt("RegistrationId"));
                info.setApplicant_fname(rs.getString("ApplicantFName"));
                info.setApplicant_mname(rs.getString("ApplicantMName"));
                info.setApplicant_lname(rs.getString("ApplicantLName"));
                info.setParents_fname(rs.getString("ParentFName"));
                info.setParents_mname(rs.getString("ParentMName"));
                info.setParents_lname(rs.getString("ParentLName"));
                info.setRegisteredDate(rs.getDate("RegisteredDate"));
                list.add(info);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<CustomerInfo> Date_Search(Date Search_date, List<CustomerInfo> list) {
        try {
            Connection con = ConnectionString_bill.connectme();
            String sql = "select RegistrationId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,RegisteredDate from customerinfo where Registered_date =?";

//            String sql = "select * from customerinfo where Registered_date =?";
            PreparedStatement pst = con.prepareStatement(sql);
            java.sql.Date sqlStartDate = new java.sql.Date(Search_date.getTime());
            pst.setDate(1, sqlStartDate);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
//                System.out.println( Search_date + "      " + rs.getString("First_Name"));
                CustomerInfo info = new CustomerInfo();
                info.setRegistration_no(rs.getInt("RegistrationId"));
                info.setApplicant_fname(rs.getString("ApplicantFName"));
                info.setApplicant_mname(rs.getString("ApplicantMName"));
                info.setApplicant_lname(rs.getString("ApplicantLName"));
                info.setParents_fname(rs.getString("ParentFName"));
                info.setParents_mname(rs.getString("ParentMName"));
                info.setParents_lname(rs.getString("ParentLName"));
                info.setRegisteredDate(rs.getDate("RegisteredDate"));
                list.add(info);
            }
        } catch (Exception e) {
            System.out.println("err" + e);
        }
        return list;
    }

    public List<CustomerInfo> CusID_Search(int CusId, List<CustomerInfo> list) {
        try {
            Connection con = ConnectionString_bill.connectme();
//            String sql = "select * from customerinfo where CustomerId =?";
            String sql = "select RegistrationId,ApplicantFName,ApplicantMName,ApplicantLName,ParentFName,ParentMName,ParentLName,RegisteredDate from customerinfo where RegistrationId =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, CusId);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                CustomerInfo info = new CustomerInfo();
                info.setRegistration_no(rs.getInt("RegistrationId"));
                info.setApplicant_fname(rs.getString("ApplicantFName"));
                info.setApplicant_mname(rs.getString("ApplicantMName"));
                info.setApplicant_lname(rs.getString("ApplicantLName"));
                info.setParents_fname(rs.getString("ParentFName"));
                info.setParents_mname(rs.getString("ParentMName"));
                info.setParents_lname(rs.getString("ParentLName"));
                info.setRegisteredDate(rs.getDate("RegisteredDate"));
                
                list.add(info);
            }
        } catch (Exception e) {
            System.out.println("dfasd"+e);
        }
        return list;
    }
}
