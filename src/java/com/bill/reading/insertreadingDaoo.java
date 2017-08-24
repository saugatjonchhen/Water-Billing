/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.reading;

import com.bill.calculator.unit_amt_calculator;
import com.bill.connection.*;
import com.bill.model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Saroj
 */
public class insertreadingDaoo {

    public Double Last_Reading_value(String tablename) {
        Double temp=-1.0;
        try {    
            String Query = "SELECT Last_Reading_Value FROM ";
            Query = Query.concat(tablename);
            Query = Query.concat(" ORDER BY id DESC");
            Connection conn = ConnectionString_bill.connectme();
            PreparedStatement stmt = conn.prepareStatement(Query);
            
             ResultSet rs = stmt.executeQuery();
           
            if (rs.first()) {
                temp = rs.getDouble("Last_Reading_Value");
                System.out.println(temp);
            }
            rs.close();
            conn.close();
            return temp;
        } catch (SQLException e) {
            System.out.println("SWL error1 " + e);
        }
        return temp;
    }
    public Double Last_Balance(String tablename){
        try {    
            Double temp = -1.0;
            String Query = "SELECT Balance FROM ";
            Query = Query.concat(tablename);
            Query = Query.concat(" ORDER BY id DESC");
            Connection conn = ConnectionString_bill.connectme();
            PreparedStatement stmt = conn.prepareStatement(Query);
            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
            if(rs.first()) {
                temp = rs.getDouble("Balance");
            }
            rs.close();
            conn.close();
            return temp;
        } catch (SQLException e) {
            System.out.println("SWL2 error " + e);
        }
        return 0.0;
    }
    public int insertreading(Bill bill, String tablename) {
        int retval = 0;
        try {
            Connection conn = ConnectionString_bill.connectme();
            String query = "insert into ";
            query = query.concat(tablename);
            query = query + " (Bill_No,Last_Reading_Value,Units,Reading_Bill,Balance,Actual_Bill,Invoice_No,Bill_by,Bill_date,isUsed,Editble) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
                insertreadingDaoo iii = new insertreadingDaoo();
                Double Previous_month_reading = iii.Last_Reading_value(tablename);
                
            stmt.setString(1, bill.getBill_No());  //bill_no
            stmt.setDouble(2, bill.getLast_Reading_Value()); // lastreading
            
                Double temp=(bill.getLast_Reading_Value()-Previous_month_reading);
            stmt.setDouble(3,temp); //units
                unit_amt_calculator amt = new unit_amt_calculator();
            Double reading_amt =  amt.calculator(temp);
            stmt.setDouble(4, reading_amt);    //reading_bill_amt
            
             Double Last_balance = iii.Last_Balance(tablename);
            stmt.setDouble(5, (reading_amt+Last_balance));  // balance
            stmt.setDouble(6, (reading_amt+Last_balance)); //actual bill
            
            stmt.setString(7, bill.getInvoice_No());
            stmt.setString(8, bill.getBill_by());
            
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            stmt.setDate(9, java.sql.Date.valueOf(df.format(date))); //bill date
                
            stmt.setBoolean(10, bill.getIsUsed());
               
            stmt.setBoolean(11, bill.getEditble());
            retval = stmt.executeUpdate();
            conn.close();
            return retval;
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return retval;
    }
}