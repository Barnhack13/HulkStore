package views.Empleado;

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
public class FormGestionEmp extends JFrame {

	private JPanel contentPane;

	//Se crea el formulario
	public FormGestionEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,466,412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpleados = new JLabel("GESTION EMPLEADOS");
		lblEmpleados.setBounds(46, 59, 352, 50);
		lblEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleados.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblEmpleados);
		
		JButton btnGestConsulta = new JButton("CONSULTAR EMPLEADO");
		btnGestConsulta.setForeground(Color.BLACK);
		btnGestConsulta.setHideActionText(true);
		btnGestConsulta.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGestConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnGestConsulta.setAutoscrolls(true);
		btnGestConsulta.setBounds(10, 145, 213, 65);
		btnGestConsulta.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnGestConsulta);
		
		JButton btnNuevoEmp = new JButton("AGREGAR EMPLEADO");
		btnNuevoEmp.setBounds(238, 145, 202, 65);
		btnNuevoEmp.setToolTipText("");
		btnNuevoEmp.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNuevoEmp);
		
		JButton btnActualizaEmp = new JButton("ACTUALIZAR EMPLEADO");
		btnActualizaEmp.setToolTipText("");
		btnActualizaEmp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizaEmp.setBounds(110, 249, 222, 65);
		contentPane.add(btnActualizaEmp);
		
		btnGestConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnNuevoEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnActualizaEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
