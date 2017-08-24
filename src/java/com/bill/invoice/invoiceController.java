/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.invoice;

import com.bill.calculator.discount_calculator;
import com.bill.calculator.fine_calculator;
import com.bill.model.Bill;
import com.bill.model.invoice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saroj
 */
public class invoiceController extends HttpServlet {

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
            Boolean found_id = true;
            invoiceDAO inDAO = new invoiceDAO();
            ArrayList<Bill> RemainingList = inDAO.get_bills("1a");
            Double select_last_balance_from_paid = inDAO.select_last_balance_from_paid("1a");

            ArrayList<invoice> bill_List = new ArrayList();
            if (!RemainingList.isEmpty()) {
                int i = 0;Date d; discount_calculator dsc = new discount_calculator();
            fine_calculator fine = new fine_calculator();
                for (Bill b : RemainingList) {
                    invoice invoic = new invoice();
                    invoic.setBill_amt(b.getReading_Bill());
                    if ((select_last_balance_from_paid <= 0) && (i == 0)) {
                        invoic.setBill_amt(b.getReading_Bill() + select_last_balance_from_paid);
                    }
                    i++;
                    invoic.setBill_id(b.getId());
                    invoic.setInvoice_date(b.getBill_date());
                     d= b.getBill_date();
                invoic.setDiscount(dsc.calculate_disc(invoic.getBill_amt(), d));
                invoic.setFine(fine.calculate_fine(invoic.getBill_amt(), d));
                    bill_List.add(invoic);
                }
            }
            System.out.println(bill_List.size());
            HttpSession session = request.getSession(true);
            session.setAttribute("cList", bill_List);
            session.setAttribute("found_id", found_id);
            response.sendRedirect("invoice.jsp");
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
