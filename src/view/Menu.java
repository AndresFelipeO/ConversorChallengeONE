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
		
		JButton btnConversor_1 = new JButton("");
		btnConversor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlConversorDivisas conversorDivisas=new PnlConversorDivisas(pnlContenedor);
				conversorDivisas.setSize(451,251);
				pnlContenedor.removeAll();
				pnlContenedor.add(conversorDivisas,BorderLayout.CENTER);
				pnlContenedor.revalidate();
				pnlContenedor.repaint();
			}
		});
		btnConversor_1.setBounds(12, 12, 70, 70);
		btnConversor_1.setIcon(new ImageIcon("/home/andresfo/Documentos/Codigos/Java/PryConversor/resources/cambio-de-divisas.png"));
		btnConversor_1.setToolTipText("");
		btnConversor_1.setMargin(new Insets(0, 0, 0, 0));
		btnConversor_1.setForeground(new Color(36, 31, 49));
		btnConversor_1.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnConversor_1.setBorderPainted(false);
		btnConversor_1.setBackground(new Color(248, 228, 92));
		add(btnConversor_1);
		
		JLabel lblNewLabel = new JLabel("Divisas");
		lblNewLabel.setBounds(10, 84, 72, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);

	}

}
