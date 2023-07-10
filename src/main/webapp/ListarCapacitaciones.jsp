<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*" %> 
<%@page import="modelo.Capacitacion" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Listar Capacitaciones</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<h3 class="text-center p-1">Lista de capacitaciones</h3>
	<% 
		List<Capacitacion> listaCapacitacion = (List) request.getSession().getAttribute("listaCapacitacion");
		int cont = 1;
		for(Capacitacion capacitaciones: listaCapacitacion){
		
	
	%>
	<section class="fondo d-flex container-fluid ">
			<div class="listCapacitacion d-flex flex-column bg-white rounded-1 p-5">
				
				<div class="container-fluid">
					<p>
						<b>Identificador N°: </b><%=capacitaciones.getIdentificador().toString() %>
					</p>
					<p>
						<b>Rut del cliente: </b> <%=capacitaciones.getRutCliente().toString()%>
					</p>
					<p>	
						<b>Día :</b><%=capacitaciones.getDia() %>
					</p>
					<p>
						<b>Hora :</b><%=capacitaciones.getHora()%>
					</p>
					<p>
						<b>Lugar :</b><%=capacitaciones.getLugar()%>
					</p>
					<p>
						<b>Duración: </b><%=capacitaciones.getDuracion().toString() %>
					</p>
					<p>
						<b>Cantidad de asistentes : </b> <%=capacitaciones.getCantidadAsistentes().toString() %>
					</p>
				
				</div>
				
				
			</div>
		</section>
	
	<%} %>
	
	<div class="volver">
		<a href="Index.jsp">Volver a página de inicio</a>
	</div>



</body>
</html>