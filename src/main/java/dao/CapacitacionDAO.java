package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.ConexionBD;
import dto.CapacitacionDTO;
import interfaces.Crud;

public class CapacitacionDAO implements Crud<CapacitacionDTO>{
	
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
	private static final String SQL_INSERT = "INSERT INTO Capacitaciones (nombre, detalle) VALUES(?,?)";
	private static final String SQL_DELETE ="DELETE FROM Capacitaciones where id =?";
	private static final String SQL_UPDATE ="UPDATE Capacitaciones SET nombre=?, detalle=? WHERE id=?";
	private static final String SQL_READ ="SELECT * FROM Capacitaciones WHERE id=?";
	private static final String SQL_READALL ="SELECT * FROM Capacitaciones";
	
	// se especifica la base de datos a la cual se va a conectar
	
	private static final ConexionBD conexion = ConexionBD.estatus();
	
	
	
	//se implementan los metodos CRUD de la interfaz, cambiando a la clase que se ocupara

	@Override
	public List readAll() {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		ResultSet res;
		ArrayList<CapacitacionDTO> listaCapacitaciones = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaCapacitaciones.add(new CapacitacionDTO(res.getInt(1), res.getString(2),res.getString(3)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaCapacitaciones;
	}

	@Override
	public void create(CapacitacionDTO c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT);
		ps.setString(1, c.getNombre());
		ps.setString(2, c.getDetalle());
		ps.executeUpdate();
		
		 ResultSet generatedKeys = ps.getGeneratedKeys();
         if (generatedKeys.next()) {
             int idGenerado = generatedKeys.getInt(1);
             c.setId(idGenerado);
         }
        }catch(SQLException e) {
        	Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_DELETE);
			ps.setString(1, key.toString());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
		}catch (SQLException e){
			Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		
		return false;
	}

	@Override
	public boolean update(CapacitacionDTO c) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getDetalle());
			ps.setInt(3, c.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		}catch(SQLException e) {
			Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return false;
	}

	@Override
	public Object read(Object key) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		ResultSet res;
		CapacitacionDTO capacitaciones = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				capacitaciones = new CapacitacionDTO(res.getInt(1),res.getString(2), res.getString(3));
			}
			return capacitaciones;
		}catch(SQLException e) {
			Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return capacitaciones;
	}

}
