package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Administrator Login</title>\n");
      out.write("        <meta name=\"keywords\" content=\"HTML5, Bootstrap 3, Admin Template, UI Theme\"/>\n");
      out.write("        <meta name=\"description\" content=\"AdminK - A Responsive HTML5 Admin UI Framework\">\n");
      out.write("        <meta name=\"author\" content=\"ThemeREX\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.png\">\n");
      out.write("\n");
      out.write("        <!-- Angular material -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/skin/css/angular-material.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Icomoon -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fonts/icomoon/icomoon.css\">    \n");
      out.write("\n");
      out.write("        <!-- AnimatedSVGIcons -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fonts/animatedsvgicons/css/codropsicons.css\">\n");
      out.write("\n");
      out.write("        <!-- CSS - allcp forms -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/allcp/forms/css/forms.css\">\n");
      out.write("\n");
      out.write("        <!-- Plugins -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/js/utility/malihu-custom-scrollbar-plugin-master/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\n");
      out.write("        <!-- CSS - theme -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/skin/default_skin/less/theme.css\">\n");
      out.write("\n");
      out.write("        <!-- IE8 HTML5 support -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>      \n");
      out.write("    <body class=\"utility-page sb-l-c sb-r-c\">\n");
      out.write("        <!-- Body Wrap -->\n");
      out.write("        <div id=\"main\" class=\"animated fadeIn\">\n");
      out.write("\n");
      out.write("            <!-- Main Wrapper -->\n");
      out.write("            <section id=\"content_wrapper\">\n");
      out.write("\n");
      out.write("                <div id=\"canvas-wrapper\">\n");
      out.write("                    <canvas id=\"demo-canvas\"></canvas>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Content -->\n");
      out.write("                <section id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Login Form -->\n");
      out.write("                    <div class=\"allcp-form theme-primary mw320\" id=\"login\">\n");
      out.write("                        <div class=\"bg-primary mw600 text-center mb20 br3 pt15 pb10\">\n");
      out.write("                            <!--<img src=\"assets/img/logo.png\" alt=\"\"/>-->\n");
      out.write("                            Water Billing Login\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel mw320\">\n");
      out.write("\n");
      out.write("                            <form method=\"post\" action=\"AdminController\" id=\"form-login\">\n");
      out.write("                                <div class=\"panel-body pn mv10\">\n");
      out.write("\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <label for=\"username\" class=\"field prepend-icon\">\n");
      out.write("                                            <input type=\"text\" name=\"uName\" id=\"username\" class=\"gui-input\"\n");
      out.write("                                                   placeholder=\"Username\">\n");
      out.write("                                            <span class=\"field-icon\">\n");
      out.write("                                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /section -->\n");
      out.write("\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <label for=\"password\" class=\"field prepend-icon\">\n");
      out.write("                                            <input type=\"text\" name=\"pass\" id=\"password\" class=\"gui-input\"\n");
      out.write("                                                   placeholder=\"Password\">\n");
      out.write("                                            <span class=\"field-icon\">\n");
      out.write("                                                <i class=\"fa fa-lock\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /section -->\n");
      out.write("\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"bs-component pull-left pt5\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <a href=\"Register.jsp\" >Register New User?</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-bordered btn-primary pull-right\">Log in</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /section -->\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Form -->\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /Panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /Spec Form -->\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- /Content -->\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!-- /Main Wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /Body Wrap  -->\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"assets/js/jquery/jquery-1.12.3.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery/jquery_ui/jquery-ui.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- AnimatedSVGIcons -->\n");
      out.write("        <script src=\"assets/fonts/animatedsvgicons/js/snap.svg-min.js\"></script>\n");
      out.write("        <script src=\"assets/fonts/animatedsvgicons/js/svgicons-config.js\"></script>\n");
      out.write("        <script src=\"assets/fonts/animatedsvgicons/js/svgicons.js\"></script>\n");
      out.write("        <script src=\"assets/fonts/animatedsvgicons/js/svgicons-init.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Scroll -->\n");
      out.write("        <script src=\"assets/js/utility/malihu-custom-scrollbar-plugin-master/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Mixitup -->\n");
      out.write("\n");
      out.write("        <!-- Summernote -->\n");
      out.write("\n");
      out.write("        <!-- HighCharts Plugin -->\n");
      out.write("        <script src=\"assets/js/plugins/highcharts/highcharts.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Highlight JS -->\n");
      out.write("\n");
      out.write("        <!-- Date/Month - Pickers -->\n");
      out.write("\n");
      out.write("        <!-- Magnific Popup Plugin -->\n");
      out.write("\n");
      out.write("        <!-- FullCalendar Plugin -->\n");
      out.write("\n");
      out.write("        <!-- Plugins -->\n");
      out.write("\n");
      out.write("        <!-- Google Map API -->\n");
      out.write("\n");
      out.write("        <!-- Jvectormap JS -->\n");
      out.write("\n");
      out.write("        <!-- Datatables JS -->\n");
      out.write("\n");
      out.write("        <!-- FooTable JS -->\n");
      out.write("\n");
      out.write("        <!-- Validate JS -->\n");
      out.write("\n");
      out.write("        <!-- BS Dual Listbox JS -->\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Maxlength JS -->\n");
      out.write("\n");
      out.write("        <!-- Select2 JS -->\n");
      out.write("\n");
      out.write("        <!-- Typeahead JS -->\n");
      out.write("\n");
      out.write("        <!-- TagManager JS -->\n");
      out.write("\n");
      out.write("        <!-- DateRange JS -->\n");
      out.write("\n");
      out.write("        <!-- BS Colorpicker JS -->\n");
      out.write("\n");
      out.write("        <!-- MaskedInput JS -->\n");
      out.write("       \n");
      out.write("       <!-- Slick Slider JS -->\n");
      out.write("\n");
      out.write("        <!-- MarkDown JS -->\n");
      out.write("\n");
      out.write("        <!-- X-edit CSS -->\n");
      out.write("\n");
      out.write("        <!-- Dropzone JS -->\n");
      out.write("\n");
      out.write("        <!-- Cropper JS -->\n");
      out.write("\n");
      out.write("        <!-- Zoom JS -->\n");
      out.write("\n");
      out.write("        <!-- Nestable JS -->\n");
      out.write("\n");
      out.write("        <!-- PNotify JS -->\n");
      out.write("\n");
      out.write("        <!-- Fancytree JSs -->\n");
      out.write("\n");
      out.write("        <!-- Ladda JS -->\n");
      out.write("\n");
      out.write("        <!-- NProgress JS -->\n");
      out.write("\n");
      out.write("        <!-- Countdown JS -->\n");
      out.write("        \n");
      out.write("        <!-- CanvasBG JS -->\n");
      out.write("        <script src=\"assets/js/plugins/canvasbg/canvasbg.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Theme Scripts -->\n");
      out.write("        <script src=\"assets/js/utility/utility.js\"></script>\n");
      out.write("        <script src=\"assets/js/demo/demo.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("        <script src=\"assets/js/demo/widgets_sidebar.js\"></script>\n");
      out.write("        <!--<script src=\"assets/js/pages/dashboard_init.js\"></script>-->\n");
      out.write("\n");
      out.write("        <!-- /Scripts -->\n");
      out.write("\n");
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
