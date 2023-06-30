package modelo;

public class Administrativo extends Usuario{

	private String area;
	private String experienciaPrevia;
	
	
	public Administrativo() {
		
	}
	
	public Administrativo(String nombre, String  fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		
		
		
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
		return "Administrativo [Nombre : "+ getNombre()+ " area : "+ area + " Experiencia previa " + experienciaPrevia +  "]";
	}
	 
}
