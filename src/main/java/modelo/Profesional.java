package modelo;

import java.time.LocalDate;

public class Profesional extends Usuario {

	private String titulo;
	private LocalDate  fechaIngreso;
	
	public Profesional() {
		
	}
	
	public Profesional(String user, LocalDate  fechaNacimiento, Integer run, String titulo, LocalDate fechaIngreso) {
		super(user, fechaNacimiento, run);
		this.titulo= titulo;
		this.fechaIngreso = fechaIngreso;
		
		
	}
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	@Override
	public String toString() {
		return "Profesional [\nNombre: " +getUser() + "\nRun : " +titulo+ fechaIngreso+"]" 
				;
	}
	
	
}
