package modelo;

public class Capacitacion {

	private Integer id;
	private String nombre;
	private String detalle;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private Integer duracion;
	private Integer cantidadAsistentes;
	
	
	public Capacitacion() {}
	
	public Capacitacion(int id) {
		this.id = id;
	}

	public Capacitacion(Integer id, String nombre, String detalle, Integer rutCliente, String dia, String hora,
		String lugar, Integer duracion, Integer cantidadAsistentes) {
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(Integer cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", rutCliente=" + rutCliente
				+ ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
				+ ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}
	
	

	
	
}
