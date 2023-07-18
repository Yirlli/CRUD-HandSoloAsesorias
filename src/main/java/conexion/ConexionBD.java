package conexion;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.CapacitacionDAO;

public class ConexionBD {
	
	public static final String PASSWORD = "Choco323*";
	public static final String URL = "jdbc:mysql://localhost:3306/handsolo";
	public static final String USER = "root";
	
	private static ConexionBD instance;
	private Connection conexion;
	
	 private ConexionBD() {
	
			 
			 try {
				 Class.forName("com.mysql.jdbc.Driver"); //DRIVER
				conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (ClassNotFoundException | SQLException e) {
				Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
			} // URL
	 }
		 
	
	 public static synchronized  ConexionBD estatus()  {
		 if(instance == null) {
			 instance = new ConexionBD();
		 }
		 return instance;
	 }
	
	 public Connection getConexion() {
		 return conexion;
	 }
	 
	 public void cerrarConexion() {
		 this.instance = null;
	 }
	
	

}
