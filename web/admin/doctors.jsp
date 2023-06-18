<%-- 
    Document   : doctors
    Created on : Jun 6, 2023, 5:43:09 PM
    Author     : MSI AD
--%>

<%@page import="sample.dao.UserDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList"%>
<%@page import="java.util.List"%>
<%@page import="sample.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>thedearbird - Doctors | Manager</title>


        <!-- Favicon -->
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo-icon.png">


        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">

        <!-- Fontawesome CSS -->
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">

        <!-- Feathericon CSS -->
        <link rel="stylesheet" href="assets/css/feathericon.min.css">

        <!-- Datatables CSS -->
        <link rel="stylesheet" href="assets/plugins/datatables/datatables.min.css">

        <!-- Main CSS -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!--[if lt IE 9]>
                <script src="assets/js/html5shiv.min.js"></script>
                <script src="assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="page-wrapper">
            <div class="content container-fluid">

                <!-- Page Header -->
                <div class="page-header">
                    <div class="row">
                        <div class="col-sm-7 col-auto">
                            <h3 class="page-title">List of Doctors</h3>
                            <ul class="breadcrumb">
                                <li class="breadcrumb-item"><a href="javascript:(0);">Admin</a></li>
                                <li class="breadcrumb-item active">Doctor</li>
                            </ul>
                        </div>
                        <!--                            PHẦN ADD THÊM BÁC SĨ-->
                        <!--                            <div class="col-sm-5 col">
                                        <a href="#Add_Specialities_details" data-toggle="modal"
                                           class="btn btn-primary float-right mt-2">Add</a>
                                    </div>-->
                    </div>

                </div>
                <!-- /Page Header -->

                <div class="row">
                    <div class="col-sm-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="datatable table table-hover table-center mb-0">
                                        <thead>
                                            <tr>
                                                <th>Doctor Name</th>
                                                <th>Speciality</th>
                                                <th>Email</th>
                                                <th>Phone Contact</th>
                                                <th>Account Status</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                int rowCounter = 1;
                                                List<UserDTO> ls = new ArrayList<UserDTO>();
                                                UserDAO dao = new UserDAO();
                                                ls = dao.doctorList();
                                                for (UserDTO doc : ls) {

                                            %>

                                            <tr>
                                                <td>
                                                    <h2 class="table-avatar">
                                                        <a  class="avatar avatar-sm mr-2"><img class="avatar-img rounded-circle" src="<%= doc.getImage()%>" alt="User Image"></a>
                                                        <a href="#view_specialities_details" data-toggle="modal"><%= doc.getFullname()%></a>
                                                    </h2>
                                                </td>
                                                <td><%= doc.getBio()%></td>

                                                <td><%= doc.getEmail()%></td>

                                                <td><%= doc.getPhone()%></td>

                                                <td>
                                                    <%
                                                        boolean isStatus = doc.isStatus();
                                                    %>
                                                    <form id="statusForm<%=rowCounter%>" action="../SetStatusController" method="POST">
                                                        <label class="switch">
                                                            <input name="username" value="<%=doc.getUsername()%>" type="hidden">
                                                            <input name="statusName" value ="<%=isStatus%>" type="hidden">
                                                            <input type="checkbox" onchange="document.getElementById('statusForm<%= rowCounter%>').submit()" <%= isStatus ? "checked" : "unchecked"%>>
                                                            <span class="slider round"></span>
                                                        </label>
                                                    </form>
                                                    <style>
                                                        .switch {
                                                            margin-left: 10px;
                                                            position: relative;
                                                            display: inline-block;
                                                            width: 60px;
                                                            height: 34px;
                                                        }

                                                        /* Hide default HTML checkbox */
                                                        .switch input {
                                                            opacity: 0;
                                                            width: 0;
                                                            height: 0;
                                                        }

                                                        /* The slider */
                                                        .slider {
                                                            position: absolute;
                                                            cursor: pointer;
                                                            top: 0;
                                                            left: 0;
                                                            right: 0;
                                                            bottom: 0;
                                                            background-color: #ccc;
                                                            -webkit-transition: .4s;
                                                            transition: .4s;
                                                        }

                                                        .slider:before {
                                                            position: absolute;
                                                            content: "";
                                                            height: 26px;
                                                            width: 26px;
                                                            left: 4px;
                                                            bottom: 4px;
                                                            background-color: white;
                                                            -webkit-transition: .4s;
                                                            transition: .4s;
                                                        }

                                                        input:checked + .slider {
                                                            background-color: #6EC531;
                                                        }

                                                        input:focus + .slider {
                                                            box-shadow: 0 0 1px #6EC531;
                                                        }

                                                        input:checked + .slider:before {
                                                            -webkit-transform: translateX(26px);
                                                            -ms-transform: translateX(26px);
                                                            transform: translateX(26px);
                                                        }

                                                        /* Rounded sliders */
                                                        .slider.round {
                                                            border-radius: 34px;
                                                        }

                                                        .slider.round:before {
                                                            border-radius: 50%;
                                                        }

                                                    </style>
                                                </td>
                                            </tr>


                                            <%
                                                    rowCounter++;
                                                }
                                            %>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>			
                </div>

            </div>			
        </div>
        <!-- /Page Wrapper -->


        <!-- Add Modal -->
        <div class="modal fade" id="Add_Specialities_details" aria-hidden="true" role="dialog">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Add Doctor</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="row form-row">
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Image Profile</label>
                                        <input type="file" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div class="row form-row">
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <label>Full Name</label>
                                        <input style="width: 250px;" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label>Gender</label>
                                        <br>
                                        <select>
                                            <option value="">Male</option>
                                            <option value="">Female</option>
                                            <option value="">Other</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-row">
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <label>Date of Birth</label>
                                        <input type="date" placeholder="$" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label>Specialities</label>
                                        <br>
                                        <select style="height: 40px;  border-radius: 4px; boder: 1px solid #ff1;">
                                            <option style="height: 20px;" value="">Internal</option>
                                            <option style="height: 20px;" value="">External</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-row">
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Email Contact</label>
                                        <input  type="email" placeholder="abcxyz@gmail.com" class="form-control"></input>
                                    </div>
                                </div>
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Phone Contact</label>
                                        <input  type="number" class="form-control"></input>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-row">
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Bio</label>
                                        <textarea style="width: 300px;" type="text" class="form-control"></textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-row">
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Username</label>
                                        <input  type="text"  class="form-control"></input>
                                    </div>
                                </div>
                                <div class="col-12 col-sm-6">
                                    <div class="form-group">
                                        <label>Password</label>
                                        <input type="password" class="form-control"></input>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">Add new</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- /ADD Modal -->
    </div>

    <!-- View Details Modal -->
    <div class="modal fade" id="view_specialities_details" aria-hidden="true" role="dialog">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">View Specialities</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="row form-row">
                        <div class="col-12 col-sm-6">
                            <div class="form-group">
                                <label>Updating</label>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>

    <!-- Bootstrap Core JS -->
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!-- Slimscroll JS -->
    <script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <!-- Datatables JS -->
    <script src="assets/plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="assets/plugins/datatables/datatables.min.js"></script>

    <!-- Custom JS -->
    <script  src="assets/js/script.js"></script>
</body>
</html>
