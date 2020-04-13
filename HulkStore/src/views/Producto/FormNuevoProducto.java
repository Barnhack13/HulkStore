package views.Producto;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FormNuevoProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Create the frame.
	 */
	public FormNuevoProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgregarProducto = new JLabel("AGREGAR PRODUCTOS");
		lblAgregarProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarProducto.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAgregarProducto.setBounds(22, 11, 352, 50);
		contentPane.add(lblAgregarProducto);
		
		JLabel lblIdProducto = new JLabel("ID PRODUCTO\r\n");
		lblIdProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdProducto.setBounds(42, 80, 141, 26);
		contentPane.add(lblIdProducto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(217, 81, 167, 28);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 121, 167, 28);
		contentPane.add(textField_1);
		
		JLabel lblPrimerNombre = new JLabel("DESCRIPCION\r\n");
		lblPrimerNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerNombre.setBounds(42, 120, 141, 26);
		contentPane.add(lblPrimerNombre);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 159, 167, 28);
		contentPane.add(textField_2);
		
		JLabel lblSegundoNombre = new JLabel("LINEA");
		lblSegundoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoNombre.setBounds(74, 160, 93, 26);
		contentPane.add(lblSegundoNombre);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 198, 167, 28);
		contentPane.add(textField_3);
		
		JLabel lblPrimerApellido = new JLabel("TIPO");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimerApellido.setBounds(63, 197, 104, 26);
		contentPane.add(lblPrimerApellido);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 238, 167, 28);
		contentPane.add(textField_4);
		
		JLabel lblSegundoApellido = new JLabel("CANTIDAD");
		lblSegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundoApellido.setBounds(42, 237, 159, 26);
		contentPane.add(lblSegundoApellido);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 277, 167, 28);
		contentPane.add(textField_5);
		
		JLabel lblDireccion = new JLabel("VALOR");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDireccion.setBounds(74, 276, 93, 26);
		contentPane.add(lblDireccion);
		
		JButton btnGuardar = new JButton("GUARDAR\r\n");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBounds(153, 327, 114, 43);
		contentPane.add(btnGuardar);
	}

}
