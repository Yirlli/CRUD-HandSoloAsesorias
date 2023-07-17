package dao;

import java.sql.Connection;
import java.util.*;

import conexion.ConexionBD;

public class ConDao {
	
	private Connection conexion;
	

	public ConDao(Connection conexion) {
		super();
		this.conexion = conexion;
	}
	
	List<String> getAll(){
		ArrayList<String> listCapacitacion = new ArrayList<> ();
		return listCapacitacion;
		
	}

	
	
}
