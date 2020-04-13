package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Login;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class FormLogin extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdEmp,txtClave;
	public String Id,Clave;

	/**
	 * Create the frame.
	 */
	public FormLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INGRESO A HULK STORE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 264, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID EMPLEADO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(30, 80, 99, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CLAVE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(30, 129, 99, 29);
		contentPane.add(lblNewLabel_2);
		
		txtIdEmp = new JTextField();
		txtIdEmp.setBounds(135, 83, 119, 29);
		contentPane.add(txtIdEmp);
		txtIdEmp.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setBounds(135, 131, 119, 29);
		contentPane.add(txtClave);
		txtClave.setColumns(10);
		
		JButton btnIngresoLogin = new JButton("ENTRAR");
		btnIngresoLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIngresoLogin.setBounds(93, 191, 107, 37);
		contentPane.add(btnIngresoLogin);
		
		btnIngresoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnIngresoLogin) {
					Id = txtIdEmp.getText();
					Clave = txtClave.getText();
					Login login = new Login();
					login.IngresoLogin(Id,Clave);
					//FormLogin.this.setVisible(false);
				}
			}
		});
	}
}
