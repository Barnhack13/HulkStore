package views.Empleado;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class FormActualizarEmp extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdEmp,txtPNombreEmp,txtSNombreEmp,txtPApellidoEmp,txtSApellidoEmp,txtDirEmp,txtBarrioEmp,txtTelEmp,txtEstadoEmp;
	
	//Se crea el formulario
	public FormActualizarEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActualizaEmpleados = new JLabel("ACTUALIZAR EMPLEADOS");
		lblActualizaEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizaEmpleados.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblActualizaEmpleados.setBounds(22, 11, 352, 50);
		contentPane.add(lblActualizaEmpleados);
		
		JLabel label = new JLabel("ID EMPLEADO\r\n");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(42, 80, 141, 26);
		contentPane.add(label);
		
		txtIdEmp = new JTextField();
		txtIdEmp.setColumns(10);
		txtIdEmp.setBounds(217, 81, 167, 28);
		contentPane.add(txtIdEmp);
		
		txtPNombreEmp = new JTextField();
		txtPNombreEmp.setColumns(10);
		txtPNombreEmp.setBounds(217, 209, 167, 28);
		contentPane.add(txtPNombreEmp);
		
		JLabel lblPrimerNombre = new JLabel("PRIMER NOMBRE\r\n");
		lblPrimerNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerNombre.setBounds(42, 208, 159, 26);
		contentPane.add(lblPrimerNombre);
		
		txtSNombreEmp = new JTextField();
		txtSNombreEmp.setColumns(10);
		txtSNombreEmp.setBounds(217, 248, 167, 28);
		contentPane.add(txtSNombreEmp);
		
		JLabel lblSegundoNombre = new JLabel("SEGUNDO NOMBRE ");
		lblSegundoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoNombre.setBounds(42, 249, 173, 26);
		contentPane.add(lblSegundoNombre);
		
		txtPApellidoEmp = new JTextField();
		txtPApellidoEmp.setColumns(10);
		txtPApellidoEmp.setBounds(217, 287, 167, 28);
		contentPane.add(txtPApellidoEmp);
		
		JLabel lblPrimerApellido = new JLabel("PRIMER APELLIDO");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerApellido.setBounds(42, 289, 159, 26);
		contentPane.add(lblPrimerApellido);
		
		txtSApellidoEmp = new JTextField();
		txtSApellidoEmp.setColumns(10);
		txtSApellidoEmp.setBounds(217, 326, 167, 28);
		contentPane.add(txtSApellidoEmp);
		
		JLabel lblSegundoApellido = new JLabel("SEGUNDO APELLIDO");
		lblSegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoApellido.setBounds(42, 325, 173, 26);
		contentPane.add(lblSegundoApellido);
		
		txtDirEmp = new JTextField();
		txtDirEmp.setColumns(10);
		txtDirEmp.setBounds(217, 365, 167, 28);
		contentPane.add(txtDirEmp);
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDireccion.setBounds(42, 365, 141, 26);
		contentPane.add(lblDireccion);
		
		txtBarrioEmp = new JTextField();
		txtBarrioEmp.setColumns(10);
		txtBarrioEmp.setBounds(217, 406, 167, 28);
		contentPane.add(txtBarrioEmp);
		
		JLabel lblBarrio = new JLabel("BARRIO");
		lblBarrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarrio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBarrio.setBounds(42, 405, 141, 26);
		contentPane.add(lblBarrio);
		
		txtTelEmp = new JTextField();
		txtTelEmp.setColumns(10);
		txtTelEmp.setBounds(217, 444, 167, 28);
		contentPane.add(txtTelEmp);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelefono.setBounds(42, 444, 141, 26);
		contentPane.add(lblTelefono);
		
		txtEstadoEmp = new JTextField();
		txtEstadoEmp.setColumns(10);
		txtEstadoEmp.setBounds(217, 485, 167, 28);
		contentPane.add(txtEstadoEmp);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstado.setBounds(42, 484, 141, 26);
		contentPane.add(lblEstado);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizar.setBounds(147, 537, 129, 43);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultar.setBounds(147, 117, 129, 43);
		contentPane.add(btnConsultar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 182, 402, 2);
		contentPane.add(separator);
	}
}
