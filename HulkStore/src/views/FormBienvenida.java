package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FormBienvenida extends JFrame {

	private JPanel contentPane;
	//Creacion del formulario
	public FormBienvenida() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200,300,300);//coordenadas y tamaño del formulario
		//setBounds(0, 0, 450, 300);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(5, 5, 0, 0));
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setVerifyInputWhenFocusTarget(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(54, 49, 177, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(130, 80, 20, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HULK STORE\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(68, 118, 163, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIngresar.setBounds(78, 170, 127, 45);
		contentPane.add(btnIngresar);
		
		btnIngresar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnIngresar) {					
					FormLogin login = new FormLogin();
					login.setVisible(true);
					FormBienvenida.this.setVisible(false);
					FormBienvenida.this.disable();
				}
			}
			
		});
	}
}
