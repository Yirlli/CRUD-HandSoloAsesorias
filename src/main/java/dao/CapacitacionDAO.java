package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import conexion.ConexionBD;
import interfaces.Crud;
import modelo.Capacitacion;

public class CapacitacionDAO implements Crud<Capacitacion>{
	
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
	private static final String SQL_INSERT = "INSERT INTO Capacitaciones (nombre, detalle) VALUES(?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE ="DELETE FROM Capacitaciones where id =?";
	private static final String SQL_UPDATE ="UPDATE Capacitaciones SET nombre=?, detalle=?, rut_cliente=?, dia=?, hora=?, lugar=?, duracion=?, cantidad_asistentes=? WHERE id=?";
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
		ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaCapacitaciones.add(new Capacitacion(res.getInt(1), res.getString(2),res.getString(3),res.getInt(4),res.getString(5),
						res.getString(6),res.getString(7),res.getInt(8),res.getInt(9)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(CapacitacionDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaCapacitaciones;
	}

	@Override
	public void create(Capacitacion c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		 ResultSet generatedKeys;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getNombre());
		ps.setString(2, c.getDetalle());
		ps.setInt(3, c.getRutCliente());
		ps.setString(4, c.getDia());
		ps.setString(5, c.getHora());
		ps.setString(6, c.getLugar());
		ps.setInt(7, c.getDuracion());
		ps.setInt(8, c.getCantidadAsistentes());
		ps.executeUpdate();
		
		 generatedKeys = ps.getGeneratedKeys();
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
	public boolean update(Capacitacion c) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getDetalle());
			ps.setInt(3, c.getRutCliente());
			ps.setString(4, c.getDia());
			ps.setString(5, c.getHora());
			ps.setString(6, c.getLugar());
			ps.setInt(7, c.getDuracion());
			ps.setInt(8, c.getCantidadAsistentes());
			ps.setInt(9, c.getId());
			
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
		Capacitacion capacitaciones = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				capacitaciones = new Capacitacion(res.getInt(1), res.getString(2),res.getString(3),res.getInt(4),res.getString(5),
						res.getString(6),res.getString(7),res.getInt(8),res.getInt(9));
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
