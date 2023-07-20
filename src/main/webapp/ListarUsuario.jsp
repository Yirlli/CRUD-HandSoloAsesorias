<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	
    <c:forEach var="usuario" items="${listaUsuarios}">
    <h3 class="text-center p-2">Lista de Usuarios</h3>
        <section class="fondo d-flex container-fluid justify-content-center p-5">
            <div class="listCapacitacion d-flex  bg-white rounded-1 p-5 ">
                <div class="container-fluid">
                    <p><b>Identificador N°:</b> ${usuario.id}</p>
                    <p><b>Nombre de usuario:</b> ${usuario.nombre}</p>
                    <p><b>Tipo de Usuario:</b> ${usuario.tipo}</p>
                
                  
					
                </div>
            </div>
        </section>
    </c:forEach>
    <c:forEach var="usuario" items="${listaAdministrativos}">
    <h3 class="text-center p-2">Lista de Clientes</h3>
        <section class="fondo d-flex container-fluid justify-content-center p-5">
        
            <div class="listCapacitacion d-flex  bg-white rounded-1 p-5 ">
            	
                <div class="container-fluid">
                    <p><b>Identificador N°:</b> ${usuario.administrativo_id}</p>
                    <p><b>Area:</b> ${usuario.area}</p>
                    <p><b>Experiencia Previa:</b> ${usuario.experienciaPrevia}</p>
                
                  
					
                </div>
            </div>
        </section>
    </c:forEach>
     <c:forEach var="profesional" items="${listaProfesionales}">
     <h3 class="text-center p-2">Lista de Profesionales</h3>
        <section class="fondo d-flex container-fluid justify-content-center p-5">
            <div class="listCapacitacion d-flex  bg-white rounded-1 p-5 ">
                <div class="container-fluid">
                    <p><b>Identificador N°:</b> ${profesional.profesional_id}</p>
                    <p><b>Titulo:</b> ${profesional.titulo}</p>
                    <p><b>Fecha de Ingreso:</b> ${profesional.fechaIngreso}</p>
                    
                  
					
                </div>
            </div>
        </section>
    </c:forEach>
     <c:forEach var="cliente" items="${listaClientes}">
     <h3 class="text-center p-2">Lista de Clientess</h3>
        <section class="fondo d-flex container-fluid justify-content-center p-5">
            <div class="listCapacitacion d-flex  bg-white rounded-1 p-5 ">
                <div class="container-fluid">
                    <p><b>Identificador N°:</b> ${cliente.cliente_id}</p>
                    <p><b>Nombres:</b> ${cliente.nombres}</p>
                    <p><b>Apellidos:</b> ${cliente.apellidos}</p>
                    <p><b>Telefono:</b> ${cliente.telefono}</p>
                    <p><b>AFP:</b> ${cliente.afp}</p>
                    <p><b>Sistema de salud:</b> ${cliente.sistemaSalud}</p>
                    <p><b>Direccion:</b> ${cliente.direccionCliente}</p>
                    <p><b>Comuna:</b> ${cliente.comunaCliente}</p>
                    <p><b>Edad:</b> ${cliente.edad}</p>
                
                  
					
                </div>
            </div>
        </section>
    </c:forEach>
    
    
</body>
</html>