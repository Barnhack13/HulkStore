package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import views.Producto.FormActualizarProd;

@SuppressWarnings("serial")
public class Producto extends FormActualizarProd{
	//Variable que contiene la consult SQL
	java.sql.PreparedStatement snit;
	//Variale que contiene el reaultado de la consulta SQL
	ResultSet rnit;
	
	public void NuevoProd(String Id, String Descrip, String Linea, String TipoProd, String Cantidad, String Valor) {

		try {
			//Valida si los campos estan vacios.
			if ((Id.equals("")) || (Descrip.equals("")) || (Linea.equals("")) || (TipoProd.equals("")) || (Cantidad.equals("")) || (Valor.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
				//System.out.println("Ningun campo debe estar vacio ");
			}else{
				Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
				//Instrucion para crear la consulta SQL.
				PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("INSERT INTO PRODUCTOS (Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado) VALUES (?,?,?,?,?,?,?)");
				//Envio de los datos tomados del fomulario a la instruccion SQL.
				datos.setString(1,Id);
				datos.setString(2,Descrip);
				datos.setString(3,Linea);
				datos.setString(4,TipoProd);
				datos.setString(5,Cantidad);
				datos.setString(6,Valor);
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
	
	public void ActulizarProd(String Id, String Descrip, String Linea, String TipoProd, String Cantidad, String Valor) {

		try {
			//Valida si los campos estan vacios.
			if ((Id.equals("")) || (Descrip.equals("")) || (Linea.equals("")) || (TipoProd.equals("")) || (Cantidad.equals("")) || (Valor.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio ");
				//System.out.println("Ningun campo debe estar vacio ");
			}else{
				Conexion conexion = new Conexion();//Instancia de la conexion a base de datos
				//Instrucion para crear la consulta SQL.
				PreparedStatement datos = (PreparedStatement) conexion.ConexionDB().prepareStatement("UPDATE PRODUCTOS Descripcion="+Descrip+",Linea="+Linea+",TipoProd="+TipoProd+",Cantidad="+Cantidad+",Valor="+Valor+" WHERE Id = "+Id+"");
				//Envio de los datos tomados del fomulario a la instruccion SQL.
				datos.setString(1,Id);
				datos.setString(2,Descrip);
				datos.setString(3,Linea);
				datos.setString(4,TipoProd);
				datos.setString(5,Cantidad);
				datos.setString(6,Valor);
				//Ejecucion de la instruccion SQL.
				datos.executeUpdate();
				//Cierre de la conexion a la base de datos.
				datos.close();
				JOptionPane.showMessageDialog(null,"PRODUCTO ACTUALIZADO");
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
	
	public void SoloConsultaProd(String Id) {

		//String Direccion,Barrio,Telefono,Estado;
        try{
        	
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("SELECT * from PRODUCTOS where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					JOptionPane.showMessageDialog(null, "EL PRODUCTO YA EXISTE");
				}else {
					JOptionPane.showMessageDialog(null, "EL PRODUCTO NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
	
	public void ConsultaProdActualiza(String Id, String Descrip, String Linea, String TipoProd, String Cantidad, String Valor) {

		//String Direccion,Barrio,Telefono,Estado;
        try{
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("SELECT * from PRODUCTOS where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					txtDescripProd.setText(rnit.getString(2));
					txtLineaProd.setText(rnit.getString(3));
					txtTipoProd.setText(rnit.getString(4));
					txtCantidadProd.setText(rnit.getString(5));
					txtValorProd.setText(rnit.getString(6));
					System.out.println(rnit.getString(2)+rnit.getString(3)+rnit.getString(4)+rnit.getString(5)+rnit.getString(6)+rnit.getString(7));
					JOptionPane.showMessageDialog(null, "EL PRODUCTO YA EXISTE");
				}else {
					JOptionPane.showMessageDialog(null, "EL PRODUCTO NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
	
	public void BorrarProd(String Id) {

        try{
        	//Valido si el campo contiene datos
			if ((Id.equals(""))) {
				JOptionPane.showMessageDialog(null,"Ningun campo debe estar vacio");
			}else{
				//Abro la conexion a base de datos
				Conexion conexion = new Conexion();
				//Instrucion para crear la consulta SQL.
				snit = conexion.ConexionDB().prepareStatement("DELETE * from PRODUCTOS where Id = "+Id+"");
				//Ejecuto la consulta y la cuardo en un a variable
				rnit = snit.executeQuery();
				//Valido si la consulta tiene algun valor
				if(rnit.next()){
					JOptionPane.showMessageDialog(null, "EL PRODUCTO FUE ELIMINADO");
				}else {
					JOptionPane.showMessageDialog(null, "EL PRODUCTO NO EXISTE");
				}
				//Cierro la conexion a basde de datos
				snit.close();
			}
		}catch(SQLException e){
            	JOptionPane.showMessageDialog(null, e);
        }
	}
}
