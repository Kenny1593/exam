
<%@ page import="web.finals6.models.*" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: KENNY
  Date: 06/05/2023
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%
    List<Publication> p1 = (List<Publication>) request.getAttribute("lp1");
    List<Publication> p2 = (List<Publication>) request.getAttribute("lp2");
    List<Publication> p3 = (List<Publication>) request.getAttribute("lp3");
    List<Publication> p4 = (List<Publication>) request.getAttribute("lp4");
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Intelligence Artificielle(IA)</title>
    <meta content="l'Intelligence artificielle est l'avenir du monde.A cela s'ajoute que l'intelligence artifficielle contribue au développement de l'humanite. " name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="/assets/img/favicon.png" rel="icon">
    <link href="/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.gstatic.com" rel="preconnect">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="/assets/vendor/quill/quill.snow.css" rel="stylesheet">
    <link href="/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
    <link href="/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="/assets/vendor/simple-datatables/style.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="/assets/css/style.css" rel="stylesheet">

    <!-- =======================================================
    * Template Name: NiceAdmin - v2.2.2
    * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
    * Author: BootstrapMade.com
    * License: https://bootstrapmade.com/license/
    ======================================================== -->
</head>

<body>

<!-- ======= Header ======= -->
<header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
        <a  class="logo d-flex align-items-center">
            <img src="/assets/img/logo.png" alt="">
            <span class="d-none d-lg-block">Intelligence Artificielle</span>
        </a>
    </div><!-- End Logo -->

</header><!-- End Header -->

<!-- ======= Sidebar ======= -->

<main id="main" class="main">
    <div>
        <h1>Definition d'Intelligence Artificielle (AI)</h1>
        <% for (int i=0;i< p1.size();i++) { %>

        <%= p1.get(i).getContenu()%>
        <br>

        <% } %>
    </div>
    <br>

    <section class="section">
        <div class="row align-items-top">
            <div class="col-lg-6">

                <!-- Default Card -->
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Intelligence Artificielle Etroite</h5>
                        <% for (int j=0;j<1;j++) { %>
                        <%= p2.get(0).getContenu()%>
                        <% } %>
                        <br>

                        <% for (int o=0;o<1;o++) { %>
                        <p class="card-text"><a href="<%= request.getContextPath()%>/list/2/<%= p2.get(0).getUrl()%>" class="btn btn-primary">Voir details</a></p>
                        <% } %>
                    </div>

                </div><!-- End Default Card -->
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Intelligence Artificielle Generale</h5>
                        <% for (int k=0;k<1;k++) { %>
                        <%= p3.get(0).getContenu()%>
                        <% } %>
                        <br>


                        <% for (int n=0;n<1;n++) { %>
                        <p class="card-text"><a href="<%= request.getContextPath()%>/list/3/<%= p3.get(0).getUrl()%>" class="btn btn-primary">Voir details</a></p>
                        <% } %>
                    </div>

                </div><!-- End Default Card -->
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">SuperIntelligence Artificielle</h5>
                        <% for (int l=0;l<1;l++) { %>
                        <%= p4.get(0).getContenu()%>
                        <% } %>
                        <br>

                        <% for (int m=0;m<1;m++) { %>
                        <p class="card-text"><a href="<%= request.getContextPath()%>/list/4/<%= p4.get(0).getUrl()%>" class="btn btn-primary">Voir details</a></p>
                        <% } %>
                    </div>

                </div><!-- End Default Card -->


            </div>

        </div>
    </section>

</main><!-- End #main -->

<!-- ======= Footer ======= -->
<footer id="footer" class="footer">
    <div class="copyright">
        &copy; Copyright <strong><span>ETU001593</span></strong>
    </div>
</footer><!-- End Footer -->

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
<script src="/assets/vendor/apexcharts/apexcharts.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="/assets/vendor/chart.js/chart.min.js"></script>
<script src="/assets/vendor/echarts/echarts.min.js"></script>
<script src="/assets/vendor/quill/quill.min.js"></script>
<script src="/assets/vendor/simple-datatables/simple-datatables.js"></script>
<script src="/assets/vendor/tinymce/tinymce.min.js"></script>
<script src="/assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="/assets/js/main.js"></script>

</body>

</html>
