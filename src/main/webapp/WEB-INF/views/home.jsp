<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Flatty - Flat administration template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
    
    <!--[if lt IE 9]>
    <script src='<c:url value="/javascripts/html5shiv.js"/>' type='text/javascript'></script>
    <![endif]-->
    <link href='<c:url value="/stylesheets/bootstrap/bootstrap.css"/>' media='all' rel='stylesheet' type='text/css' />
    <link href='<c:url value="/stylesheets/bootstrap/bootstrap-responsive.css"/>' media='all' rel='stylesheet' type='text/css' />
    <!-- / flatty theme -->
    <link href='<c:url value="/stylesheets/light-theme.css"/>' id='color-settings-body-color' media='all' rel='stylesheet' type='text/css' />
    <!-- / jquery ui -->
    <link href='<c:url value="/stylesheets/jquery_ui/jquery-ui-1.10.0.custom.css"/>' media='all' rel='stylesheet' type='text/css' />
    
    <!-- / jquery -->
	<script src='<c:url value="/javascripts/jquery/jquery.min.js"/>' type='text/javascript'></script>
	<script src='<c:url value="/javascripts/jquery_ui/jquery-ui.min.js"/>' type='text/javascript'></script>
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body class='contrast-red '>
<%@include file="page_header.jsp"%>
<div id='wrapper'>
<div id='main-nav-bg'></div>
<%@include file="main_menu.jsp" %>

<section id='content'>
    <div class='container-fluid'>
        <div class='row-fluid' id='content-wrapper'>
            <div class='span12'>

            </div>
        </div>
    </div>
</section>
</div>
    <!-- / bootstrap -->
	<script src='<c:url value="/javascripts/bootstrap/bootstrap.min.js"/>' type='text/javascript'></script>
	<script src='<c:url value="/javascripts/plugins/flot/excanvas.js"/>' type='text/javascript'></script>
    <!-- / flatty theme -->
    <script src='<c:url value="/javascripts/nav.js"/>' type='text/javascript'></script>
    <script src='<c:url value="/javascripts/plugins/mobile_events/jquery.mobile-events.min.js"/>' type='text/javascript'></script>

</body>
</html>
