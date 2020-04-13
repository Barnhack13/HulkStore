package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import views.FormLogin;
import views.FormPpal;

@SuppressWarnings("serial")
public class Login extends FormLogin{
	
	public void IngresoLogin(String Id,String Clave) {
				
		try {
			//Variable que contiene la consult SQL
			java.sql.PreparedStatement snit;
			//Variale que contiene el reaultado de la consulta SQL
			ResultSet rnit;
			//Valida si los campos estan vacios.
			if ((Id.equals("")) || (Clave.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
			}else{
				//Abro la conexion a la base de datos;
				Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("SELECT Id,Clave from Empleados where Id = "+Id+" and Clave = "+Clave+"");
				//Ejecucion de la instruccion SQL.
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if (rnit.next()) {
					//Abro el formulario Principal
					FormPpal ppal = new FormPpal();
					ppal.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"INGRESO INCORRECTO");
						Id = " ";
						Clave = " ";
						//Cierre de la conexion a la base de datos.
						snit.close();
					}
				}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			System.out.println(e);
			}
		finally {
			FormLogin login = new FormLogin();
			login.setVisible(false);
		}
	}
}
