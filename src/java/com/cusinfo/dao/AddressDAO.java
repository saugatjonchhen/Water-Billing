/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.dao;

import com.bill.connection.ConnectionString_bill;
import com.cusinfo.model.AddressInfo;
import com.cusinfo.model.CustomerInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saugat
 */
public class AddressDAO {
    
    public void insertnewAddInfo(AddressInfo addinfo){
            try{
            Connection con=ConnectionString_bill.connectme();
            String qry="INSERT INTO Address(CustomerId,State,District,Municipality,WardNumber,HouseNumber) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,addinfo.getCustomerId());
            pst.setString(2,addinfo.getState());
            pst.setString(3,addinfo.getDistrict());
            pst.setString(4,addinfo.getMunicipality());
            pst.setString(5,addinfo.getWard_no());
            pst.setString(6,addinfo.getHouse_no());
            pst.execute();
            con.close();
        }catch(Exception e){
                            System.out.println("error " +e);

            e.printStackTrace();
        }
        }
    
    public List<AddressInfo> getMemberAddInfo(){
        try{
            List<AddressInfo> cusAdd=new ArrayList<AddressInfo>();
            Connection con=ConnectionString_bill.connectme();
            String qry="Select * from address";
            PreparedStatement pst= con.prepareStatement(qry);
            ResultSet rs=pst.executeQuery();
            int i=0;
            while(rs.next()){
                i++;
                AddressInfo m =new AddressInfo();
                m.setCustomerId(rs.getString("CustomerId"));
                m.setState(rs.getString("State"));
                m.setDistrict(rs.getString("District"));
                m.setMunicipality(rs.getString("Municipality"));
                m.setWard_no(rs.getString("WardNumber"));
                m.setHouse_no(rs.getString("HouseNumber"));
                //System.out.println(i);
                cusAdd.add(m);
            }
            System.out.println(i);
            con.close();
            return cusAdd;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
}
    
}
