<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Creado Sarisfactoriamente</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<section class="fondo d-flex container-fluid vh-100 flex-column">
		<div class="bg-light-subtle d-flex flex-column justify-content-center align-items-center mt-5 rounded">
			<h1 class="mt-5">Capacitación creada satisfactoriamente</h1>
			<svg class="mt-5"xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-check-square" viewBox="0 0 16 16">
  			<path d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
  			<path d="M10.97 4.97a.75.75 0 0 1 1.071 1.05l-3.992 4.99a.75.75 0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093 3.473-4.425a.235.235 0 0 1 .02-.022z"/>
			</svg>
		<div class="d-flex justify-content-center  p-5  gap-3">
			<button class="btn btn-primary" ><a href="CrearCapacitacion">Crear otra capacitación</a></button>
			<button class="btn btn-secondary"><a href="ListarCapacitaciones">Mostrar lista creada</a></button>
		</div>
	</div>
	<div class="volver d-flex justify-content-center">
		<a href="Index.jsp">Volver a página de inicio</a>
	</div>
	</section>

</body>
</html>