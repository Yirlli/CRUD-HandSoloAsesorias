package modelo;

public class Usuario {

	private int id;
	private String nombre;
	private String tipo;
	
	public Usuario() {super();
	}

	public Usuario(int id) {super();
		this.id = id;
	}

	public Usuario(int id, String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
	
}
