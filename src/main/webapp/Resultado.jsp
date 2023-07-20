<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Resultado</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<section class="fondo d-flex container-fluid vh-100 flex-column">
		<div class="bg-light-subtle d-flex flex-column justify-content-center align-items-center mt-5 rounded h-75">
	
			<h3 class="mt-5"><%=request.getParameter("msg") %></h3>
				
		</div>
		<div class="volver d-flex justify-content-center mt-5 mb-5">
		<a href="Index.jsp">Volver a página de inicio</a>
		</div>
	</section>
</body>
</html>