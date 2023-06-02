package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <!-- doccure/login.jsp  30 Nov 2019 04:12:20 GMT -->\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Doccure</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicons -->\r\n");
      out.write("        <link href=\"assets/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Fontawesome CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/fontawesome/css/fontawesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/fontawesome/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("                        <script src=\"assets/js/html5shiv.min.js\"></script>\r\n");
      out.write("                        <script src=\"assets/js/respond.min.js\"></script>\r\n");
      out.write("                <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"account-page\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Wrapper -->\r\n");
      out.write("        <div class=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg header-nav\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <a id=\"mobile_btn\" href=\"javascript:void(0);\">\r\n");
      out.write("                            <span class=\"bar-icon\">\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"index-2.jsp\" class=\"navbar-brand logo\">\r\n");
      out.write("                            <img style=\"object-fit: fill;\" src=\"assets/img/final_logo.png\" class=\"img-fluid\" alt=\"Logo\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"main-menu-wrapper\">\r\n");
      out.write("                        <div class=\"menu-header\">\r\n");
      out.write("                            <a href=\"index-2.jsp\" class=\"menu-logo\">\r\n");
      out.write("                                <img src=\"assets/img/final_logo.png\" class=\"img-fluid\" alt=\"Logo\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a id=\"menu_close\" class=\"menu-close\" href=\"javascript:void(0);\">\r\n");
      out.write("                                <i class=\"fas fa-times\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"main-nav\">\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <a href=\"index-2.jsp\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <!-- <li class=\"has-submenu\">\r\n");
      out.write("                                    <a href=\"#\">Doctors <i class=\"fas fa-chevron-down\"></i></a>\r\n");
      out.write("                                    <ul class=\"submenu\">\r\n");
      out.write("                                            <li><a href=\"doctor-dashboard.jsp\">Doctor Dashboard</a></li>\r\n");
      out.write("                                            <li><a href=\"appointments.jsp\">Appointments</a></li>\r\n");
      out.write("                                            <li><a href=\"schedule-timings.jsp\">Schedule Timing</a></li>\r\n");
      out.write("                                            <li><a href=\"my-patients.jsp\">Patients List</a></li>\r\n");
      out.write("                                            <li><a href=\"patient-profile.jsp\">Patients Profile</a></li>\r\n");
      out.write("                                            <li><a href=\"chat-doctor.jsp\">Chat</a></li>\r\n");
      out.write("                                            <li><a href=\"invoices.jsp\">Invoices</a></li>\r\n");
      out.write("                                            <li><a href=\"doctor-profile-settings.jsp\">Profile Settings</a></li>\r\n");
      out.write("                                            <li><a href=\"reviews.jsp\">Reviews</a></li>\r\n");
      out.write("                                            <li><a href=\"doctor-register.jsp\">Doctor Register</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"has-submenu\">\r\n");
      out.write("                                    <a href=\"#\">Patients <i class=\"fas fa-chevron-down\"></i></a>\r\n");
      out.write("                                    <ul class=\"submenu\">\r\n");
      out.write("                                            <li><a href=\"search.jsp\">Search Doctor</a></li>\r\n");
      out.write("                                            <li><a href=\"doctor-profile.jsp\">Doctor Profile</a></li>\r\n");
      out.write("                                            <li><a href=\"booking.jsp\">Booking</a></li>\r\n");
      out.write("                                            <li><a href=\"checkout.jsp\">Checkout</a></li>\r\n");
      out.write("                                            <li><a href=\"booking-success.jsp\">Booking Success</a></li>\r\n");
      out.write("                                            <li><a href=\"patient-dashboard.jsp\">Patient Dashboard</a></li>\r\n");
      out.write("                                            <li><a href=\"favourites.jsp\">Favourites</a></li>\r\n");
      out.write("                                            <li><a href=\"chat.jsp\">Chat</a></li>\r\n");
      out.write("                                            <li><a href=\"profile-settings.jsp\">Profile Settings</a></li>\r\n");
      out.write("                                            <li><a href=\"change-password.jsp\">Change Password</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"has-submenu\">\r\n");
      out.write("                                    <a href=\"#\">Pages <i class=\"fas fa-chevron-down\"></i></a>\r\n");
      out.write("                                    <ul class=\"submenu\">\r\n");
      out.write("                                            <li><a href=\"voice-call.jsp\">Voice Call</a></li>\r\n");
      out.write("                                            <li><a href=\"video-call.jsp\">Video Call</a></li>\r\n");
      out.write("                                            <li><a href=\"search.jsp\">Search Doctors</a></li>\r\n");
      out.write("                                            <li><a href=\"calendar.jsp\">Calendar</a></li>\r\n");
      out.write("                                            <li><a href=\"components.jsp\">Components</a></li>\r\n");
      out.write("                                            <li class=\"has-submenu\">\r\n");
      out.write("                                                    <a href=\"invoices.jsp\">Invoices</a>\r\n");
      out.write("                                                    <ul class=\"submenu\">\r\n");
      out.write("                                                            <li><a href=\"invoices.jsp\">Invoices</a></li>\r\n");
      out.write("                                                            <li><a href=\"invoice-view.jsp\">Invoice View</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li><a href=\"blank-page.jsp\">Starter Page</a></li>\r\n");
      out.write("                                            <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                                            <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("                                            <li><a href=\"forgot-password.jsp\">Forgot Password</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                            </li> -->\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"blank-page.jsp\" >Blog</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"login-link\">\r\n");
      out.write("                                <a href=\"login.jsp\">Login / Signup</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav header-navbar-rht\">\r\n");
      out.write("                        <li class=\"nav-item contact-item\">\r\n");
      out.write("                            <div class=\"header-contact-img\">\r\n");
      out.write("                                <i class=\"far fa-hospital\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"header-contact-detail\">\r\n");
      out.write("                                <p class=\"contact-header\">Contact</p>\r\n");
      out.write("                                <p class=\"contact-info-header\"> +1 315 369 5943</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link header-login\" href=\"login.jsp\">login / Signup </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- /Header -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Content -->\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-8 offset-md-2\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Login Tab Content -->\r\n");
      out.write("                            <div class=\"account-content\">\r\n");
      out.write("                                <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 login-left\">\r\n");
      out.write("                                        <img src=\"assets/img/login-banner-1.png\" class=\"img-fluid\" alt=\"thedearbird Login\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-12 col-lg-6 login-right\">\r\n");
      out.write("                                        <div class=\"login-header\">\r\n");
      out.write("                                            <h3>Login<a href=\"admin/login.jsp\">Are you an admin?</a></h3>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
<<<<<<< HEAD
      out.write("                                        <form action=\"MainController\" method=\"post\">\r\n");
      out.write("                                            <div class=\"form-group form-focus inputBox\">\r\n");
      out.write("                                                <input name=\"username\" type=\"text\" class=\"form-control floating\">\r\n");
      out.write("                                                <label class=\"focus-label\">Username</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"box\">\r\n");
      out.write("                                                <div class=\"form-group form-focus\">\r\n");
      out.write("                                                    <input name=\"password\" type=\"password\" id=\"pass\" class=\"form-control floating\">\r\n");
      out.write("                                                    <label class=\"focus-label\">Password</label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <span id=\"toggleBtn\"></span>\r\n");
      out.write("                                            <style>\r\n");
      out.write("                                                .box {\r\n");
      out.write("                                                    position: relative;\r\n");
      out.write("                                                }\r\n");
      out.write("                                                .box .inputBox input{\r\n");
      out.write("                                                    position: relative;\r\n");
      out.write("                                                    outline: none;\r\n");
      out.write("                                                }\r\n");
      out.write("                                                .box .inputBox #toggleBtn{\r\n");
      out.write("                                                    position: absolute;\r\n");
      out.write("                                                    width: 35px;\r\n");
      out.write("                                                    height: 35px;\r\n");
      out.write("                                                    background: rgba(0,0,0,0.09);\r\n");
      out.write("                                                    top: 7px;\r\n");
      out.write("                                                    right: 10px;\r\n");
      out.write("                                                    border-radius: 50%;\r\n");
      out.write("                                                    cursor: pointer;\r\n");
      out.write("                                                    display: flex;\r\n");
      out.write("                                                    justify-content: center;\r\n");
      out.write("                                                    align-items: center;\r\n");
      out.write("                                                }\r\n");
      out.write("                                                .box .inputBox #toggleBtn::before {\r\n");
      out.write("                                                    content: '\\f06e';\r\n");
      out.write("                                                    font-family: fontAwesome;\r\n");
      out.write("                                                }\r\n");
      out.write("\r\n");
      out.write("                                                .box .inputBox #toggleBtn.hide::before  {\r\n");
      out.write("                                                    content: '\\f070';\r\n");
      out.write("                                                }\r\n");
      out.write("                                            </style>\r\n");
      out.write("                                            <div class=\"text-right\">\r\n");
      out.write("                                                <a class=\"forgot-link\" href=\"forgot-password.jsp\">Forgot Password ?</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <button name=\"action\" value=\"login\" class=\"btn btn-primary btn-block btn-lg login-btn\"\r\n");
=======
      out.write("                                        <form action=\"\">\r\n");
      out.write("                                            <div class=\"form-group form-focus\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control floating\">\r\n");
      out.write("                                                <label class=\"focus-label\">Username</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group form-focus\">\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control floating\">\r\n");
      out.write("                                                <label class=\"focus-label\">Password</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"text-right\">\r\n");
      out.write("                                                <a class=\"forgot-link\" href=\"forgot-password.jsp\">Forgot Password ?</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button class=\"btn btn-primary btn-block btn-lg login-btn\"\r\n");
>>>>>>> main
      out.write("                                                    type=\"submit\">Login</button>\r\n");
      out.write("                                            <div class=\"login-or\">\r\n");
      out.write("                                                <span class=\"or-line\"></span>\r\n");
      out.write("                                                <span class=\"span-or\">or</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row form-row social-login\">\r\n");
      out.write("                                                <div style=\"margin-left: auto; margin-right: auto;\" class=\"col-6\">\r\n");
<<<<<<< HEAD
      out.write("                                                    <a href=\"#\" class=\"btn btn-google btn-block\"><i\r\n");
=======
      out.write("                                                    <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/bird-clinic-system/LoginGoogleController&response_type=code\r\n");
      out.write("                                                       &client_id=682520957809-oqj4srno5ntcptc8d15nts7il0iae4k4.apps.googleusercontent.com&approval_prompt=force\" class=\"btn btn-google btn-block\"><i\r\n");
>>>>>>> main
      out.write("                                                            class=\"fab fa-google mr-1\"></i>Login</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"text-center dont-have\">Don’t have an account? <a\r\n");
      out.write("                                                    href=\"register.jsp\">Register</a></div>\r\n");
<<<<<<< HEAD
      out.write("                                            <p style=\"color: green; margin-left: 10px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${successSignUp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
=======
>>>>>>> main
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /Login Tab Content -->\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /Page Content -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Footer Top -->\r\n");
      out.write("                <div class=\"footer-top\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Footer Widget -->\r\n");
      out.write("                                <div class=\"footer-widget footer-about\">\r\n");
      out.write("                                    <div class=\"footer-logo\">\r\n");
      out.write("                                        <img src=\"assets/img/footer_logo.png\" alt=\"logo\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"footer-about-content\">\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\r\n");
      out.write("                                            incididunt ut labore et dolore magna aliqua. </p>\r\n");
      out.write("                                        <div class=\"social-icon\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"#\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i> </a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"#\" target=\"_blank\"><i class=\"fab fa-twitter\"></i> </a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"#\" target=\"_blank\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"#\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"#\" target=\"_blank\"><i class=\"fab fa-dribbble\"></i> </a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- /Footer Widget -->\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Footer Widget -->\r\n");
      out.write("                                <div class=\"footer-widget footer-menu\">\r\n");
      out.write("                                    <h2 class=\"footer-title\">For Patients</h2>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"search.jsp\"><i class=\"fas fa-angle-double-right\"></i> Search for\r\n");
      out.write("                                                Doctors</a></li>\r\n");
      out.write("                                        <li><a href=\"login.jsp\"><i class=\"fas fa-angle-double-right\"></i> Login</a></li>\r\n");
      out.write("                                        <li><a href=\"register.jsp\"><i class=\"fas fa-angle-double-right\"></i> Register</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"booking.jsp\"><i class=\"fas fa-angle-double-right\"></i> Booking</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"patient-dashboard.jsp\"><i class=\"fas fa-angle-double-right\"></i>\r\n");
      out.write("                                                Patient Dashboard</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- /Footer Widget -->\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Footer Widget -->\r\n");
      out.write("                                <div class=\"footer-widget footer-menu\">\r\n");
      out.write("                                    <h2 class=\"footer-title\">For Doctors</h2>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"appointments.jsp\"><i class=\"fas fa-angle-double-right\"></i>\r\n");
      out.write("                                                Appointments</a></li>\r\n");
      out.write("                                        <li><a href=\"chat.jsp\"><i class=\"fas fa-angle-double-right\"></i> Chat</a></li>\r\n");
      out.write("                                        <li><a href=\"login.jsp\"><i class=\"fas fa-angle-double-right\"></i> Login</a></li>\r\n");
      out.write("                                        <li><a href=\"doctor-register.jsp\"><i class=\"fas fa-angle-double-right\"></i>\r\n");
      out.write("                                                Register</a></li>\r\n");
      out.write("                                        <li><a href=\"doctor-dashboard.jsp\"><i class=\"fas fa-angle-double-right\"></i> Doctor\r\n");
      out.write("                                                Dashboard</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- /Footer Widget -->\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Footer Widget -->\r\n");
      out.write("                                <div class=\"footer-widget footer-contact\">\r\n");
      out.write("                                    <h2 class=\"footer-title\">Contact Us</h2>\r\n");
      out.write("                                    <div class=\"footer-contact-info\">\r\n");
      out.write("                                        <div class=\"footer-address\">\r\n");
      out.write("                                            <span><i class=\"fas fa-map-marker-alt\"></i></span>\r\n");
      out.write("                                            <p> 3556 Beech Street, San Francisco,<br> California, CA 94108 </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p>\r\n");
      out.write("                                            <i class=\"fas fa-phone-alt\"></i>\r\n");
      out.write("                                            +1 315 369 5943\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p class=\"mb-0\">\r\n");
      out.write("                                            <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                                            doccure@example.com\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- /Footer Widget -->\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /Footer Top -->\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- /Footer -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /Main Wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core JS -->\r\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom JS -->\r\n");
      out.write("        <script src=\"assets/js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <!-- doccure/login.jsp  30 Nov 2019 04:12:20 GMT -->\r\n");
      out.write("\r\n");
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
