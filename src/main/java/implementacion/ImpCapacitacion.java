package implementacion;

import java.util.*;

import interfaces.InterCapacitacion;
import modelo.Capacitacion;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImpCapacitacion implements InterCapacitacion{
	
	private List<Capacitacion> listaCapacitacion;
	


	@Override
	public void registrarCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO capacitaciones (identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		
		try (Connection conexion= ConexionBD.getConnection();
	             PreparedStatement statement = conexion.prepareStatement(sql)) {
	            statement.setInt(1, capacitacion.getIdentificador());
	            statement.setInt(2, capacitacion.getRutCliente());
	            statement.setString(3, capacitacion.getDia());
	            statement.setString(4, capacitacion.getHora());
	            statement.setString(5, capacitacion.getLugar());
	            statement.setInt(6, capacitacion.getDuracion());
	            statement.setInt(7, capacitacion.getCantidadAsistentes());

	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
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
		String sql = "SELECT * from capacitaciones identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes FROM capacitaciones";
        try (Connection conexion = ConexionBD.getConnection();
             PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int identificador = resultSet.getInt("identificador");
                int rutCliente = resultSet.getInt("rutCliente");
                String dia = resultSet.getString("dia");
                String hora = resultSet.getString("hora");
                String lugar = resultSet.getString("lugar");
                int duracion = resultSet.getInt("duracion");
                int cantidadAsistentes = resultSet.getInt("cantidadAsistentes");

                Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
                listaCapacitacion.add(capacitacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCapacitacion;
    }
	


}
