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
    <!-- / flatty theme -->
    <link href='<c:url value="/stylesheets/light-theme.css"/>' id='color-settings-body-color' media='all' rel='stylesheet' type='text/css' />
    
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body class='contrast-red application-error 404-error contrast-background'>
<div id='wrapper'>
    <div class='error-type'>
        <i class='icon-question-sign'></i>
        <span>404</span>
    </div>
    <div class='error-message'>
        Ooops! We can't find what you're looking for.
    </div>
    <div class='youcan'>
        <small class='text-center'>You can</small>
    </div>
    <a href="/pangpang/home" class="btn btn-block"><i class='icon-chevron-left'></i>
        Go back
    </a>
</div>
<!-- / jquery -->
<script src='<c:url value="/javascripts/jquery/jquery.min.js"/>' type='text/javascript'></script>

<!-- / bootstrap -->
<script src='<c:url value="/javascripts/bootstrap/bootstrap.min.js"/>' type='text/javascript'></script>
<script src='<c:url value="/javascripts/plugins/flot/excanvas.js"/>' type='text/javascript'></script>

</body>
</html>
