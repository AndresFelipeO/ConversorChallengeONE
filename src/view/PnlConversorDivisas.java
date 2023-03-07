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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


import controller.Moneda;
import controller.PesoColombiano;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PnlConversorDivisas extends JPanel {
	private JTextField txtFieldIntercambio;
	private JTextField textFieldMonedaLocal;
	private JComboBox<?> cmbxPaises;
	private JLabel lblCop;

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
		

		textFieldMonedaLocal = new JTextField();
		textFieldMonedaLocal.setColumns(10);
		textFieldMonedaLocal.setBounds(181, 54, 148, 19);
		

		add(textFieldMonedaLocal);

		txtFieldIntercambio = new JTextField();
		txtFieldIntercambio.setBounds(181, 105, 148, 19);
		add(txtFieldIntercambio);
		txtFieldIntercambio.setColumns(10);
		
		
		cmbxPaises = new JComboBox<String>();
		cmbxPaises.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Libras Esterlinas", "Yen Japones", "Won sur-coreano"}));
		cmbxPaises.setBounds(27, 102, 142, 24);
		add(cmbxPaises);
		
		lblCop = new JLabel("Cop");
		lblCop.setBounds(27, 56, 70, 15);
		add(lblCop);
	

		textFieldMonedaLocal.getDocument().addDocumentListener(documentosLst(txtFieldIntercambio,textFieldMonedaLocal,cmbxPaises,0));
		txtFieldIntercambio.getDocument().addDocumentListener(documentosLst(textFieldMonedaLocal,txtFieldIntercambio, cmbxPaises,1));
		cmbxPaises.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calcularMoneda(textFieldMonedaLocal,txtFieldIntercambio, cmbxPaises,1);
			}
		});
	}
	
	/**
	 * @brief tiene los metodos de los eventos del JTextField para actualizar el valor de la monedad automaticamente
	 * @param jTextFIntercambio
	 * @param jTextFlocal
	 * @param cmbBox
	 * @param tipo
	 * @return DocumentListener
	 */
	private DocumentListener documentosLst(JTextField jTextFIntercambio,JTextField jTextFlocal,JComboBox cmbBox,int tipo){
		return new DocumentListener(){
			@Override
			public void changedUpdate(DocumentEvent e) {
				calcularMoneda(jTextFIntercambio,jTextFlocal,cmbBox,tipo);
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				calcularMoneda(jTextFIntercambio,jTextFlocal,cmbBox,tipo);
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				calcularMoneda(jTextFIntercambio,jTextFlocal,cmbBox,tipo);
			}
			
		};
	}
	/**
	 * @brief Calcula la divisa del tipo de moneda selecionada y valida que solo sea numeros
	 * @param jTextFIntercambio
	 * @param jTextFlocal
	 * @param cmbBox
	 * @param tipo
	 */
	private void calcularMoneda(JTextField jTextFIntercambio,JTextField jTextFlocal,JComboBox cmbBox,int tipo){
		try {
			Moneda conversionDivisa=new PesoColombiano();
			if(tipo==0)
				jTextFIntercambio.setText(String.valueOf(conversionDivisa.conversor(1, Double.parseDouble(jTextFlocal.getText()), conversionDivisa.intercambioPaises.get(cmbBox.getSelectedItem()))));
			else
				jTextFIntercambio.setText(String.valueOf(conversionDivisa.conversor(conversionDivisa.intercambioPaises.get(cmbBox.getSelectedItem()),Double.parseDouble(jTextFlocal.getText()),1)));
		} catch (Exception e) {
			
		}
	}
}
