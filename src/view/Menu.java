package view;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu(JPanel pnlContenedor) {
		setLayout(null);
		
		JButton btnDivisas = new JButton("");
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlConversorDivisas conversorDivisas=new PnlConversorDivisas(pnlContenedor);
				conversorDivisas.setSize(451,251);
				pnlContenedor.removeAll();
				pnlContenedor.add(conversorDivisas,BorderLayout.CENTER);
				pnlContenedor.revalidate();
				pnlContenedor.repaint();
			}
		});
		btnDivisas.setBounds(12, 12, 70, 70);
		btnDivisas.setIcon(new ImageIcon("/home/andresfo/Documentos/Codigos/Java/PryConversor/resources/cambio-de-divisas.png"));
		btnDivisas.setToolTipText("");
		btnDivisas.setMargin(new Insets(0, 0, 0, 0));
		btnDivisas.setForeground(new Color(36, 31, 49));
		btnDivisas.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnDivisas.setBorderPainted(false);
		btnDivisas.setBackground(new Color(248, 228, 92));
		add(btnDivisas);
		
		JLabel lblDivisas = new JLabel("Divisas");
		lblDivisas.setBounds(10, 84, 72, 15);
		lblDivisas.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDivisas);
		
		JButton btnTemperatura = new JButton("");
		btnTemperatura.setIcon(new ImageIcon("/home/andresfo/Descargas/caliente.png"));
		btnTemperatura.setToolTipText("");
		btnTemperatura.setMargin(new Insets(0, 0, 0, 0));
		btnTemperatura.setForeground(new Color(36, 31, 49));
		btnTemperatura.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnTemperatura.setBorderPainted(false);
		btnTemperatura.setBackground(new Color(98, 160, 234));
		btnTemperatura.setBounds(136, 12, 70, 70);
		add(btnTemperatura);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(125, 84, 92, 15);
		add(lblTemperatura);

	}
}
