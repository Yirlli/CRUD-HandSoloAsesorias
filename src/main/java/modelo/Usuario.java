package modelo;


public abstract class Usuario {
	
	
		private String nombre;
		private String fechaNacimiento;
		private Integer run;

		
		public Usuario() {}

		public Usuario (String nombre, String fechaNacimiento, Integer run){
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
			this.run = run;
			
			
		}


		public String getNombre(){
			return nombre;
		}
		
		public void setNombre(String nombre) {

			this.nombre = nombre;
		}
		

		public String  getFechaNacimiento() {
			return fechaNacimiento;
		}
		
		public void setFechaNacimiento(String fechaNacimiento) {
			
			this.fechaNacimiento = fechaNacimiento;
		}
		public  Integer getRun() {
			return run;
		}
		
		public void setRut( Integer run) {
			
			this.run= run;
		}
		
		@Override 
		public String toString() {
			return "Nombre: " + nombre + " \n RUT " + run + " \n Fecha de nacimiento " + fechaNacimiento;
		}

		


}
