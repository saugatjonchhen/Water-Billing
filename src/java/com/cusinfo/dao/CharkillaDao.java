/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.dao;

import com.bill.connection.ConnectionString_bill;
import com.cusinfo.model.AddressInfo;
import com.cusinfo.model.CharKillaInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saugat
 */
public class CharkillaDao {
    public void insertnewCKInfo(CharKillaInfo charkillainfo){
            try{
            Connection con=ConnectionString_bill.connectme();
            String qry="INSERT INTO `CharKilla`(`CustomerId`, `East`, `West`, `North`, `South`) VALUES (?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,charkillainfo.getCustomerId());
            pst.setString(2,charkillainfo.getEast());
            pst.setString(3,charkillainfo.getWest());
            pst.setString(4,charkillainfo.getNorth());
            pst.setString(5,charkillainfo.getSouth());
            pst.execute();
            con.close();
        }catch(Exception e){
                            System.out.println("error " +e);

            e.printStackTrace();
        }
        }
    
    public List<CharKillaInfo> getMemberCKInfo(){
        try{
            List<CharKillaInfo> cusCKInfo=new ArrayList<CharKillaInfo>();
            Connection con=ConnectionString_bill.connectme();
            String qry="Select * from charkilla";
            PreparedStatement pst= con.prepareStatement(qry);
            ResultSet rs=pst.executeQuery();
            int i=0;
            while(rs.next()){
                i++;
                CharKillaInfo m =new CharKillaInfo();
                m.setCustomerId(rs.getString("CustomerId"));
                m.setEast(rs.getString("East"));
                m.setWest(rs.getString("West"));
                m.setNorth(rs.getString("North"));
                m.setSouth(rs.getString("South"));
                //System.out.println(i);
                cusCKInfo.add(m);
            }
            System.out.println(i);
            con.close();
            return cusCKInfo;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
}

    
}
