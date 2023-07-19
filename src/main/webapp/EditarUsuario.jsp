<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Editar Usuario</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex justify-content-center aligm-items-center container-fluid vh-100">
		<div class="listaUsuarios">
			<h3>Actualizar Usuario</h3>
    		<form action="EditarUsuario" method="post">
        		<input type="hidden" name="id" value="${id}" /> <!-- Aquí obtendrás el ID del usuario que deseas actualizar -->
       			<label for="nombre">Nombre:</label>
        		<input type="text" name="nombre" value="${nombre}" /> <!-- Aquí mostrarás el nombre actual del usuario a actualizar -->
        		<label for="tipo">Tipo:</label>
        		<input type="text" name="tipo" value="${tipo}" /> <!-- Aquí mostrarás el tipo actual del usuario a actualizar -->
        		<input type="submit" value="Actualizar" />
    		</form>
    	
	</section>

</body>
</html>