<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link
	href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Permisos</title>
</head>
<body>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-md-3">
				<div class="panel-group" id="accordion">
									<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../asignaciones/">
								<span class="glyphicon glyphicon-file"></span>Asignaciones</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../departamentos/"> <span
									class="glyphicon glyphicon-folder-close"></span>Departamentos
								</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../usuarios/"> <span
									class="glyphicon glyphicon-folder-close"></span>Usuarios
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../permisos/"> <span class="glyphicon glyphicon-th"></span>Permisos
								</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="#"> <span class="glyphicon glyphicon-user">
								</span>Escuelas
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../lotes/"> <span class="glyphicon glyphicon-file"></span>Lotes
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../entregas/"> <span
									class="glyphicon glyphicon-file"></span>Entregas
								</a>
							</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-9 col-md-9">
				<div class="well">
					<div class="container">
						<form:form action="guardarPerm" method="post"
							modelAttribute="objePerm">
							<div class="container">
								<div class="row centered-form">
									<div class="col-xs-12 col-sm-8 col-md-4">
										<div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">
													Permisos</small>
												</h3>
											</div>
											<div class="panel-body">
												<form role="form">
													<div class="form-group">
														<form:hidden path="codiPerm" />
														<form:input path="nombPerm" class="form-control input-sm"
															placeholder="Nombre de permiso" />
														<form:input path="descPerm" class="form-control input-sm"
															placeholder="Descripción del permiso" />
													</div>

													<input type="submit" value="Guardar"
														class="btn btn-info btn-block"> <br>
													<br> <a href="../permisos/" class="btn btn-primary"><b>Volver
															a permisos</a>

												</form>
											</div>
										</div>
									</div>
								</div>
						</form:form>
					</div>
				</div>
			</div>
</body>
</html>
<!---------------------------------------------------------------
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mantenimiento de Usuarios</title>
</head>
<body>
	<h1>Nuevo usuario</h1>
	<form:form action="guardarPerm" method="post" modelAttribute="objePerm">
		<form:hidden path="codiPerm"/>
		<form:input path="nombPerm" />
		<form:input path="descPerm" />
		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html-->