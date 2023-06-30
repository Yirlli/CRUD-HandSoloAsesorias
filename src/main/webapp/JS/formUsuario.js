/**
 * 
 */
 
const selecTipoUsuario =document.getElementById('tipoUsuario');
const datosCliente = document.querySelector('.campoCliente');
const datosProf = document.querySelector('.campoProfesional');
const datosAdmin = document.querySelector('.campoAdministrativo');

selecTipoUsuario.addEventListener('change', function() {
    // Obtener el valor seleccionado
    let tipoSeleccionado = selecTipoUsuario.value;
    console.log(tipoSeleccionado);


    // Mostrar el conjunto de datos correspondiente al tipo seleccionado
    if (tipoSeleccionado == 'Cliente') {
      	datosCliente.classList.remove('d-none');
      	datosAdmin.classList.add('d-none');
         datosProf.classList.add('d-none');
            
        
    } else if (tipoSeleccionado == 'Profesional') {
         datosProf.classList.remove('d-none');
         datosAdmin.classList.add('d-none');
         datosCliente.classList.add('d-none');
        
        
    } else if (tipoSeleccionado == 'Administrativo') {
         datosAdmin.classList.remove('d-none');
         datosProf.classList.add('d-none');
         datosCliente.classList.add('d-none');
        
    }else if (tipoSeleccionado == 'despliegue') {
         datosAdmin.classList.add('d-none');
         datosProf.classList.add('d-none');
         datosCliente.classList.add('d-none');
         }
});