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

@SuppressWarnings("serial")
public class FormConsultaCliente extends JFrame {

	private JPanel contentPane;
	public JTextField txtIdCli;
	//Variable para tomar los datos de los cmpos de texto.
	public String Id;
	
	//Creacion del formulario.
	public FormConsultaCliente() {
		setTitle("CONSULTA CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("ID CLIENTE\r\n");
		lblIdCliente.setBounds(41, 84, 141, 26);
		lblIdCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblIdCliente);
		
		JTextField txtIdCli = new JTextField();
		txtIdCli.setBounds(187, 85, 167, 28);
		txtIdCli.setColumns(10);
		contentPane.add(txtIdCli);
		
		JButton btnConsultaCli = new JButton("CONSULTAR");
		btnConsultaCli.setBounds(147, 121, 135, 37);
		btnConsultaCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnConsultaCli);
		
		JLabel lblConsultaClientes = new JLabel("CONSULTA CLIENTES");
		lblConsultaClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaClientes.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblConsultaClientes.setBounds(28, 11, 352, 50);
		contentPane.add(lblConsultaClientes);
		
		btnConsultaCli.addActionListener(new ActionListener() {
			//Validacion si el boton fue oprimido
			public void actionPerformed(ActionEvent e) {
				//Parametros que envio a la Clase Cliente
				Id = txtIdCli.getText();
				Cliente consultacliente = new Cliente();
				consultacliente.SoloConsultaCliente(Id);
			}
		});
	}

}
