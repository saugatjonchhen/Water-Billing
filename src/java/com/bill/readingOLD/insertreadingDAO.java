/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.readingOLD;

import com.bill.calculator.unit_amt_calculator;
import com.bill.connection.ConnectionString_water_bill_customer;
import com.bill.modelOLD.Customer;
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
public class insertreadingDAO {

    public Double Last_Reading_value(String tablename) {
        Double temp=-1.0;
        try {    
            String Query = "SELECT Last_Reading_Value FROM ";
            Query = Query.concat(tablename);
            Query = Query.concat(" ORDER BY id DESC");
            Connection conn = ConnectionString_water_bill_customer.connectme();
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
            Connection conn = ConnectionString_water_bill_customer.connectme();
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
    public int insertreading(Customer customer, String tablename) {
        int retval = 0;
        try {
            Connection conn = ConnectionString_water_bill_customer.connectme();
            String query = "insert into ";
            query = query.concat(tablename);
            query = query + " (Last_Reading_Value,Units,Read_by,Read_date,Reading_bill_amt,Reading_not_Editing,Reading_bill_actaul_amt,Balance,isBillpaid) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
                insertreadingDAO iii = new insertreadingDAO();
                Double Previous_month_reading = iii.Last_Reading_value(tablename);
            stmt.setDouble(1, customer.getLast_Reading_Value());  //last reading value
            Double temp=(customer.getLast_Reading_Value()-Previous_month_reading);
            stmt.setDouble(2,temp); //units
            stmt.setString(3, customer.getRead_by()); //read by
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            stmt.setDate(4, java.sql.Date.valueOf(df.format(date))); //read date
                unit_amt_calculator amt = new unit_amt_calculator();
            Double reading_amt =  amt.calculator(temp);
            stmt.setDouble(5, reading_amt);    //reading_bill_amt
            stmt.setBoolean(6, false);
                Double Last_balance = iii.Last_Balance(tablename);
            stmt.setDouble(7, (reading_amt+Last_balance));
            stmt.setDouble(8, (reading_amt+Last_balance));
            stmt.setBoolean(9, false);
            retval = stmt.executeUpdate();
            conn.close();
            return retval;
        } catch (SQLException e) {
            System.out.println("SWL error " + e);
        }
        return retval;
    }
}