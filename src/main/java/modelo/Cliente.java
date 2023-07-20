package modelo;

public class Cliente extends Usuario{
	private int cliente_id;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private String sistemaSalud;
	private String direccionCliente;
	private String comunaCliente;
	private Integer edad;
	
	public Cliente() {
	}

	public Cliente(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Cliente(int cliente_id, String nombres, String apellidos, String telefono, String afp,
			String sistemaSalud, String direccionCliente, String comunaCliente, Integer edad) {
		super();
		this.cliente_id = cliente_id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccionCliente = direccionCliente;
		this.comunaCliente = comunaCliente;
		this.edad = edad;
	}

	public Cliente(int id, String nombre, String tipo) {
		super(id, nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getComunaCliente() {
		return comunaCliente;
	}

	public void setComunaCliente(String comunaCliente) {
		this.comunaCliente = comunaCliente;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "ClienteDTO [cliente_id=" + cliente_id + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccionCliente="
				+ direccionCliente + ", comunaCliente=" + comunaCliente + ", edad=" + edad + "]";
	}
	
	
	
	
	

}
