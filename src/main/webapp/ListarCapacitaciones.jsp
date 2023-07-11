
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Listar Capacitaciones</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
 <h3 class="text-center p-1">Lista de capacitaciones</h3>
    <c:forEach var="capacitacion" items="${listaCapacitacion}">
        <section class="fondo d-flex container-fluid">
            <div class="listCapacitacion d-flex flex-column bg-white rounded-1 p-5">
                <div class="container-fluid">
                    <p><b>Identificador N°:</b> ${capacitacion.identificador}</p>
					<p><b>Rut del cliente:</b> ${capacitacion.rutCliente}</p>
					<p><b>Día:</b> ${capacitacion.dia}</p>
					<p><b>Hora:</b> ${capacitacion.hora}</p>
					<p><b>Lugar:</b> ${capacitacion.lugar}</p>
					<p><b>Duración:</b> ${capacitacion.duracion}</p>
					<p><b>Cantidad de asistentes:</b> ${capacitacion.cantidadAsistentes}</p>
                </div>
            </div>
        </section>
    </c:forEach>
	
	<div class="volver">
		<a href="Index.jsp">Volver a página de inicio</a>
	</div>



</body>
</html>