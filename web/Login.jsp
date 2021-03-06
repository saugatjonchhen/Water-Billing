<%-- 
    Document   : Login
    Created on : Aug 22, 2017, 1:55:43 PM
    Author     : Saugat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Login</title>
        <meta name="keywords" content="HTML5, Bootstrap 3, Admin Template, UI Theme"/>
        <meta name="description" content="AdminK - A Responsive HTML5 Admin UI Framework">
        <meta name="author" content="ThemeREX">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Favicon -->
        <link rel="shortcut icon" href="assets/img/favicon.png">

        <!-- Angular material -->
        <link rel="stylesheet" type="text/css" href="assets/skin/css/angular-material.min.css">

        <!-- Icomoon -->
        <link rel="stylesheet" type="text/css" href="assets/fonts/icomoon/icomoon.css">    

        <!-- AnimatedSVGIcons -->
        <link rel="stylesheet" type="text/css" href="assets/fonts/animatedsvgicons/css/codropsicons.css">

        <!-- CSS - allcp forms -->
        <link rel="stylesheet" type="text/css" href="assets/allcp/forms/css/forms.css">

        <!-- Plugins -->
        <link rel="stylesheet" type="text/css" href="assets/js/utility/malihu-custom-scrollbar-plugin-master/jquery.mCustomScrollbar.min.css">

        <!-- CSS - theme -->
        <link rel="stylesheet" type="text/css" href="assets/skin/default_skin/less/theme.css">

        <!-- IE8 HTML5 support -->
        <!--[if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>      
    <body class="utility-page sb-l-c sb-r-c">
        <!-- Body Wrap -->
        <div id="main" class="animated fadeIn">

            <!-- Main Wrapper -->
            <section id="content_wrapper">

                <div id="canvas-wrapper">
                    <canvas id="demo-canvas"></canvas>
                </div>

                <!-- Content -->
                <section id="content">

                    <!-- Login Form -->
                    <div class="allcp-form theme-primary mw320" id="login">
                        <div class="bg-primary mw600 text-center mb20 br3 pt15 pb10">
                            <!--<img src="assets/img/logo.png" alt=""/>-->
                            Water Billing Login
                        </div>
                        <div class="panel mw320">

                            <form method="post" action="AdminController" id="form-login">
                                <div class="panel-body pn mv10">

                                    <div class="section">
                                        <label for="username" class="field prepend-icon">
                                            <input type="text" name="uName" id="username" class="gui-input"
                                                   placeholder="Username">
                                            <span class="field-icon">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->

                                    <div class="section">
                                        <label for="password" class="field prepend-icon">
                                            <input type="text" name="pass" id="password" class="gui-input"
                                                   placeholder="Password">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->

                                    <div class="section">
                                        <div class="bs-component pull-left pt5">
                                            <div>
                                                <a href="Register.jsp" >Register New User?</a>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-bordered btn-primary pull-right">Log in</button>
                                    </div>
                                    <!-- /section -->

                                </div>
                                <!-- /Form -->
                            </form>
                        </div>
                        <!-- /Panel -->
                    </div>
                    <!-- /Spec Form -->

                </section>
                <!-- /Content -->

            </section>
            <!-- /Main Wrapper -->

        </div>
        <!-- /Body Wrap  -->

        <!-- Scripts -->

        <!-- jQuery -->
        <script src="assets/js/jquery/jquery-1.12.3.min.js"></script>
        <script src="assets/js/jquery/jquery_ui/jquery-ui.min.js"></script>

        <!-- AnimatedSVGIcons -->
        <script src="assets/fonts/animatedsvgicons/js/snap.svg-min.js"></script>
        <script src="assets/fonts/animatedsvgicons/js/svgicons-config.js"></script>
        <script src="assets/fonts/animatedsvgicons/js/svgicons.js"></script>
        <script src="assets/fonts/animatedsvgicons/js/svgicons-init.js"></script>

        <!-- Scroll -->
        <script src="assets/js/utility/malihu-custom-scrollbar-plugin-master/jquery.mCustomScrollbar.concat.min.js"></script>

        <!-- Mixitup -->

        <!-- Summernote -->

        <!-- HighCharts Plugin -->
        <script src="assets/js/plugins/highcharts/highcharts.js"></script>

        <!-- Highlight JS -->

        <!-- Date/Month - Pickers -->

        <!-- Magnific Popup Plugin -->

        <!-- FullCalendar Plugin -->

        <!-- Plugins -->

        <!-- Google Map API -->

        <!-- Jvectormap JS -->

        <!-- Datatables JS -->

        <!-- FooTable JS -->

        <!-- Validate JS -->

        <!-- BS Dual Listbox JS -->

        <!-- Bootstrap Maxlength JS -->

        <!-- Select2 JS -->

        <!-- Typeahead JS -->

        <!-- TagManager JS -->

        <!-- DateRange JS -->

        <!-- BS Colorpicker JS -->

        <!-- MaskedInput JS -->
       
       <!-- Slick Slider JS -->

        <!-- MarkDown JS -->

        <!-- X-edit CSS -->

        <!-- Dropzone JS -->

        <!-- Cropper JS -->

        <!-- Zoom JS -->

        <!-- Nestable JS -->

        <!-- PNotify JS -->

        <!-- Fancytree JSs -->

        <!-- Ladda JS -->

        <!-- NProgress JS -->

        <!-- Countdown JS -->
        
        <!-- CanvasBG JS -->
        <script src="assets/js/plugins/canvasbg/canvasbg.js"></script>

        <!-- Theme Scripts -->
        <script src="assets/js/utility/utility.js"></script>
        <script src="assets/js/demo/demo.js"></script>
        <script src="assets/js/main.js"></script>
        <script src="assets/js/demo/widgets_sidebar.js"></script>
        <!--<script src="assets/js/pages/dashboard_init.js"></script>-->

        <!-- /Scripts -->

    </body>
</html>
