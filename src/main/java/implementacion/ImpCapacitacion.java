package implementacion;

import java.util.*;

import interfaces.InterCapacitacion;
import modelo.Capacitacion;

public class ImpCapacitacion implements InterCapacitacion{
	
	private List<Capacitacion> listaCapacitacion;
	


	@Override
	public void registrarCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		listaCapacitacion = new ArrayList<>();
		Capacitacion capacitacion1 = new Capacitacion(450, 76154870, "lunes", "10:00", "Las condes 450", 500, 8);
		Capacitacion capacitacion2 = new Capacitacion(788, 71854870, "martes", "12:00", "Av Vitacura 23", 90, 30);
		Capacitacion capacitacion3 = new Capacitacion(023, 73123871, "viernes", "18:00", "Conchali calle Manuel 23", 180, 15);
		
		listaCapacitacion.add(capacitacion1);
		listaCapacitacion.add(capacitacion2);
		listaCapacitacion.add(capacitacion3);
		listaCapacitacion.add(capacitacion);
		 for (Capacitacion capacitaciones: listaCapacitacion) {
		        System.out.println("Datos de la capacitacion:");
		        System.out.println("Identificador: " + capacitaciones.getIdentificador());
		        System.out.println("Rut del cliente: " + capacitaciones.getRutCliente());
		        System.out.println("Día: " + capacitaciones.getDia());
		        System.out.println("Hora: " + capacitaciones.getHora());
		        System.out.println("Lugar: " + capacitaciones.getLugar());
		        System.out.println("Duración: " + capacitaciones.getDuracion());
		        System.out.println("Cantidad de asistentes: " +capacitaciones.getCantidadAsistentes());
		        System.out.println("-------------");
		 }
		}
		
	@Override
	public List<Capacitacion> mostrarCapacitacion() {
		// TODO Auto-generated method stub
	
		return listaCapacitacion;
	}
	
	

}
