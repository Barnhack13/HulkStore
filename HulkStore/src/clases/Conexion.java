package clases;

import java.sql.*;



public class Conexion {
	
	private static final String Controlador = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/hulkstore?useSSL=false";
	private static final String USUARIO = "root";
	private static final String CLAVE = "1111";
	
	public Connection ConexionDB() {
		Connection conexion = null;
		try {
			Class.forName(Controlador);
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexión Exitosa");
		}catch (SQLException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return conexion;
	}
}