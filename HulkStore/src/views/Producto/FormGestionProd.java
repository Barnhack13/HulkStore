package views.Producto;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FormGestionProd extends JFrame {

	private JPanel contentPane;

	//Se crea el formulario
	public FormGestionProd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,466,412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductos = new JLabel("GESTION PRODUCTOS");
		lblProductos.setBounds(51, 50, 352, 50);
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblProductos);
		
		JButton btnNuevoProd = new JButton("AGREGAR PRODUCTO");
		btnNuevoProd.setBounds(125, 107, 202, 65);
		btnNuevoProd.setToolTipText("");
		btnNuevoProd.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNuevoProd);
		
		JButton btnActualizaCli = new JButton("ACTUALIZAR PRODUCTO");
		btnActualizaCli.setToolTipText("");
		btnActualizaCli.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizaCli.setBounds(114, 183, 222, 65);
		contentPane.add(btnActualizaCli);
	}
}
