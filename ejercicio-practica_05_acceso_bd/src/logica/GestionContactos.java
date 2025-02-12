package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Contacto;

public class GestionContactos {
	
	private final String url="jdbc:mysql://localhost:3306/agenda";
	private final String user="root";
	private final String pwd="";
	
	public boolean agregar(String nombre, String email, int edad) {
		try (Connection con = DriverManager.getConnection(url, user, pwd)){
			if (buscar(email) == null) {
				String sql="INSERT INTO contactos (nombre,email,edad) VALUES(?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, nombre);
				ps.setString(2, email);
				ps.setInt(3, edad);
				ps.execute();
				return true;
			}
			return false;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public Contacto buscar(String email) {
		Contacto contacto = null;
		try(Connection con = DriverManager.getConnection(url, user, pwd)){
			String sql = "SELECT * FROM contactos WHERE email=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, email);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				contacto = new Contacto(rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad"));
			}
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return contacto;
	}
	
	public boolean eliminar(String email) {
		try(Connection con = DriverManager.getConnection(url, user, pwd)){
			String sql = "DELETE FROM contactos WHERE email=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			return ps.executeUpdate() > 0;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public List<Contacto> recuperarContactos(){
		var contactos = new ArrayList<Contacto>();
		try(Connection con = DriverManager.getConnection(url, user, pwd)){
			String sql = "SELECT * FROM contactos";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				contactos.add(new Contacto(rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad")));
			}		
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return contactos;
		
	}
	
	public List<Contacto> recuperarPorEdadMaxima(int edadMax){
		var contactos = new ArrayList<Contacto>();
		try(Connection con = DriverManager.getConnection(url, user, pwd)){
			String sql = "SELECT * FROM contactos WHERE edad<=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, edadMax);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				contactos.add(new Contacto(rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad")));
			}		
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return contactos;
	}
}
