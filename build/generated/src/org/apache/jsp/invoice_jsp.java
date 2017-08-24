package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bill.calculator.YearMonth_Name_extractor;
import com.bill.model.invoice;
import java.util.ArrayList;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        Boolean found_id = (Boolean) session.getAttribute("found_id");
        ArrayList<invoice> lis = (ArrayList) session.getAttribute("cList");
        int temp=-5;
        String btn="";
        if(found_id==null && lis == null){
            temp=1;
            btn="Check";
        }
        else  if(found_id==false){
            temp=2; //try again
            btn="Search - Again";
        }
        else if(found_id==true && lis.isEmpty()){
            temp=3; //try agains
            btn="No - Data";
        }
        else{
            temp=4;
            btn = "Pay - Bill";
        }
        YearMonth_Name_extractor yr = new YearMonth_Name_extractor();
        Double netAmt=0.0;
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
if(temp == 1 ||temp == 2){
      out.write("\n");
      out.write("        <h1>Enter Customer id</h1>\n");
      out.write("        <form action=\"invoiceController\" method=\"post\">\n");
      out.write("        <input type=\"text\" value=\"1a\" name=\"Cus_id\">\n");
      out.write("        <button type=\"submit\" value=\"");
out.println(temp);
      out.write("\">Check</button>\n");
      out.write("        </form>\n");
      out.write("        ");
}else if(temp==3){
      out.write("\n");
      out.write("        <h1>No Bills</h1>\n");
      out.write("        ");
}else{
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Bill Amt</th>\n");
      out.write("                <th>Dsc/Fine</th>\n");
      out.write("                <th>Upto</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
for(invoice in: lis){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");
 Double temp1= in.getBill_amt();
      out.write("\n");
      out.write("                <td><input type=\"Number\" name=\"bill_amt\" readonly=\"\" value=\"");
      out.print(temp1);
      out.write("\"></td>\n");
      out.write("                <td>");
if(in.getFine()>0)out.println("+"); else out.println("-");
      out.write("\n");
      out.write("                    ");
 out.print(in.getFine()+in.getDiscount());
      out.write("</td>\n");
      out.write("                <td>");
 out.println(yr.YearMonth_Name_extractor(in.getInvoice_date()));
      out.write("</td>\n");
      out.write("                ");
netAmt=netAmt+in.getBill_amt()+in.getFine()-in.getDiscount();
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" style=\"text-align: right\">Total</td>\n");
      out.write("                <td>");
      out.print(netAmt);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <button name=\"PayBill\" value=\"");
out.println(temp);
      out.write('"');
      out.write('>');
      out.print(btn);
      out.write("</button>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
