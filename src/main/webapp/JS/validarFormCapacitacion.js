document.addEventListener('DOMContentLoaded', function() {
  const form = document.getElementById('form');
  const nombre = document.getElementById('nombre');
  const rutCliente = document.getElementById('rutCliente');
  const dia = document.getElementById('dia');
  const hora = document.getElementById('hora');
  const lugar = document.getElementById('lugar');
  const duracion = document.getElementById('duracion');
  const cantidadAsistentes = document.getElementById('cantidadAsistentes');
  const listInputs = document.querySelectorAll('.form-control');

	function validarForm() {
		listInputs.forEach(element => {
			if (element && element.parentElement.querySelector('.msjError')) {
       		element.parentElement.querySelector('.msjError').innerHTML = '';
      		}
    	});


	if (nombre.value.length < 10 || nombre.value.length > 50 || nombre.value.trim() === "") {
      mostrarMensajeError(lugar, "Campo invalido, debe contener entre 10 y 50 caracteres");
      return false;
    }
    if (rutCliente.value.trim() === '' || isNaN(rutCliente.value)) {
      mostrarMensajeError(rutCliente, "Campo Obligatorio, Ingrese el rut del cliente");
      return false;
    }

    const diaValue = dia.value.trim().toLowerCase();
    const diasPermitidos = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes', 'sabado', 'domingo'];

    if (dia.value.trim() === '' || !diasPermitidos.includes(diaValue)) {
      mostrarMensajeError(dia, "Por favor, ingrese un dia valido, comprendido entre lunes a domingo");
     return false;
    }

    const horaValue = hora.value.trim();
    const horaPattern = /^([01]\d|2[0-3]):([0-5]\d)$/;

    if (hora.value.trim() === '' || !horaPattern.test(horaValue)) {
      mostrarMensajeError(hora, "Por favor, ingrese una hora valida, comprendida en formato hh:mm, de 00 a 23 horas y 00 a 59 minutos");
      return false;
    }

    if (lugar.value.length < 10 || lugar.value.length > 50 || lugar.value.trim() === "") {
      mostrarMensajeError(lugar, "Campo invalido, debe contener entre 10 y 50 caracteres");
      return false;
    }

    if (duracion.value.trim() === "" || !Number.isInteger(parseInt(duracion.value))) {
      mostrarMensajeError(duracion, "Campo invalido, debe contener un numero entero");
      return false;
    }

    if (cantidadAsistentes.value.trim() === "" || !Number.isInteger(parseInt(cantidadAsistentes.value))) {
      mostrarMensajeError(cantidadAsistentes, "Campo invalido, debe contener un numero entero");
     return false;
    }

    return true;
  }

	function mostrarMensajeError(elemento, mensaje) {
	const contenedor = elemento.parentElement;
    const mensajeError = contenedor.querySelector('.msjError');
    if (mensajeError) {
    mensajeError.innerHTML = mensaje;
    }
  }

	form.addEventListener('submit', (e) => {
		e.preventDefault();

		if (validarForm()) {
    		Swal.fire({
  		title: 'Esta seguro que los datos ingresadas son correctos?',
  		icon: 'success',
  		showCancelButton: true,
  		confirmButtonText: 'Si, enviar',
  		cancelButtonText: 'No',
		}).then((result) => {
  			if (result.isConfirmed) {

            form.submit(); 
        } else {
            Swal.fire({
                title: 'Operación cancelada',
                icon: 'info',
                confirmButtonText: 'Aceptar',
            })
      			}
    			});
  			}	
 	});
});