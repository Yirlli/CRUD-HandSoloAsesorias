<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Lista de Administrativos</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<h3 class="text-center p-2">Lista de Usuarios</h3>
    <c:forEach var="administrativo" items="${listaAdministrativos}">
        <section class="fondo d-flex container-fluid justify-content-center p-5">
            <div class="listCapacitacion d-flex  bg-white rounded-1 p-5 ">
                <div class="container-fluid">
                    <p><b>Identificador N�:</b> ${administrativo.administrativo_id}</p>
                    <p><b>Nombres:</b> ${administrativo.area}</p>
                    <p><b>Apellidos:</b> ${administrativo.experienciaPrevia}</p>
           
					
                </div>
            </div>
        </section>
    </c:forEach>

</body>
</html>