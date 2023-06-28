<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*" %> 
<%@page import="Controller.Capacitacion" %>  
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
	<% 
		List<Capacitacion> listaCapacitacion = (List) request.getSession().getAttribute("listaCapacitacion");
		int cont = 1;
		for(Capacitacion capacitaciones: listaCapacitacion){
		
	
	%>
	<section class="fondo d-flex  ">
			<div class="listCapacitacion">
				<p><b>Capacitacion N°<%=cont %></b></p>
				<p><b>Identificador N°<%=capacitaciones.getIdentificador() %></b></p>
				<p><b>Rut del cliente <%=capacitaciones.getRutCliente()%></b></p>
				<p><b>Día <%=capacitaciones.getDia() %></b></p>
				<p><b>Hora<%=capacitaciones.getHora()%></b></p>
				<p><b>Lugar<%=capacitaciones.getLugar()%></b></p>
				<p><b>Duración <%=capacitaciones.getDuracion() %></b></p>
				<p><b>Cantidad de asistentes <%=capacitaciones.getCantidadAsistentes() %></b></p>
				<p>-----------------------------------------------</p>
			</div>
		</section>
	
	<%} %>



</body>
</html>