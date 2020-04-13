package views.Producto;

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
import clases.Producto;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class FormActualizarProd extends JFrame {

	public JPanel contentPane;
	public JTextField txtIdProd,txtDescripProd,txtLineaProd,txtTipoProd,txtCantidadProd,txtValorProd;
	public String Id,Descrip,Linea,TipoProd,Cantidad,Valor;
	
	//Se crea el fomulario
	public FormActualizarProd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActualizaProducto = new JLabel("ACTUALIZAR PRODUCTO");
		lblActualizaProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizaProducto.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblActualizaProducto.setBounds(22, 11, 352, 50);
		contentPane.add(lblActualizaProducto);
		
		JLabel lblIdProducto = new JLabel("ID PRODUCTO\r\n");
		lblIdProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdProducto.setBounds(42, 80, 141, 26);
		contentPane.add(lblIdProducto);
		
		txtIdProd = new JTextField();
		txtIdProd.setColumns(10);
		txtIdProd.setBounds(217, 81, 167, 28);
		contentPane.add(txtIdProd);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActualizar.setBounds(147, 417, 129, 43);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultar.setBounds(147, 117, 129, 43);
		contentPane.add(btnConsultar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 182, 402, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("DESCRIPCION\r\n");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(32, 215, 141, 26);
		contentPane.add(label);
		
		txtDescripProd = new JTextField();
		txtDescripProd.setColumns(10);
		txtDescripProd.setBounds(207, 216, 167, 28);
		contentPane.add(txtDescripProd);
		
		JLabel label_1 = new JLabel("LINEA");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(64, 255, 93, 26);
		contentPane.add(label_1);
		
		txtLineaProd = new JTextField();
		txtLineaProd.setColumns(10);
		txtLineaProd.setBounds(207, 254, 167, 28);
		contentPane.add(txtLineaProd);
		
		JLabel label_2 = new JLabel("TIPO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(53, 292, 104, 26);
		contentPane.add(label_2);
		
		txtTipoProd = new JTextField();
		txtTipoProd.setColumns(10);
		txtTipoProd.setBounds(207, 293, 167, 28);
		contentPane.add(txtTipoProd);
		
		JLabel label_3 = new JLabel("CANTIDAD");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(32, 332, 159, 26);
		contentPane.add(label_3);
		
		txtCantidadProd = new JTextField();
		txtCantidadProd.setColumns(10);
		txtCantidadProd.setBounds(207, 333, 167, 28);
		contentPane.add(txtCantidadProd);
		
		JLabel label_4 = new JLabel("VALOR");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(64, 371, 93, 26);
		contentPane.add(label_4);
		
		txtValorProd = new JTextField();
		txtValorProd.setColumns(10);
		txtValorProd.setBounds(207, 372, 167, 28);
		contentPane.add(txtValorProd);
		
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				Id = txtIdProd.getText();
				//txtNombreCli.setText("Trago Camote");
				Producto consulta = new Producto();
				consulta.ConsultaProdActualiza(Id,Descrip,Linea,TipoProd,Cantidad,Valor);				
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			//Validacion si el boton fue oprimido
			public void actionPerformed(ActionEvent e) {
				//Parametros que envio a la Clase Cliente
				Id = txtIdProd.getText();
				Descrip = txtDescripProd.getText();
				Linea = txtLineaProd.getText();
				TipoProd = txtTipoProd.getText();
				Cantidad = txtCantidadProd.getText();
				Valor = txtValorProd.getText();
				Producto actualizaprod = new Producto();
				//Metodo con parametros para guardar nuevo cliente
				actualizaprod.ActulizarProd(Id,Descrip,Linea,TipoProd,Cantidad,Valor);
			}
		});
	}
}
