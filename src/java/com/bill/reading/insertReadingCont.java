/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.reading;

import com.bill.model.Bill;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saroj
 */
public class insertReadingCont extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int reading_input = 0;
            HttpSession session = request.getSession(true);
            try {
                reading_input = Integer.parseInt(request.getParameter("reading_input"));
            } catch (Exception e) {
                response.sendRedirect("insertreading.jsp");
            }

            String tablename = "1a";
            insertreadingDaoo insertDAO = new insertreadingDaoo();

            Boolean msg = false;
//            if (insertDAO.validity_checker(reading_input, tablename)) {
            Double temp = insertDAO.Last_Reading_value(tablename);
            if (reading_input >= temp) {
//                request.setAttribute("validity", validuty);
                Bill bill = new Bill();
                bill.setLast_Reading_Value(reading_input);
                bill.setBill_by("user1");
                bill.setEditble(true);
                bill.setBill_No("");
                bill.setIsUsed(false);
                bill.setInvoice_No("");

                int retval = insertDAO.insertreading(bill,tablename);

                if (retval >= 1) {
                    //successful
                    msg = !msg;
//                    request.setAttribute("Message", msg);
                    session.setAttribute("Message", msg);
                    response.sendRedirect("insertreading.jsp");
//                    JOptionPane.showMessageDialog(null, "database insert sucessfull");
                }
            } else {
                session.setAttribute("Message", msg);
                response.sendRedirect("insertreading.jsp");
            }

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
