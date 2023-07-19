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
	
	<h3 class="text-center p-2">Lista de Usuarios</h3>
    <c:forEach var="usuario" items="${listaUsuarios}">
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
</body>
</html>