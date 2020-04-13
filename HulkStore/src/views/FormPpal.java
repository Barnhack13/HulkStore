package views;

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

import venta.FormVenta;
import views.Cliente.FormGestionCli;
import views.Empleado.FormGestionEmp;
import views.Producto.FormGestionProd;

@SuppressWarnings("serial")
public class FormPpal extends JFrame {

	private JPanel contentPane;

	//Se crea Formulario.
	
	public FormPpal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,466,412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrincipal = new JLabel("HUL STORE");
		lblPrincipal.setBounds(46, 59, 352, 50);
		lblPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrincipal.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblPrincipal);
		
		JButton btnGestEmp = new JButton("GESTION EMPLEADOS");
		btnGestEmp.setForeground(Color.BLACK);
		btnGestEmp.setHideActionText(true);
		btnGestEmp.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGestEmp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnGestEmp.setAutoscrolls(true);
		btnGestEmp.setBounds(10, 145, 202, 65);
		btnGestEmp.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnGestEmp);
		
		JButton btnGestProd = new JButton("GESTION PRODUCTOS");
		btnGestProd.setBounds(238, 145, 202, 65);
		btnGestProd.setToolTipText("");
		btnGestProd.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnGestProd);
		
		JButton btnVender = new JButton("VENDER");
		btnVender.setToolTipText("");
		btnVender.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVender.setBounds(238, 221, 202, 65);
		contentPane.add(btnVender);
		
		JButton btnGestCli = new JButton("GESTION CLIENTES");
		btnGestCli.setToolTipText("");
		btnGestCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGestCli.setBounds(10, 221, 202, 65);
		contentPane.add(btnGestCli);
		
		btnGestEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormGestionEmp gesemp = new FormGestionEmp();
				gesemp.setVisible(true);
			}
		});
		
		btnGestProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormGestionProd gespro = new FormGestionProd();
				gespro.setVisible(true);
			}
		});
		
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormVenta venta = new FormVenta();
				venta.setVisible(true);
			}
		});
		
		btnGestCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormGestionCli gescli = new FormGestionCli();
				gescli.setVisible(true);
			}
		});
	}

}
