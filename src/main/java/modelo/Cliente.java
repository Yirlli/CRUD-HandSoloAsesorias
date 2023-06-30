package modelo;



public class Cliente extends Usuario {
	

	private String apellidos;
	private Integer telefono;
	private String afp;
	private int sistemaDeSalud;
	private String direccion;
	private String comuna;
	private Integer edad;
	

	public Cliente() {
		
	}
	
	public Cliente(String nombre, String fechaNacimiento, Integer run, String apellidos, Integer telefono,  String afp, int sistemaDeSalud, String direccion, String comuna, Integer edad) {
		super(nombre, fechaNacimiento, run);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud =sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
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



	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}



	public void setSistemaDeSalud(int sistemaDeSalud) {
		
		this.sistemaDeSalud = sistemaDeSalud;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}



	public String getComuna() {
		return comuna;
	}



	public void setComuna(String comuna) {
		this.comuna = comuna;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		
		this.edad = edad;
	}

	public String obtenerNombre() {
		return "El nombre completo es :" +getNombre() + "" +apellidos;
	}
	
	//con este metodo al ser el sistema de salud del tipo int (ingresando num solo 1 o 2) con las condicionales podemos retonar un valor especificado
	 public String obtenerSistemaSalud() {
	        if (sistemaDeSalud == 1) {
	            return "Fonasa";
	        } else if (sistemaDeSalud == 2) {
	            return "Isapre";
	        } else {
	            return "Desconocido";
	        }
	    }
	 

	
	@Override
	public String toString() {
		return "Cliente [Nombre " + getNombre() + "\nApellidos :" + apellidos + "\nRun " +getRun() +"\n"+ "\nTelefono : (+569) " + telefono + " \nAFP : " +obtenerSistemaSalud() + "]";
	}

}
