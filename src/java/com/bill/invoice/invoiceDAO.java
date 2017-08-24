package com.bill.invoice;

import com.bill.connection.ConnectionString_bill;
import com.bill.model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class invoiceDAO {

    public Double select_last_balance_from_paid(String tablename) {
        Double temp = -1.0;
        try {
            String query = "select Balance from ";
            query = query.concat(tablename);
            query = query + " where isUsed =? ORDER BY id DESC";
            Connection conn = ConnectionString_bill.connectme();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setBoolean(1, true);
            ResultSet rs = stmt.executeQuery();
            if (rs.first()) {
                temp = rs.getDouble("Balance");
            }
            rs.close();
            conn.close();
            //System.out.println(temp);// temp;
            return temp;
        } catch (Exception e) {
        }
        return 0.0;
    }

    public ArrayList<Bill> get_bills(String tablename) {
        ArrayList<Bill> arrList = new ArrayList();
        try {
            Connection con = ConnectionString_bill.connectme();
            String query = "select id,Bill_No,Last_Reading_Value,Reading_Bill,Balance,Bill_date from ";
            query = query.concat(tablename);
            query = query + " where isUsed =? ORDER BY id";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBoolean(1, false);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Bill bil = new Bill();
                bil.setId(rs.getInt("id"));
                bil.setBill_No(rs.getString("Bill_No"));
                bil.setLast_Reading_Value(rs.getDouble("Last_Reading_Value"));
                bil.setReading_Bill(rs.getDouble("Reading_Bill"));
                bil.setBalance(rs.getDouble("Balance"));
                bil.setBill_date(rs.getDate("Bill_date"));
                arrList.add(bil);
            }
            return arrList;
        } catch (SQLException e) {
            System.out.println("get bills errror");
        }
        return arrList;
    }
}
