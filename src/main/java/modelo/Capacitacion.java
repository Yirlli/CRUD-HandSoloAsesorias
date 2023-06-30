package modelo;

public class Capacitacion {
	private String identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private String cantidadAsistentes;

	
	
	public Capacitacion() {

	}


	public Capacitacion(String identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
			String cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(String rutCliente) {
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


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getCantidadAsistentes() {
		return cantidadAsistentes;
	}


	public void setCantidadAsistentes(String cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	
	
}