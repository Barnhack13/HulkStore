package main;

//import clases.Empleado;
import views.FormBienvenida;
import views.Cliente.FormActualizarCli;
import views.Cliente.FormConsultaCliente;
import views.Cliente.FormNuevoCliente;

public class HulkStore {

	public static void main(String[] args) {

		/*Objeto datos que muestra la info del empleado
		 *instanciamiento de la clase*/
		//Empleado datos = new Empleado();
		//datos.consultaEmpleado();//acceso al metodo ConsultaEmpleado
		
	
		FormBienvenida saludo = new FormBienvenida();
		saludo.setVisible(true);
		
		//FormConsultaCliente consulta = new FormConsultaCliente();
		//consulta.setVisible(true);
		
		FormNuevoCliente nuevo = new FormNuevoCliente();
		nuevo.setVisible(true);
		
		FormActualizarCli actualiza = new FormActualizarCli();
		actualiza.setVisible(true);
		

	}
}
