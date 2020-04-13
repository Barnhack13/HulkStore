package views.Cliente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import clases.Cliente;

import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class FormActualizarCli extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdCli,txtNombreCli,txtApellidoCli,txtDirCli,txtBarrioCli,txtTelCli,txtEstadoCli;
	public String Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado;

	//Se crea el Formulario
	public FormActualizarCli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActualizaEmpleados = new JLabel("ACTUALIZAR CLIENTES");
		lblActualizaEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizaEmpleados.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblActualizaEmpleados.setBounds(22, 11, 352, 50);
		contentPane.add(lblActualizaEmpleados);
		
		JLabel lblIdCliente = new JLabel("ID CLIENTE\r\n");
		lblIdCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdCliente.setBounds(42, 80, 141, 26);
		contentPane.add(lblIdCliente);
		
		JButton btnActualizarCli = new JButton("ACTUALIZAR");
		btnActualizarCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizarCli.setBounds(147, 443, 129, 43);
		contentPane.add(btnActualizarCli);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultar.setBounds(147, 117, 129, 43);
		contentPane.add(btnConsultar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 182, 402, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("NOMBRE");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(69, 195, 123, 26);
		contentPane.add(label);
			
	
		JLabel label_1 = new JLabel("APELLIDO");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(69, 237, 128, 26);
		contentPane.add(label_1);
		
		txtApellidoCli = new JTextField();
		txtApellidoCli.setColumns(10);
		txtApellidoCli.setBounds(207, 234, 167, 28);
		contentPane.add(txtApellidoCli);
		
		JLabel label_2 = new JLabel("DIRECCION");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(69, 274, 128, 26);
		contentPane.add(label_2);
		
		txtDirCli = new JTextField();
		txtDirCli.setColumns(10);
		txtDirCli.setBounds(207, 273, 167, 28);
		contentPane.add(txtDirCli);
		
		JLabel label_3 = new JLabel("BARRIO");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(69, 310, 123, 26);
		contentPane.add(label_3);
		
		txtBarrioCli = new JTextField();
		txtBarrioCli.setColumns(10);
		txtBarrioCli.setBounds(207, 313, 167, 28);
		contentPane.add(txtBarrioCli);
		
		JLabel label_4 = new JLabel("TELEFONO");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(69, 349, 123, 26);
		contentPane.add(label_4);
		
		txtTelCli = new JTextField();
		txtTelCli.setColumns(10);
		txtTelCli.setBounds(207, 352, 167, 28);
		contentPane.add(txtTelCli);
		
		JLabel label_5 = new JLabel("ESTADO");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(69, 389, 123, 26);
		contentPane.add(label_5);
		
		txtEstadoCli = new JTextField();
		txtEstadoCli.setColumns(10);
		txtEstadoCli.setBounds(207, 392, 167, 28);
		contentPane.add(txtEstadoCli);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setColumns(10);
		txtNombreCli.setBounds(207, 195, 167, 28);
		contentPane.add(txtNombreCli);
		
		txtIdCli = new JTextField();
		txtIdCli.setColumns(10);
		txtIdCli.setBounds(207, 81, 167, 28);
		contentPane.add(txtIdCli);
		
		
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				Id = txtIdCli.getText();
				//txtNombreCli.setText("Trago Camote");
				Cliente consulta = new Cliente();
				consulta.ConsultaClienteActualiza(Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado);				
			}
		});
		
		btnActualizarCli.addActionListener(new ActionListener() {
			//Validacion si el boton fue oprimido
			public void actionPerformed(ActionEvent e) {
				//Parametros que envio a la Clase Cliente
				Id = txtIdCli.getText();
				Nombre = txtNombreCli.getText();
				Apellido = txtApellidoCli.getText();
				Direccion = txtDirCli.getText();
				Barrio = txtBarrioCli.getText();
				Telefono = txtTelCli.getText();
				Estado = txtEstadoCli.getText();
				Cliente actualizacliente = new Cliente();
				//Metodo con parametros para guardar nuevo cliente
				actualizacliente.ActulizarCliente(Id,Nombre,Apellido,Direccion,Barrio,Telefono,Estado);
			}
		});
	}
}
