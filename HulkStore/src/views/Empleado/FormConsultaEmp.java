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
public class FormConsultaEmp extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdEmp;
	public String Id;

	//Se cra el formulario
	public FormConsultaEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID EMPLEADO\r\n");
		label.setBounds(41, 84, 141, 26);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(label);
		
		JTextField txtIdEmp = new JTextField();
		txtIdEmp.setBounds(187, 85, 167, 28);
		txtIdEmp.setColumns(10);
		contentPane.add(txtIdEmp);
		
		JButton btnConsultaEmp = new JButton("CONSULTAR");
		btnConsultaEmp.setBounds(149, 134, 121, 37);
		btnConsultaEmp.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnConsultaEmp);
		
		JLabel lblConsultaEmpleados = new JLabel("CONSULTA EMPLEADOS");
		lblConsultaEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaEmpleados.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblConsultaEmpleados.setBounds(28, 11, 352, 50);
		contentPane.add(lblConsultaEmpleados);
		
		btnConsultaEmp.addActionListener(new ActionListener() {
			//Validacion si el boton fue oprimido
			public void actionPerformed(ActionEvent e) {
				//Parametros que envio a la Clase Cliente
				Id = txtIdEmp.getText();
				Empleado consultaEmp = new Empleado();
				consultaEmp.SoloConsultaEmpleado(Id);
			}
		});
	}

}
