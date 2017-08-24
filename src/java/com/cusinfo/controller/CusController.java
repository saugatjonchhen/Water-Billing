/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusinfo.controller;

import com.cusinfo.dao.AddressDAO;
import com.cusinfo.dao.CharkillaDao;
import com.cusinfo.dao.customerDAO;
import com.cusinfo.model.AddressInfo;
import com.cusinfo.model.CharKillaInfo;
import com.cusinfo.model.CustomerInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class CusController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String CustomerId = request.getParameter("customerid");
            String applicant_fname = request.getParameter("appFName");
            String applicant_mname = request.getParameter("appMName");
            String applicant_lname = request.getParameter("appLName");
            String parent_fname = request.getParameter("appPFName");
            String parent_mname = request.getParameter("appPMName");
            String parent_lname = request.getParameter("appPLName");
            String grand_parent_fname = request.getParameter("appGFName");
            String grand_parent_mname = request.getParameter("appGMName");
            String grand_parent_lname = request.getParameter("appGLName");
            String reason_for_instalation=request.getParameter("reason");
            String no_of_member=request.getParameter("noOfMember");
            String daily_consumption=request.getParameter("dConsumption");
            String applicants_photo=request.getParameter("aPhoto");
            String land_owners_photo=request.getParameter("lPhoto");
            String citizenship_scan_photo=request.getParameter("cPhoto");
            String billReceipt=request.getParameter("billReceipt");
            String naxa_pass_certificate=request.getParameter("certificate");
            String add_state = request.getParameter("state");
            String add_district = request.getParameter("district");
            String add_municipality = request.getParameter("municipality");
            String add_ward_no = request.getParameter("wardNumber");
            String add_house_no = request.getParameter("houseNo");
            String east = request.getParameter("east");
            String west = request.getParameter("west");
            String north = request.getParameter("north");
            String south = request.getParameter("south");
            String MobileNo = request.getParameter("mobNo");
            String CitizenshipNumber = request.getParameter("CitizenShipNo");
            
            java.util.Date date = new java.util.Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            date = java.sql.Date.valueOf(df.format(date));
            
            AddressInfo addinfo = new AddressInfo();
            addinfo.setCustomerId(CustomerId);
            addinfo.setState(add_state);
            addinfo.setDistrict(add_district);
            addinfo.setHouse_no(add_house_no);
            addinfo.setMunicipality(add_municipality);
            addinfo.setWard_no(add_ward_no);
            
            CharKillaInfo charkilla = new CharKillaInfo();
            charkilla.setCustomerId(CustomerId);
            charkilla.setEast(east);
            charkilla.setWest(west);
            charkilla.setNorth(north);
            charkilla.setSouth(south);
            
            CustomerInfo cusinfo = new CustomerInfo();
            cusinfo.setAddress(addinfo);
            cusinfo.setCharkilla(charkilla);
            cusinfo.setCustomerId(CustomerId);
            cusinfo.setApplicant_fname(applicant_fname);
            cusinfo.setApplicant_mname(applicant_mname);
            cusinfo.setApplicant_lname(applicant_lname);
            cusinfo.setParents_fname(parent_fname);
            cusinfo.setParents_mname(parent_mname);
            cusinfo.setParents_lname(parent_lname);
            cusinfo.setGrand_parent_fname(grand_parent_fname);
            cusinfo.setGrand_parent_mname(grand_parent_mname);
            cusinfo.setGrand_parent_lname(grand_parent_lname);
            cusinfo.setApplicant_Photo(applicants_photo);
            cusinfo.setNaxa_Pass_Certificate(naxa_pass_certificate);
            cusinfo.setCitizenship_Scan_Certificate(citizenship_scan_photo);
            cusinfo.setLand_Owner_Photo(land_owners_photo);
            
            cusinfo.setNo_of_members(Integer.parseInt(no_of_member));
            cusinfo.setReason_for_installation(reason_for_instalation);
            cusinfo.setDaily_Consumption(Integer.parseInt(daily_consumption));
            cusinfo.setElectricity_Bill_Reciept(billReceipt);
            
            cusinfo.setRegisteredDate(date);
            
            cusinfo.setMobileNo(MobileNo);
            cusinfo.setCitizenShipNumber(CitizenshipNumber);
            
            customerDAO cusDao = new customerDAO();
            cusDao.insertnewCusInfo(cusinfo);
            
            AddressDAO addDao = new AddressDAO();
            addDao.insertnewAddInfo(addinfo);
            
            CharkillaDao chkDao = new CharkillaDao();
            chkDao.insertnewCKInfo(charkilla);
            
            List<CustomerInfo> cus= cusDao.getMemberInfo();
            request.setAttribute("cList",cus);
            List<AddressInfo> add= addDao.getMemberAddInfo();
            request.setAttribute("aList",add);
            List<CharKillaInfo> ckinfo= chkDao.getMemberCKInfo();
            request.setAttribute("ckList",ckinfo);
            RequestDispatcher rd= request.getRequestDispatcher("ViewAllRecords.jsp");
            rd.forward(request, response);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
