<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Insert title here</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex justify-content-center aligm-items-center container-fluid vh-100">
		<div class="w-75">
			<h2>Eliminar Profesional</h2>
			<form action="EliminarProfesional" method="post">
    			<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5 justify-content-center align-items-center">
    				<label class="form-label">Busqueda por ID</label>
    				<input type="text" placeholder="ingrese el ID del usuario a eliminar" name="id"required class="form-control w-50"> 
    				<div class="d-flex mt-5 gap-3">
    					<button class="btn btn-success"> Enviar</button>
    					<button class="btn btn-danger">Borrar</button>
    				</div>
    			</div>
    		</form>
    	</div>
	</section>
	<div class="volver mb-5 d-flex justify-content-center">
		<a href="Index.jsp">Volver a página de inicio</a>
	</div> 

</body>
</html>