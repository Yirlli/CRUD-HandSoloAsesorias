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
				<h2>Editar usuario</h2>
				
    			
    				<form action="" method="post">
    					<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5 w-30">
    						<label class="form-label">Id</label>
    						<input type="text" placeholder="ingrese el ID del usuario a editar" required> 
    						<div class="d-flex">
    							<button class="btn"> Enviar</button>
    							<button class="btn">Borrar</button>
    						</div>
    						
    					</div>
    				</form>
    	
		</section>

</body>
</html>