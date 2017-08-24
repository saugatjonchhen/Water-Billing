package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cusinfo.model.CharKillaInfo;
import com.cusinfo.model.AddressInfo;
import java.util.ArrayList;
import java.util.List;
import com.cusinfo.model.CustomerInfo;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>User Details</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>CustomerID:</th>\n");
      out.write("                <th>Applicant's First Name:</th>\n");
      out.write("                <th>Applicant's Middle Name:</th>\n");
      out.write("                <th>Applicant's Last Name:</th>\n");
      out.write("                <th>Parent's First Name:</th>\n");
      out.write("                <th>Parent's Middle Name:</th>\n");
      out.write("                <th>Parent's Last Name:</th>\n");
      out.write("                <th>Grand Parent's First Name:</th>\n");
      out.write("                <th>Grand Parent's Middle Name:</th>\n");
      out.write("                <th>Grand Parent's Last Name:</th>\n");
      out.write("                <th>Mobile Number</th>\n");
      out.write("                <th>CitizenShip Number</th>\n");
      out.write("                <th>Reason For Installation:</th>\n");
      out.write("                <th>No of members:</th>\n");
      out.write("                <th>Daily Consumption:</th>\n");
      out.write("                <th>Applicant's Photo:</th>\n");
      out.write("                <th>Land Owner's Photo:</th>\n");
      out.write("                <th>Citizenship Scan Photo:</th>\n");
      out.write("                <th>Electricity Bill Receipt:</th>\n");
      out.write("                <th>Naxa Pass Certificate:</th>\n");
      out.write("                <th>Registered Date</th>\n");
      out.write("                <th>Registered By</th>\n");
      out.write("                <th>State</th>\n");
      out.write("                <th>District</th>\n");
      out.write("                <th>Municipality</th>\n");
      out.write("                <th>Ward No</th>\n");
      out.write("                <th>House No</th>\n");
      out.write("                <th>East</th>\n");
      out.write("                <th>West</th>\n");
      out.write("                <th>North</th>\n");
      out.write("                <th>South</th>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            ");

                List<CustomerInfo> cuslist= (ArrayList) request.getAttribute("cList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(CustomerInfo customer :cuslist){
                      
      out.write("\n");
      out.write("                      \n");
      out.write("                          <td>");
      out.print(customer.getCustomerId());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getApplicant_fname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getApplicant_mname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getApplicant_lname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getParents_fname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getParents_mname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getParents_lname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getGrand_parent_fname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getGrand_parent_mname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getGrand_parent_lname());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getMobileNo());
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(customer.getCitizenShipNumber());
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(customer.getReason_for_installation());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getNo_of_members());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getDaily_Consumption());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getApplicant_Photo());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getLand_Owner_Photo());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getCitizenship_Scan_Certificate());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getElectricity_Bill_Reciept());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getNaxa_Pass_Certificate());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getRegisteredDate());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(customer.getRegisteredBy());
      out.write(" </td>\n");
      out.write("                      \n");
      out.write("                      ");
 
                    }
                }
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                List<AddressInfo> addlist= (ArrayList) request.getAttribute("aList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(AddressInfo address :addlist){
                      
      out.write("\n");
      out.write("                      \n");
      out.write("                          <td>");
      out.print(address.getState());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(address.getDistrict());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(address.getMunicipality());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(address.getWard_no());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(address.getHouse_no());
      out.write(" </td>\n");
      out.write("                      \n");
      out.write("                      ");
 
                    }
                }
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                List<CharKillaInfo> cklist= (ArrayList) request.getAttribute("ckList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(CharKillaInfo ckinfo :cklist){
                      
      out.write("\n");
      out.write("                      \n");
      out.write("                          <td>");
      out.print(ckinfo.getEast());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(ckinfo.getWest());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(ckinfo.getNorth());
      out.write(" </td>\n");
      out.write("                          <td>");
      out.print(ckinfo.getSouth());
      out.write(" </td>\n");
      out.write("                      \n");
      out.write("                      ");
 
                    }
                }
                
      out.write("\n");
      out.write("                <tr />\n");
      out.write("               </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
