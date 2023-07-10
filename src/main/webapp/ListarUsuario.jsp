<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@page import="java.util.*" %> 
  <%@ page import="modelo.Cliente" %>
  <%@ page import="modelo.Administrativo" %>
  <%@ page import="modelo.Profesional" %>
  <%@ page import="modelo.Usuario" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Listar Usuarios</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex  container-fluid">
			<div class="listaUsuarios">
				<h2>Lista de Usuarios</h2>
				<c:forEach var="usuario" items="${listaUsuarios}">
				
    				<c:if test="${usuario.getClass().getName().equals('modelo.Cliente')}">
    					
    					<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5">
    						<h3>Cliente</h3>
    						<div class="container-fluid">
								<b>Nombre de Usuario:</b>${usuario.user}
							</div>
    						<p>
    							<b>Fecha de Nacimiento:</b> ${usuario.fechaNacimiento}
    						</p>
   							<p>
   								<b>RUN:</b> ${usuario.run}
   							</p>
        					<p>
        						<b>Nombres:</b> ${usuario.nombres}
        					</p>
        					<p>
        						<b>Apellidos:</b> ${usuario.apellidos}
        					</p>
        					<p>
        						<b>Teléfono:</b> ${usuario.telefonoCliente}
        					</p>
        					<p>
        						<b>AFP:</b> ${usuario.afp}
        					</p>
        					<p>
        						<b>Sistema de Salud:</b> ${usuario.sistemaSalud}
        					</p>
        					<p>
        						<b>Dirección:</b> ${usuario.direccionCliente}
        					</p>
        					<p>
        						<b>Comuna:</b> ${usuario.comunaCliente}
        					</p>
        					<p>
        						<b>Edad:</b> ${usuario.edad}
        					</p>
    					</div>
        				
    				</c:if>
    
    				<c:if test="${usuario.getClass().getName().equals('modelo.Profesional')}">
    					
    					<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5" >
    						<h3>Profesional</h3>
    						<p>
								<b>Nombre de Usuario:</b>${usuario.user}
							</p>
    						<p>
    							<b>Fecha de Nacimiento:</b> ${usuario.fechaNacimiento}
    						</p>
   							<p>
   								<b>RUN:</b> ${usuario.run}
   							</p>
        					<p>
        						<b>Título:</b> ${usuario.titulo}
        					</p>
        					<p>
        						<b>Fecha de Ingreso:</b> ${usuario.fechaIngreso}
        					</p>
    					</div>
        				
    				</c:if>
    
    				<c:if test="${usuario.getClass().getName().equals('modelo.Administrativo')}">
    					
    					<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5">
    						<h3>Administrativo</h3>
    						<p>
								<b>Nombre de Usuario:</b>${usuario.user}
							</p>
    						<p>
    							<b>Fecha de Nacimiento:</b> ${usuario.fechaNacimiento}
    						</p>
   							<p>
   								<b>RUN:</b> ${usuario.run}
   							</p>
        					<p>
        						<b>Área:</b> ${usuario.area}
        					</p>
        					<p>
        						<b>Experiencia Previa:</b> ${usuario.experienciaPrevia}
        					</p>
    					</div>
        				
    				</c:if>
    
    				
				</c:forEach>
		
			</div>
		</section>

</body>
</html>