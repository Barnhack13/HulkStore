package views.Cliente;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import clases.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FormNuevoCliente extends JFrame {

	public JPanel contentPane;
	//Variablles asignadas a los campos de texto.
	public JTextField txtIdCli, txtNombreCli,txtApellidoCli,txtDirCli,txtBarrioCli,txtTelCli,txtEstadoCli;
	public JButton btnGuardarNvCli;
	//Variables para tomar los datos de los cmpos de texto.
	public String Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado;

	//Creacion del formulario.
	public FormNuevoCliente() {
		setTitle("AGREGAR CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgregarClientes = new JLabel("AGREGAR CLIENTES");
		lblAgregarClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarClientes.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAgregarClientes.setBounds(22, 11, 352, 50);
		contentPane.add(lblAgregarClientes);
		
		JLabel lblIdCliente = new JLabel("ID CLIENTE\r\n");
		lblIdCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdCliente.setBounds(49, 83, 128, 26);
		contentPane.add(lblIdCliente);
		
		txtIdCli = new JTextField();
		txtIdCli.setColumns(10);
		txtIdCli.setBounds(187, 83, 167, 28);
		contentPane.add(txtIdCli);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setColumns(10);
		txtNombreCli.setBounds(187, 123, 167, 28);
		contentPane.add(txtNombreCli);
		
		JLabel lblPrimerNombre = new JLabel("NOMBRE\r\n");
		lblPrimerNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerNombre.setBounds(49, 123, 123, 26);
		contentPane.add(lblPrimerNombre);
		
		txtApellidoCli = new JTextField();
		txtApellidoCli.setColumns(10);
		txtApellidoCli.setBounds(187, 162, 167, 28);
		contentPane.add(txtApellidoCli);
		
		JLabel lblPrimerApellido = new JLabel("APELLIDO");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerApellido.setBounds(49, 165, 128, 26);
		contentPane.add(lblPrimerApellido);
		
		txtDirCli = new JTextField();
		txtDirCli.setColumns(10);
		txtDirCli.setBounds(187, 201, 167, 28);
		contentPane.add(txtDirCli);
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDireccion.setBounds(49, 202, 128, 26);
		contentPane.add(lblDireccion);
		
		txtBarrioCli = new JTextField();
		txtBarrioCli.setColumns(10);
		txtBarrioCli.setBounds(187, 241, 167, 28);
		contentPane.add(txtBarrioCli);
		
		JLabel lblBarrio = new JLabel("BARRIO");
		lblBarrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarrio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBarrio.setBounds(49, 238, 123, 26);
		contentPane.add(lblBarrio);
		
		txtTelCli = new JTextField();
		txtTelCli.setColumns(10);
		txtTelCli.setBounds(187, 280, 167, 28);
		contentPane.add(txtTelCli);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelefono.setBounds(49, 277, 123, 26);
		contentPane.add(lblTelefono);
		
		txtEstadoCli = new JTextField();
		txtEstadoCli.setColumns(10);
		txtEstadoCli.setBounds(187, 320, 167, 28);
		contentPane.add(txtEstadoCli);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstado.setBounds(49, 317, 123, 26);
		contentPane.add(lblEstado);
		
		JButton btnGuardarNvCli = new JButton("GUARDAR\r\n");
		btnGuardarNvCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardarNvCli.setBounds(146, 371, 114, 43);
		contentPane.add(btnGuardarNvCli);

			
		btnGuardarNvCli.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//Validacion si el boton fue oprimido
				if (e.getSource()==btnGuardarNvCli) {
					//Parametros que envio a la Clase Cliente
					Id = txtIdCli.getText();
					Nombre = txtNombreCli.getText();
					Apellido = txtApellidoCli.getText();
					Direccion = txtDirCli.getText();
					Barrio = txtBarrioCli.getText();
					Telefono = txtTelCli.getText();
					Estado = txtEstadoCli.getText();
					//Instancia de la clase Cliente
					Cliente nuevocliente = new Cliente();
					//Metodo con parametros para guardar nuevo cliente
					nuevocliente.NuevoCliente(Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado);
					txtIdCli.setText("");
					txtNombreCli.setText("");
					txtApellidoCli.setText("");
					txtDirCli.setText("");
					txtBarrioCli.setText("");
					txtTelCli.setText("");
					txtEstadoCli.setText("");
				}
			}
		});
	}
}

