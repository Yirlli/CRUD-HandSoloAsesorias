package modelo;

public class Capacitacion {
	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private Integer duracion;
	private Integer cantidadAsistentes;

	
	
	public Capacitacion() {

	}


	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar, Integer duracion,
			Integer cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion*60;
		this.cantidadAsistentes = cantidadAsistentes;
	}


	public Integer getIdentificador() {
		return identificador;
	}


	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
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

	
	
}