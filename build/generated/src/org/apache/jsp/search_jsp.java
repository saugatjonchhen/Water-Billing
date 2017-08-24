package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cusinfo.model.CustomerInfo;
import java.util.List;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Page</title>\n");
      out.write("        <link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            List<CustomerInfo> returnList = (List<CustomerInfo>) request.getAttribute("list");
            CustomerInfo mod = (CustomerInfo) request.getAttribute("input"); 
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"CustoInfoSearchController\" method=\"POST\">\n");
      out.write("            First Name:<input type=\"text\" name=\"fname\" value=\"");
if(mod!=null) out.print(mod.getApplicant_fname());
      out.write("\">\n");
      out.write("            Surname:<input type=\"text\" name=\"sname\" value=\"");
if(mod!=null) out.print(mod.getApplicant_lname());
      out.write("\">\n");
      out.write("            Middle Name:<input type=\"text\" name=\"mname\" value=\"");
if(mod!=null) out.print(mod.getApplicant_mname());
      out.write("\">\n");
      out.write("            Customer id:<input type=\"Number\" name=\"Cusid\">\n");
      out.write("            Registered date:<input type=\"Date\" name=\"rdate\">\n");
      out.write("            <input type=\"submit\" name=\"submit\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
if (returnList != null) {
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-top: 50px\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>S.N</th>\n");
      out.write("                        <th>Customer Id</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>mobile no</th>\n");
      out.write("                        <th>Registered Date</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        ");
if (returnList.isEmpty()) {
      out.write("\n");
      out.write("                <h1 style=\"text-align: center\">No data found</h1>\n");
      out.write("                ");
} else {
                    int i = 0;
                    for (CustomerInfo model : returnList) {
                        i++;
      out.write("\n");
      out.write("                <td>");
      out.print(i);
      out.write(" </td>\n");
      out.write("                <td>");
out.println(model.getRegistration_no());
      out.write("</td>\n");
      out.write("                <td>");
 out.println(model.getApplicant_lname()+ ", " + model.getApplicant_fname()+ " " + model.getApplicant_mname());
      out.write("</td>\n");
      out.write("                <td>mob</td>\n");
      out.write("                <td>add </td>\n");
      out.write("                <td>");
 out.println(model.getRegisteredDate());
      out.write(" </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
} //for closing
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");
} }
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
