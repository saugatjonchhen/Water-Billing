package com.bill.calculator;

import com.bill.connection.ConnectionString_bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class lastrowIDextractor_billl {
    public int lastrowIDextractor(String tablename){
        int temp = 0;
        try {
            String query = "select id from ";
            query = query.concat(tablename);
            Connection conn = ConnectionString_bill.connectme();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.last()) {
               temp = rs.getInt("id");
            }
            rs.close();
            conn.close();
            return temp;
        } catch (Exception e) {
        }
        return temp;
    }
}