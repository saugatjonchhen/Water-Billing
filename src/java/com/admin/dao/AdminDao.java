/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.dao;

import com.admin.model.AdminLogin;
import com.bill.connection.ConnectionString_bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Saugat
 */
public class AdminDao {
    
    public AdminLogin ValidAdmin(AdminLogin admin){
        try{
            Connection con=ConnectionString_bill.connectme();
            String qry="Select * from adminlogin where UserName=? and Password=?";
            PreparedStatement pst= con.prepareStatement(qry);
            pst.setString(1, admin.getUserName());
            pst.setString(2, admin.getPassword());
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                AdminLogin admins=new AdminLogin();
                admins.setUseId(rs.getInt("UserId"));
                admins.setUserName(rs.getString("UserName"));
                admins.setPassword(rs.getString("Password"));
                return admins;
            }
        }catch(Exception e){
            System.out.println("error " +e);
            e.printStackTrace();
        }
      return null;  
    }
    
    public void insertNewAdmin(AdminLogin admin){
            try{
            Connection con=ConnectionString_bill.connectme();
            String qry="insert into adminlogin(UserName,Password) values(?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,admin.getUserName());
            pst.setString(2,admin.getPassword());
            pst.execute();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    
}
