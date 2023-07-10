package modelo;

import java.time.LocalDate;

public abstract class Usuario {
	
	
		private String user;
		private LocalDate fechaNacimiento;
		private Integer run;

		
		public Usuario() {}

		public Usuario (String user, LocalDate fechaNacimiento, Integer run){
			this.user = user;
			this.fechaNacimiento = fechaNacimiento;
			this.run = run;
			
			
		}


		public String getUser(){
			return user;
		}
		
		public void setUser(String nombre) {

			this.user = user;
		}
		

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			
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
			return "Nombre: " + user + " \n RUT " + run + " \n Fecha de nacimiento " + fechaNacimiento;
		}

		


}
