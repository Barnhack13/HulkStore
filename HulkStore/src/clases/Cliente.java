package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import views.Cliente.FormActualizarCli;


@SuppressWarnings("serial")
public class Cliente extends FormActualizarCli{
	
	//Variable que contiene la consult SQL
	java.sql.PreparedStatement snit;
	//Variale que contiene el reaultado de la consulta SQL
	ResultSet rnit;
	
	public void NuevoCliente(String Id, String Nombre, String Apellido, String Direccion, String Barrio, String Telefono, String Estado) {

		try {
			//Valida si los campos estan vacios.
			if ((Id.equals("")) || (Nombre.equals("")) || (Apellido.equals("")) || (Direccion.equals("")) || (Barrio.equals("")) || (Telefono.equals("")) || (Estado.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
				//System.out.println("Ningun campo debe estar vacio ");
			}else{
				Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
				//Instrucion para crear la consulta SQL.
				PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("INSERT INTO clientes (Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado) VALUES (?,?,?,?,?,?,?)");
				//Envio de los datos tomados del fomulario a la instruccion SQL.
				datos.setString(1,Id);
				datos.setString(2,Nombre);
				datos.setString(3,Apellido);
				datos.setString(4,Direccion);
				datos.setString(5,Barrio);
				datos.setString(6,Telefono);
				datos.setString(7,Estado);
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
	
	public void ActulizarCliente(String Id, String Nombre, String Apellido, String Direccion, String Barrio, String Telefono, String Estado) {

		try {
			//Valida si los campos estan vacios.
			if ((Id.equals("")) || (Nombre.equals("")) || (Apellido.equals("")) || (Direccion.equals("")) || (Barrio.equals("")) || (Telefono.equals("")) || (Estado.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
				//System.out.println("Ningun campo debe estar vacio ");
			}else{
				Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
				//Instrucion para crear la consulta SQL.
				PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("UPDATE clientes Nombre="+Nombre+",Apellido="+Apellido+",Direccion="+Direccion+",Barrio="+Barrio+",Telefono="+Telefono+",Estado="+Estado+" WHERE Id = "+Id+"");
				//Envio de los datos tomados del fomulario a la instruccion SQL.
				datos.setString(1,Id);
				datos.setString(2,Nombre);
				datos.setString(3,Apellido);
				datos.setString(4,Direccion);
				datos.setString(5,Barrio);
				datos.setString(6,Telefono);
				datos.setString(7,Estado);
				//Ejecucion de la instruccion SQL.
				datos.executeUpdate();
				//Cierre de la conexion a la base de datos.
				datos.close();
				JOptionPane.showMessageDialog(null,"CLIENTE ACTUALIZADO");
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
	
	public void SoloConsultaCliente(String Id) {

		//String Direccion,Barrio,Telefono,Estado;
        try{
        	
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("SELECT * from clientes where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
				}else {
					JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
	
	public void ConsultaClienteActualiza(String Id, String Nombre, String Apellido, String Direccion, String Barrio, String Telefono, String Estado) {

		//String Direccion,Barrio,Telefono,Estado;
        try{
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("SELECT * from clientes where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					txtNombreCli.setText(rnit.getString(2));
					txtApellidoCli.setText(rnit.getString(3));
					txtDirCli.setText(rnit.getString(4));
					txtBarrioCli.setText(rnit.getString(5));
					txtTelCli.setText(rnit.getString(6));
					txtEstadoCli.setText(rnit.getString(7));
					System.out.println(rnit.getString(2)+rnit.getString(3)+rnit.getString(4)+rnit.getString(5)+rnit.getString(6)+rnit.getString(7));
					JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
				}else {
					JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
	
	public void BorrarCliente(String Id) {

        try{
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("DELETE * from clientes where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					JOptionPane.showMessageDialog(null, "EL CLIENTE FUE ELIMINADO");
				}else {
					JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
}