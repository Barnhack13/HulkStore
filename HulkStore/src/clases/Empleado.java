package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import views.Empleado.FormActualizarEmp;

@SuppressWarnings("serial")
public class Empleado extends FormActualizarEmp{
	
	//Variable que contiene la consult SQL
		java.sql.PreparedStatement snit;
		//Variale que contiene el reaultado de la consulta SQL
		ResultSet rnit;
		
		public void NuevoEmpleado(String Id, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Direccion, String Barrio, String Telefono, String Estado) {

			try {
				//Valida si los campos estan vacios.
				if ((Id.equals("")) || (Nombre1.equals("")) || (Nombre2.equals("")) || (Apellido1.equals("")) || (Apellido2.equals("")) || (Direccion.equals("")) || (Barrio.equals("")) || (Telefono.equals("")) || (Estado.equals(""))) {
					JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
					//System.out.println("Ningun campo debe estar vacio ");
				}else{
					Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
					//Instrucion para crear la consulta SQL.
					PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("INSERT INTO Empleados (Id,Nombre1,Nombre2,Apellido,Apellido2,Direccion,Barrio,Telefono,Estado) VALUES (?,?,?,?,?,?,?,?,?)");
					//Envio de los datos tomados del fomulario a la instruccion SQL.
					datos.setString(1,Id);
					datos.setString(2,Nombre1);
					datos.setString(3,Nombre2);
					datos.setString(4,Apellido1);
					datos.setString(5,Apellido2);
					datos.setString(6,Direccion);
					datos.setString(7,Barrio);
					datos.setString(8,Telefono);
					datos.setString(9,Estado);
					//Ejecucion de la instruccion SQL.
					datos.executeUpdate();
					//Cierre de la conexion a la base de datos.
					datos.close();
					JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO");
				}
			}catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
				System.out.println(e);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de Conexíon");
				System.out.println(e);
				e.printStackTrace();
			}
		}
		
		public void ActulizarEmpleado(String Id, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Direccion, String Barrio, String Telefono, String Estado) {

			try {
				//Valida si los campos estan vacios.
				if ((Id.equals("")) || (Nombre1.equals("")) || (Nombre2.equals("")) || (Apellido1.equals("")) || (Apellido2.equals("")) || (Direccion.equals("")) || (Barrio.equals("")) || (Telefono.equals("")) || (Estado.equals(""))) {
					JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
					//System.out.println("Ningun campo debe estar vacio ");
				}else{
					Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
					//Instrucion para crear la consulta SQL.
					PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("UPDATE Empleados Nombre1="+Nombre1+",Nombre2="+Nombre2+",Apellido1="+Apellido1+",Apellido2"+Apellido2+",Direccion="+Direccion+",Barrio="+Barrio+",Telefono="+Telefono+",Estado="+Estado+" WHERE Id = "+Id+"");
					//Envio de los datos tomados del fomulario a la instruccion SQL.
					datos.setString(1,Id);
					datos.setString(2,Nombre1);
					datos.setString(3,Nombre2);
					datos.setString(4,Apellido1);
					datos.setString(5,Apellido2);
					datos.setString(6,Direccion);
					datos.setString(7,Barrio);
					datos.setString(8,Telefono);
					datos.setString(9,Estado);
					//Ejecucion de la instruccion SQL.
					datos.executeUpdate();
					//Cierre de la conexion a la base de datos.
					datos.close();
					JOptionPane.showMessageDialog(null,"Empleado ACTUALIZADO");
				}
			}catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
				System.out.println(e);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Error de Conexíon");
				System.out.println(e);
				e.printStackTrace();
			}
		}
		
		public void SoloConsultaEmpleado(String Id) {

			//String Direccion,Barrio,Telefono,Estado;
	        try{
	        	
	        	//Valido si el campo contiene datos
				if ((Id.equals(""))) {
					JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
				}else{
					//Abro la conexion a base de datos
					Conexion conexion = new Conexion();
					//Instrucion para crear la consulta SQL.
					snit = conexion.ConexionDB().prepareStatement("SELECT * from Empleados where Id = "+Id+"");
					//Ejecuto la consulta y la cuardo en un a variable
					rnit = snit.executeQuery();
					//Valido si la consulta tiene algun valor
					if(rnit.next()){
						JOptionPane.showMessageDialog(null, "EL Empleado YA EXISTE");
					}else {
						JOptionPane.showMessageDialog(null, "EL Empleado NO EXISTE");
					}
					//Cierro la conexion a basde de datos
					snit.close();
				}
			}catch(SQLException e){
	            	JOptionPane.showMessageDialog(null, e);
	        }
		}
		
		public void ConsultaEmpleadoActualiza(String Id, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Direccion, String Barrio, String Telefono, String Estado) {

			//String Direccion,Barrio,Telefono,Estado;
	        try{
	        	//Valido si el campo contiene datos
				if ((Id.equals(""))) {
					JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
				}else{
					//Abro la conexion a base de datos
					Conexion conexion = new Conexion();
					//Instrucion para crear la consulta SQL.
					snit = conexion.ConexionDB().prepareStatement("SELECT * from Empleados where Id = "+Id+"");
					//Ejecuto la consulta y la cuardo en un a variable
					rnit = snit.executeQuery();
					//Valido si la consulta tiene algun valor
					if(rnit.next()){
						txtPNombreEmp.setText(rnit.getString(2));
						txtSNombreEmp.setText(rnit.getString(3));
						txtPApellidoEmp.setText(rnit.getString(4));
						txtSApellidoEmp.setText(rnit.getString(4));
						txtDirEmp.setText(rnit.getString(6));
						txtBarrioEmp.setText(rnit.getString(7));
						txtTelEmp.setText(rnit.getString(8));
						txtEstadoEmp.setText(rnit.getString(9));
						System.out.println(rnit.getString(2)+rnit.getString(3)+rnit.getString(4)+rnit.getString(5)+rnit.getString(6)+rnit.getString(7));
						JOptionPane.showMessageDialog(null, "EL Empleado YA EXISTE");
					}else {
						JOptionPane.showMessageDialog(null, "EL Empleado NO EXISTE");
					}
					//Cierro la conexion a basde de datos
					snit.close();
				}
			}catch(SQLException e){
	            	JOptionPane.showMessageDialog(null, e);
	        }
		}
		
		public void BorrarEmpleado(String Id) {

	        try{
	        	//Valido si el campo contiene datos
				if ((Id.equals(""))) {
					JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
				}else{
					//Abro la conexion a base de datos
					Conexion conexion = new Conexion();
					//Instrucion para crear la consulta SQL.
					snit = conexion.ConexionDB().prepareStatement("DELETE * from Empleados where Id = "+Id+"");
					//Ejecuto la consulta y la cuardo en un a variable
					rnit = snit.executeQuery();
					//Valido si la consulta tiene algun valor
					if(rnit.next()){
						JOptionPane.showMessageDialog(null, "EL Empleado FUE ELIMINADO");
					}else {
						JOptionPane.showMessageDialog(null, "EL Empleado NO EXISTE");
					}
					//Cierro la conexion a basde de datos
					snit.close();
				}
			}catch(SQLException e){
	            	JOptionPane.showMessageDialog(null, e);
	        }
		}

}