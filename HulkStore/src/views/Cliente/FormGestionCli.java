package views.Cliente;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FormGestionCli extends JFrame {

	private JPanel contentPane;

	//Se crea el formulario
	public FormGestionCli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,466,412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbClientes = new JLabel("GESTION CLIENTES");
		lbClientes.setBounds(46, 59, 352, 50);
		lbClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lbClientes.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lbClientes);
		
		JButton btnConsultaCli = new JButton("CONSULTAR CLIENTE");
		btnConsultaCli.setForeground(Color.BLACK);
		btnConsultaCli.setHideActionText(true);
		btnConsultaCli.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConsultaCli.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnConsultaCli.setAutoscrolls(true);
		btnConsultaCli.setBounds(10, 145, 213, 65);
		btnConsultaCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnConsultaCli);
		
		JButton btnNuevoCli = new JButton("AGREGAR CLIENTE");
		btnNuevoCli.setBounds(238, 145, 202, 65);
		btnNuevoCli.setToolTipText("");
		btnNuevoCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNuevoCli);
		
		JButton btnActualizaCli = new JButton("ACTUALIZAR CLIENTE");
		btnActualizaCli.setToolTipText("");
		btnActualizaCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizaCli.setBounds(110, 249, 222, 65);
		contentPane.add(btnActualizaCli);
		
		btnConsultaCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnNuevoCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnActualizaCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
