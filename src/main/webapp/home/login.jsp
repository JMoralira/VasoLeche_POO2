<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-Iniciar Sesion</title>
</head>
<body>
	</form>
	<c:url var="loginUrl" value="/home/login" />
	<form action="${loginUrl}" method="post">
		<form class="form-horizontal">
			<fieldset>

				<!-- Form Name -->
				<legend>Login</legend>
				<!-- Text input-->
				<c:if test="${param.error != null}">
					<p>Usuario y contraseña inválido.</p>
				</c:if>
				<div class="form-group">
					<label class="col-md-10 control-label" for="nomb_usua">Username</label>
					<div class="col-md-10">
						<input type="text" id="nomb_usua" name="nomb_usua"
							placeholder="Ingrese Usuario" required
							class="form-control input-md">
					</div>
				</div>
				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-10 control-label" for="cont_usua">Password</label>
					<div class="col-md-10">
						<input type="password" id="cont_usua" name="cont_usua"
							placeholder="Ingrese Password" required
							class="form-control input-md">
					</div>
				</div>
				<!-- Button (Double) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for=""></label>
					<div class="col-md-8">
						<button type="submit" value="Ingresar" class="btn btn-warning">Login</button>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
						<button href="login.jsp" class="btn btn-default">Cancel</button>
					</div>
				</div>

			</fieldset>
		</form>
	</form>


</body>
</html>