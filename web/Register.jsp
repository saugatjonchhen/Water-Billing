<%-- 
    Document   : Register
    Created on : Aug 22, 2017, 2:22:50 PM
    Author     : Saugat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Registration</title>
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
        <section id="content" class="">

            <!-- Registration -->
            <div class="allcp-form theme-primary mw600" id="register">
                <div class="bg-primary mw600 text-center mb20 br3 pt15 pb10">
                    <img src="assets/img/logo.png" alt=""/>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading pn">
                                    <span class="panel-title">
                                      Registration form
                                    </span>
                    </div>
                    <!-- /Panel Heading -->

                    <form method="post" action="AdminRegisterController" id="form-register">
                        <div class="panel-body pn">
                            <div class="section row mh10m">
                                <div class="col-md-6 ph10">
                                    <label for="firstname" class="field prepend-icon">
                                        <input type="text" name="fName" id="firstname"
                                               class="gui-input"
                                               placeholder="First name...">
                                        <span class="field-icon">
                                            <i class="fa fa-user"></i>
                                        </span>
                                    </label>
                                </div>
                                <!-- /section -->

                                <div class="col-md-6 ph10">
                                    <label for="lastname" class="field prepend-icon">
                                        <input type="text" name="lName" id="lastname" class="gui-input"
                                               placeholder="Last name...">
                                        <span class="field-icon">
                                            <i class="fa fa-user"></i>
                                        </span>
                                    </label>
                                </div>
                                <!-- /section -->
                            </div>
                            <!-- /section -->

                            <div class="section">
                                <label for="email" class="field prepend-icon">
                                    <input type="email" name="eMail" id="email" class="gui-input"
                                           placeholder="Email address">
                                    <span class="field-icon">
                                        <i class="fa fa-envelope"></i>
                                    </span>
                                </label>
                            </div>
                            <!-- /section -->

                            <!--<div class="section">
                            <div class="bs-component pull-left pt5">
                                Gender:
                                <label for="gender" class="field prepend-icon">
                                     <div class="radio-custom radio-primary mb5 lh25">
                                        <input type="radio" id="gender" name="gender" value="Male">
                                        <label for="remember">Male</label>
                                    
                                    
                                        <input type="radio" id="gender" name="gender" value="Female">
                                        <label for="remember">Female</label>
                                     </div>
                                    </label>
                                </div>
                            </div>-->
                            
                            <div class="section">
                                <label for="contact" class="field prepend-icon">
                                    <input type="text" name="contact" id="contact" class="gui-input"
                                           placeholder="Contact Number">
                                    <span class="field-icon">
                                        <i class="fa fa-lock"></i>
                                    </span>
                                </label>
                            </div>
                            <!-- /section -->
                            
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
                                           placeholder="Create a password">
                                    <span class="field-icon">
                                        <i class="fa fa-lock"></i>
                                    </span>
                                </label>
                            </div>
                            <!-- /section -->
                            
                            <div class="section">
                                <div class="bs-component pull-left pt5">
                                    <div class="radio-custom radio-primary mb5 lh25">
                                        <input type="radio" id="male" name="gender" value = "Male">
                                        <label for="male">Male</label>
                                        <input type="radio" id="female" name="gender" value = "Female">
                                        <label for="female">Female</label>
                                    </div>
                                </div>
                            </div>
                            <!-- /section -->
                            
                            <br />
                            <!--<label for="confirmPassword" class="field prepend-icon">
                                    <input type="text" name="confirmPassword" id="confirmPassword"
                                           class="gui-input"
                                           placeholder="Retype your password">
                                    <span class="field-icon">
                                        <i class="fa fa-unlock-alt"></i>
                                    </span>
                                </label>
                            </div>-->
                            <!-- /section -->

                            <div class="section">
<!--                                <div class="bs-component pull-left mt10 mb10">
                                    <div class="checkbox-custom checkbox-primary mb5">
                                        <input type="checkbox" checked="" id="agree">
                                        <label for="agree">I agree to the
                                            <a href="#"> terms of use. </a></label>
                                    </div>
                                </div>-->
                                <div class="pull-right">
                                    <button type="submit" class="btn btn-bordered btn-primary">I Accept - Create Account
                                    </button>
                                </div>
                            </div>
                            <!-- /section -->

                        </div>
                        <!-- /Form -->
                        <div class="panel-footer">

                        </div>
                        <!-- /Panel Footer -->
                    </form>
                </div>
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
