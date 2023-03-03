package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PnlConversorDivisas extends JPanel {
	private JTextField txtFieldIntercambio;
	private JTextField textFieldMonedaLocal;
	private JComboBox cmbxPaises;
	private JLabel lblCop;
	private JButton btnCalcular;

	/**
	 * Create the panel.
	 */
	public PnlConversorDivisas(JPanel pnlContenedor) {
		setLayout(null);
		
		JButton btnVolver = new JButton("<");
		btnVolver.setBackground(new Color(246, 245, 244));
		btnVolver.setFont(new Font("Noto Serif Display Black", Font.BOLD, 14));
		btnVolver.setBorderPainted(false);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menuVolver=new Menu(pnlContenedor);
				menuVolver.setSize(450,251);
				pnlContenedor.removeAll();
				pnlContenedor.add(menuVolver,BorderLayout.CENTER);
				pnlContenedor.revalidate();
				pnlContenedor.repaint();
			}
		});
		btnVolver.setBounds(12, 7, 42, 20);
		add(btnVolver);
		
		JLabel lblTituloDivisas = new JLabel("Divisas");
		lblTituloDivisas.setBounds(55, 8, 64, 15);
		add(lblTituloDivisas);
		
		txtFieldIntercambio = new JTextField();
		txtFieldIntercambio.setBounds(181, 105, 148, 19);
		add(txtFieldIntercambio);
		txtFieldIntercambio.setColumns(10);
		
		textFieldMonedaLocal = new JTextField();
		textFieldMonedaLocal.setColumns(10);
		textFieldMonedaLocal.setBounds(181, 54, 148, 19);
		add(textFieldMonedaLocal);
		
		cmbxPaises = new JComboBox();
		cmbxPaises.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Libras Esterlinas", "Yen Japones", "Won sur-coreano"}));
		cmbxPaises.setBounds(27, 102, 142, 24);
		add(cmbxPaises);
		
		lblCop = new JLabel("Cop");
		lblCop.setBounds(27, 56, 70, 15);
		add(lblCop);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(321, 214, 117, 25);
		add(btnCalcular);
	}
}
