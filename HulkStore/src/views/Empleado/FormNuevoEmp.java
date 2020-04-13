package views.Empleado;

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

import clases.Empleado;

@SuppressWarnings("serial")
public class FormNuevoEmp extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdEmp,txtPNombreEmp,txtSNombreEmp,txtPApellidoEmp,txtSApellidoEmp,txtDirEmp,txtBarrioEmp,txtTelEmp,txtEstadoEmp;
	public String Id,Nombre1,Nombre2,Apellido1,Apellido2,Direccion,Barrio,Telefono,Estado;
	
	//Se crea Formulario
	public FormNuevoEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgregarEmpleados = new JLabel("AGREGAR EMPLEADOS");
		lblAgregarEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarEmpleados.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAgregarEmpleados.setBounds(22, 11, 352, 50);
		contentPane.add(lblAgregarEmpleados);
		
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
		txtPNombreEmp.setBounds(217, 121, 167, 28);
		contentPane.add(txtPNombreEmp);
		
		JLabel lblPrimerNombre = new JLabel("PRIMER NOMBRE\r\n");
		lblPrimerNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerNombre.setBounds(42, 120, 159, 26);
		contentPane.add(lblPrimerNombre);
		
		txtSNombreEmp = new JTextField();
		txtSNombreEmp.setColumns(10);
		txtSNombreEmp.setBounds(217, 159, 167, 28);
		contentPane.add(txtSNombreEmp);
		
		JLabel lblSegundoNombre = new JLabel("SEGUNDO NOMBRE ");
		lblSegundoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoNombre.setBounds(42, 160, 173, 26);
		contentPane.add(lblSegundoNombre);
		
		txtPApellidoEmp = new JTextField();
		txtPApellidoEmp.setColumns(10);
		txtPApellidoEmp.setBounds(217, 198, 167, 28);
		contentPane.add(txtPApellidoEmp);
		
		JLabel lblPrimerApellido = new JLabel("PRIMER APELLIDO");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerApellido.setBounds(42, 200, 159, 26);
		contentPane.add(lblPrimerApellido);
		
		txtSApellidoEmp = new JTextField();
		txtSApellidoEmp.setColumns(10);
		txtSApellidoEmp.setBounds(217, 238, 167, 28);
		contentPane.add(txtSApellidoEmp);
		
		JLabel lblSegundoApellido = new JLabel("SEGUNDO APELLIDO");
		lblSegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoApellido.setBounds(42, 237, 173, 26);
		contentPane.add(lblSegundoApellido);
		
		txtDirEmp = new JTextField();
		txtDirEmp.setColumns(10);
		txtDirEmp.setBounds(217, 277, 167, 28);
		contentPane.add(txtDirEmp);
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDireccion.setBounds(42, 277, 141, 26);
		contentPane.add(lblDireccion);
		
		txtBarrioEmp = new JTextField();
		txtBarrioEmp.setColumns(10);
		txtBarrioEmp.setBounds(217, 318, 167, 28);
		contentPane.add(txtBarrioEmp);
		
		JLabel lblBarrio = new JLabel("BARRIO");
		lblBarrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarrio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBarrio.setBounds(42, 317, 141, 26);
		contentPane.add(lblBarrio);
		
		txtTelEmp = new JTextField();
		txtTelEmp.setColumns(10);
		txtTelEmp.setBounds(217, 357, 167, 28);
		contentPane.add(txtTelEmp);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelefono.setBounds(42, 357, 141, 26);
		contentPane.add(lblTelefono);
		
		txtEstadoEmp = new JTextField();
		txtEstadoEmp.setColumns(10);
		txtEstadoEmp.setBounds(217, 398, 167, 28);
		contentPane.add(txtEstadoEmp);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstado.setBounds(42, 397, 141, 26);
		contentPane.add(lblEstado);
		
		JButton btnGuardarNvEmp = new JButton("GUARDAR\r\n");
		btnGuardarNvEmp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardarNvEmp.setBounds(143, 449, 114, 43);
		contentPane.add(btnGuardarNvEmp);
		
		btnGuardarNvEmp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//Validacion si el boton fue oprimido
				if (e.getSource()==btnGuardarNvEmp) {
					//Parametros que envio a la Clase Empente
					Id = txtIdEmp.getText();
					Nombre1 = txtPNombreEmp.getText();
					Nombre2 = txtSNombreEmp.getText();
					Apellido1 = txtPApellidoEmp.getText();
					Apellido2 = txtSApellidoEmp.getText();
					Direccion = txtDirEmp.getText();
					Barrio = txtBarrioEmp.getText();
					Telefono = txtTelEmp.getText();
					Estado = txtEstadoEmp.getText();
					//Instancia de la clase Empente
					Empleado nuevoEmp = new Empleado();
					//Metodo con parametros para guardar nuevo Empente
					nuevoEmp.NuevoEmpleado(Id,Nombre1,Nombre2,Apellido1,Apellido2,Direccion,Barrio,Telefono,Estado);
					txtIdEmp.setText("");
					txtPNombreEmp.setText("");
					txtPApellidoEmp.setText("");
					txtDirEmp.setText("");
					txtBarrioEmp.setText("");
					txtTelEmp.setText("");
					txtEstadoEmp.setText("");
				}
			}
		});
	}

}
