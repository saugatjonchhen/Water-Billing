/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.dao;

import com.admin.model.AdminLogin;
import com.admin.model.AdminRegister;
import com.bill.connection.ConnectionString_bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Saugat
 */
public class AdminRegDao {
    
    public void insertNewAdminReg (AdminRegister admin){
            try{
            Connection con=ConnectionString_bill.connectme();
            String qry="insert into adminregister(FirstName,LastName,Email,Contact,Gender) values(?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,admin.getFirstName());
            pst.setString(2,admin.getLastName());
            pst.setString(3,admin.geteMail());
            pst.setString(4,admin.getContactNo());
            pst.setString(5,admin.getGender());
            pst.execute();
            con.close();
        }catch(Exception e){
           
                System.out.println("error "+e);
                 e.printStackTrace();
        }
        }
    
}
