<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>
<script	src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Control de entregas </title>
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
								<a href="../departamentos/">
								<span class="glyphicon glyphicon-folder-close"></span>Departamentos</a>
							</h4>
						</div>
						
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../usuarios/">
								<span class="glyphicon glyphicon-folder-close"></span>Usuarios</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../permisos/">
								<span class="glyphicon glyphicon-th"></span>Permisos</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="#">
								<span class="glyphicon glyphicon-user"> </span>Escuelas</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../lotes/">
								<span class="glyphicon glyphicon-file"></span>Lotes</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../entregas/">
								<span class="glyphicon glyphicon-file"></span>Entregas</a>
							</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-9 col-md-9">
				<div class="well">
					<center><h1>Lista de Entregas</h1></center>
					<br>
					<div class="container">
						<div class="row col-md-8 custyle">
							<table class="table table-striped custab">
								<thead>
									<a href="nuevoEntr" class="btn btn-primary btn-xs pull-right">Nueva Entrega</a>
									<tr>
										<th>Codigo</th>
										<th>Escuela</th>
										<th>Lote</th>
										<th>cantidad</th>
										<th>fecha de entrega</th>
										<th class="text-center">Action</th>
									</tr>
								</thead>
								<c:forEach var="entrTemp" items="${listEntr}">
									<tr>
										<td><c:out value="${entrTemp.codiEntr}" /></td>
										<td>${entrTemp.escuela}</td>
										<td>${entrTemp.lote}</td>
										<td><c:out value="${entrTemp.cantEntr}" /></td>
										<td>${entrTemp.fechEntr}</td>
										<td class="text-center">
											<a class='btn btn-info btn-xs' href="editarEntr?codi=${entrTemp.codiEntr}">Editar</a> 
											<a class='btn btn-info btn-xs' href="eliminarEntr?codi=${entrTemp.codiEntr}">Eliminar</a>
										</td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>