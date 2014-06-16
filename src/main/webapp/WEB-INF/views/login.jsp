<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>

	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	    <title>Login</title>
	    <link rel="stylesheet" type="text/css" href="<c:url value="/css/login.css"/>" />
	</head>

	<body>
		<div id="container">
			<form:form commandName="user" >
				<div class="login">LOGIN</div>
				<div class="username-text">Username:</div>
				<div class="password-text">Password:</div>
				<div class="username-field">
					<form:input path="userName"/>
				</div>
				<div class="password-field">
					<form:password path="password"/>
				</div>
				<form:checkbox path="rememberMe" id="rememberMe"/><form:label path="rememberMe">Remember me</form:label>
				<div class="forgot-usr-pwd">Forgot <a href="#">username</a> or <a href="#">password</a>?</div>
				<input type="submit" name="submit" value="GO" />
			</form:form>
		</div>
		<div id="footer">
			@ 2014 Conway's Home
		</div>
	</body>
</html>
