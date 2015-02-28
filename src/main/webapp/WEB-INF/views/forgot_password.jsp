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
<body class='contrast-red forgot-password contrast-background'>
<div id='wrapper'>
    <div class='application'>
        <div class='application-content'>
            <a href="/pangpang/login"><div class='icon-heart'></div>
                <span>Flatty</span>
            </a>
        </div>
    </div>
    <div class='controls'>
        <div class='caret'></div>
        <div class='form-wrapper'>
            <h1 class='text-center'>Forgot password</h1>
            <form accept-charset="UTF-8" action="index.html" method="get" />
            <div style="margin:0;padding:0;display:inline">
            <input name="utf8" type="hidden" value="&#x2713;" />
            </div>
            <div class='row-fluid'>
                 <div class='span12 icon-over-input'>
                     <input class="span12" id="email" name="email" placeholder="E-mail" type="text" value="" />
                     <i class='icon-envelope-alt muted'></i>
                 </div>
             </div>
             <button class="btn btn-block" name="button" type="submit">Send me instructions</button>
            </form>
            <div class='text-center'>
                <hr class='hr-normal' />
                <a href="/pangpang/login"><i class='icon-chevron-left'></i>
                    I already know my password
                </a>
            </div>
        </div>
    </div>
    <div class='login-action text-center'>
        <a href="/pangpang/register"><i class='icon-user'></i>
            New to Flatty?
            <strong>Sign up</strong>
        </a>
    </div>
</div>
<!-- / jquery -->
<script src='<c:url value="/javascripts/jquery/jquery.min.js"/>' type='text/javascript'></script>

<!-- / bootstrap -->
<script src='<c:url value="/javascripts/bootstrap/bootstrap.min.js"/>' type='text/javascript'></script>
<script src='<c:url value="/javascripts/plugins/flot/excanvas.js"/>' type='text/javascript'></script>

</body>
</html>
