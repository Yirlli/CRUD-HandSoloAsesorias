package modelo;

import java.time.LocalDate;

public class Cliente extends Usuario {
	
	private String nombres;
	private String apellidos;
	private Integer telefono;
	private String afp;
	private Integer sistemaSalud;
	private String direccionCliente;
	private String comunaCliente;
	private Integer edad;
	

	public Cliente() {
		
	}
	
	public Cliente(String user, LocalDate fechaNacimiento, Integer run, String nombres,String apellidos, Integer telefono,  String afp, Integer sistemaSalud, String direccionCliente, String comunaCliente, Integer edad) {
		super(user, fechaNacimiento, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud =sistemaSalud;
		this.direccionCliente = direccionCliente;
		this.comunaCliente = comunaCliente;
		this.edad = edad;
	}


	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
	
		this.telefono = telefono;
	}



	public String getAfp() {
		return afp;
	}



	public void setAfp(String afp) {
		
		this.afp = afp;
	}



	public Integer getSistemaSalud() {
		return sistemaSalud;
	}



	public void setSistemaSalud(Integer sistemaDeSalud) {
		
		this.sistemaSalud = sistemaDeSalud;
	}



	public String getDireccion() {
		return direccionCliente;
	}



	public void setDireccion(String direccion) {
		
		this.direccionCliente = direccion;
	}



	public String getComuna() {
		return comunaCliente;
	}



	public void setComuna(String comuna) {
		this.comunaCliente = comuna;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		
		this.edad = edad;
	}

	public String obtenerNombre() {
		return "El nombre completo es :" +getUser() + "" +apellidos;
	}
	
	//con este metodo al ser el sistema de salud del tipo int (ingresando num solo 1 o 2) con las condicionales podemos retonar un valor especificado
	 public String obtenerSistemaSalud() {
	        if (sistemaSalud == 1) {
	            return "Fonasa";
	        } else if (sistemaSalud == 2) {
	            return "Isapre";
	        } else {
	            return "Desconocido";
	        }
	    }
	 

	
	@Override
	public String toString() {
		return "Cliente [Nombre " + getUser() + "\nApellidos :" + apellidos + "\nRun " +getRun() +"\n"+ "\nTelefono : (+569) " + telefono + " \nAFP : " +obtenerSistemaSalud() + "]";
	}

}
