<%-- 
    Document   : CustomerInfo
    Created on : Aug 15, 2017, 8:49:35 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Information</title>
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
                            Customer Information Entry
                        </div>
                        <div class="panel mw320">
                            <form action="CusController" method="Post" id="form-login">
                                <div class="panel-body pn mv10">

                                    <div class="section">
                                        <label for="customerid" class="field prepend-icon">
                                            <input type="text" name="customerid" id="customerid" class="gui-input"
                                                   placeholder="Customer Id ">
                                            <span class="field-icon">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->

                                    <div class="section">
                                        <label for="appFName" class="field prepend-icon">
                                            <input type="text" name="appFName" id="appFName" class="gui-input"
                                                   placeholder="Applicant's First Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appMName" class="field prepend-icon">
                                            <input type="text" name="appMName" id="appMName" class="gui-input"
                                                   placeholder="Applicant's Middle Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appLName" class="field prepend-icon">
                                            <input type="text" name="appLName" id="appLName" class="gui-input"
                                                   placeholder="Applicant's Last Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appPFName" class="field prepend-icon">
                                            <input type="text" name="appPFName" id="appPFName" class="gui-input"
                                                   placeholder="Parent's First Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appPMName" class="field prepend-icon">
                                            <input type="text" name="appPMName" id="appPMName" class="gui-input"
                                                   placeholder="Parent's Middle Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appPLName" class="field prepend-icon">
                                            <input type="text" name="appPLName" id="appPLName" class="gui-input"
                                                   placeholder="Parent's Last Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appGFName" class="field prepend-icon">
                                            <input type="text" name="appGFName" id="appGFName" class="gui-input"
                                                   placeholder="Grand Parent's First Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appGMName" class="field prepend-icon">
                                            <input type="text" name="appGMName" id="appGMName" class="gui-input"
                                                   placeholder="Grand Parent's Middle Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="appGLName" class="field prepend-icon">
                                            <input type="text" name="appGLName" id="appGLName" class="gui-input"
                                                   placeholder="Grand Parent's Last Name">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="mobNo" class="field prepend-icon">
                                            <input type="text" name="mobNo" id="mobNo" class="gui-input"
                                                   placeholder="Mobile Number">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="CitizenShipNo" class="field prepend-icon">
                                            <input type="text" name="CitizenShipNo" id="CitizenShipNo" class="gui-input"
                                                   placeholder="CitizenShip Number">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="reason" class="field prepend-icon">
                                            <input type="text" name="reason" id="reason" class="gui-input"
                                                   placeholder="Reason For Installation">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="noOfMember" class="field prepend-icon">
                                            <input type="number" name="noOfMember" id="noOfMember" class="gui-input"
                                                   placeholder="No of members">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="dConsumption" class="field prepend-icon">
                                            <input type="number" name="dConsumption" id="dConsumption" class="gui-input"
                                                   placeholder="Daily Consumption">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="aPhoto" class="field prepend-icon">
                                            <input type="text" name="aPhoto" id="aPhoto" class="gui-input"
                                                   placeholder="Applicant's Photo">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="lPhoto" class="field prepend-icon">
                                            <input type="text" name="lPhoto" id="lPhoto" class="gui-input"
                                                   placeholder="Land Owner's Photo">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="cPhoto" class="field prepend-icon">
                                            <input type="text" name="cPhoto" id="cPhoto" class="gui-input"
                                                   placeholder="Citizenship Scan Photo">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="billReceipt" class="field prepend-icon">
                                            <input type="text" name="billReceipt" id="billReceipt" class="gui-input"
                                                   placeholder="Electricity Bill Receipt">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->

                                    <div class="section">
                                        <label for="certificate" class="field prepend-icon">
                                            <input type="text" name="certificate" id="certificate" class="gui-input"
                                                   placeholder="Naxa Pass Certificate">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    <div>
                                        Address:
                                    </div>
                                    <div class="section">
                                        <label for="state" class="field prepend-icon">
                                            <input type="text" name="state" id="state" class="gui-input"
                                                   placeholder="State">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="district" class="field prepend-icon">
                                            <input type="text" name="district" id="district" class="gui-input"
                                                   placeholder="District">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="municipality" class="field prepend-icon">
                                            <input type="text" name="municipality" id="municipality" class="gui-input"
                                                   placeholder="Municipality">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="wardNumber" class="field prepend-icon">
                                            <input type="text" name="wardNumber" id="wardNumber" class="gui-input"
                                                   placeholder="Ward Number">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="houseNo" class="field prepend-icon">
                                            <input type="text" name="houseNo" id="houseNo" class="gui-input"
                                                   placeholder="House No">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div>
                                        Char Killa Information
                                    </div>
                                    
                                    <div class="section">
                                        <label for="east" class="field prepend-icon">
                                            <input type="text" name="east" id="east" class="gui-input"
                                                   placeholder="East">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="west" class="field prepend-icon">
                                            <input type="text" name="west" id="west" class="gui-input"
                                                   placeholder="West">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="north" class="field prepend-icon">
                                            <input type="text" name="north" id="north" class="gui-input"
                                                   placeholder="North">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div class="section">
                                        <label for="south" class="field prepend-icon">
                                            <input type="text" name="south" id="south" class="gui-input"
                                                   placeholder="South">
                                            <span class="field-icon">
                                                <i class="fa fa-lock"></i>
                                            </span>
                                        </label>
                                    </div>
                                    <!-- /section -->
                                    
                                    <div>
                                        <a href="ViewAllRecords.jsp">Click here</a>
                                    </div>
                                    
                                    <div class="section">
                                        <button type="submit" class="btn btn-bordered btn-primary pull-right">Insert</button>
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
