package conexion;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	public static final String PASSWORD = "";
	public static final String URL = "";
	public static final String USER = "root";
	
	private static Connection conexion;
	
	 private ConexionBD() {
	    }
	
	public static Connection getConnection() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
        	conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conexion;
    }
	
	

}
