package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer Information Entry</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"CusController\" method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("            CustomerID:\n");
      out.write("            <input type ='text' name='customerid' required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Applicant's First Name:\n");
      out.write("            <input type ='text' name='appFName' required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Applicant's Middle Name:\n");
      out.write("            <input type=\"text\" name=\"appMName\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Applicant's Last Name:\n");
      out.write("            <input type=\"text\" name=\"appLName\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Parent's First Name:\n");
      out.write("            <input type=\"text\" name=\"appPFName\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Parent's Middle Name:\n");
      out.write("            <input type=\"text\" name=\"appPMName\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Parent's Last Name:\n");
      out.write("            <input type=\"text\" name=\"appPLName\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Grand Parent's First Name:\n");
      out.write("            <input type=\"text\" name=\"appGFName\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Grand Parent's Middle Name:\n");
      out.write("            <input type=\"text\" name=\"appGMName\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Grand Parent's Last Name:\n");
      out.write("            <input type=\"text\" name=\"appGLName\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Reason For Installation:\n");
      out.write("<!--            <input type=\"text\" name=\"Reason\">-->\n");
      out.write("            <textarea name='reason' required=\"\"> </textarea>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            No of members:\n");
      out.write("            <input type=\"number\" name=\"noOfMember\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Daily Consumption:\n");
      out.write("            <input type=\"number\" name=\"dConsumption\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Applicant's Photo:\n");
      out.write("            <input type=\"text\" name=\"aPhoto\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Land Owner's Photo:\n");
      out.write("            <input type=\"text\" name=\"lPhoto\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Citizenship Scan Photo:\n");
      out.write("            <input type=\"text\" name=\"cPhoto\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Electricity Bill Receipt:\n");
      out.write("            <input type=\"text\" name=\"billReceipt\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Naxa Pass Certificate:\n");
      out.write("            <input type=\"text\" name=\"certificate\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Address:\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            State:\n");
      out.write("            <input type=\"text\" name=\"state\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            District:\n");
      out.write("            <input type=\"text\" name=\"district\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Municipality:\n");
      out.write("            <input type=\"text\" name=\"municipality\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            Ward_no:\n");
      out.write("            <input type=\"text\" name=\"wardNumber\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            House_No;\n");
      out.write("            <input type=\"text\" name=\"houseNo\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            CharKillInformation:\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            East:\n");
      out.write("            <input type=\"text\" name=\"east\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            West:\n");
      out.write("            <input type=\"text\" name=\"west\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            North:\n");
      out.write("            <input type=\"text\" name=\"north\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            South:\n");
      out.write("            <input type=\"text\" name=\"south\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <input type='submit' value='Submit'>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
