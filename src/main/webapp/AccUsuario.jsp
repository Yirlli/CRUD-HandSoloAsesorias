<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Menu de usuarios</title>
</head>
<body>
<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<section class="fondo d-flex container-fluid vh-100 flex-column">
		<div class="bg-light-subtle d-flex flex-column justify-content-center align-items-center mt-5 rounded">
			<h1 class="mt-5">Menu de opciones para usuarios </h1>
			
				<div class="d-flex justify-content-center  align-self-center flex-column gap-4 mt-5 mb-5">
					<button class="btn btn-primary" ><a href="CrearUsuario">Crear Usuario</a></button>
					<button class="btn btn-secondary "><a href="ListarUsuario">Mostrar lista de Usuarios generales</a></button>
					<button class="btn btn-secondary"><a href="EditarUsuario">Editar Usuario</a></button>
					<button class="btn btn-secondary "><a href="EliminarUsuario">Eliminar Usuario</a></button>
				</div>
		</div>
		<div class="volver d-flex justify-content-center mt-5 mb-5">
		<a href="Index.jsp">Volver a página de inicio</a>
		</div>
	</section>

</body>
</html>