package dto;

public class CapacitacionDTO {

	private int id;
	private String nombre;
	private String detalle;
	
	
	public CapacitacionDTO() {}
	
	public CapacitacionDTO(int id) {
		this.id = id;
	}
	
	public CapacitacionDTO(int id, String nombre, String detalle) {
		this.id = id;
		this.nombre = nombre;
		this.detalle= detalle;
		
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

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
}
