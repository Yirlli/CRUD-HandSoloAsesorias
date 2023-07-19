package modelo;

public class Administrativo extends Usuario {
	
	private int administrativo_id;
	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
	}

	public Administrativo(int administrativo_id) {
		this.administrativo_id = administrativo_id;
	}

	public Administrativo(int administrativo_id, String area, String experienciaPrevia ) {

		// TODO Auto-generated constructor stub
		this.administrativo_id = administrativo_id;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public int getAdministrativo_id() {
		return administrativo_id;
	}

	public void setAdministrativo_id(int administrativo_id) {
		this.administrativo_id = administrativo_id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "AdministrativoDTO [administrativo_id=" + administrativo_id + ", area=" + area + ", experienciaPrevia="
				+ experienciaPrevia + "]";
	}

	


	
	
}
