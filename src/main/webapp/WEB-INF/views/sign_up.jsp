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
<body class='contrast-red sign-up contrast-background'>
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
            <h1 class='text-center'>Sign up</h1>
            <form:form commandName="register" >
            <div style="margin:0;padding:0;display:inline">
                <input name="utf8" type="hidden" value="&#x2713;" /></div>
                <div class='row-fluid'>
                    <div class='span12 icon-over-input'>
                        <form:input path="userName" cssClass="span12" placeholder="User name"/>
                        <i class='icon-user muted'></i>
                    </div>
                </div>
                <div class='row-fluid'>
                    <div class='span12 icon-over-input'>
                        <form:password path="password" cssClass="span12" placeholder="Password"/>
                        <i class='icon-lock muted'></i>
                    </div>
                </div>
                <div class='row-fluid'>
                    <div class='span12 icon-over-input'>
                        <form:password path="rePassword" cssClass="span12" placeholder="Password confirmation"/>
                        <i class='icon-lock muted'></i>
                    </div>
                </div>
                <label class="checkbox" for="agreement"><input id="agreement" name="agreement" type="checkbox" value="1" />
                    I accept
                    <a href="#" class="text-contrast">user agreements</a>
                </label>
                <button class="btn btn-block" name="button" type="submit">Sign up</button>
            </form:form>
            <div class='text-center'>
                <hr class='hr-normal' />
                <a href="/pangpang/login"><i class='icon-chevron-left'></i>
                    Go back to sign in
                </a>
            </div>
        </div>
    </div>
    <div class='login-action text-center'>
        <a href="/pangpang/findPassword"><i class='icon-lock'></i>
            Forgot your password?
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
