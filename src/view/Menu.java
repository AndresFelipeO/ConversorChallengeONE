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
		
		JButton btnDivisas = miBoton(new Color(248, 228, 92),new Color(36, 31, 49),"resources/cambio-de-divisas.png", 12, 12);
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
		add(btnDivisas);
		
		JLabel lblDivisas = new JLabel("Divisas");
		lblDivisas.setBounds(10, 84, 72, 15);
		lblDivisas.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDivisas);
		
		JButton btnTemperatura = miBoton(new Color(98, 160, 234),new Color(36, 31, 49),"resources/caliente.png", 136, 12);
		add(btnTemperatura);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(125, 84, 92, 15);
		add(lblTemperatura);
	}
	/**
	 * @brief metodo para personalizar el icono y el color de un jbutton general del menu
	 * @param prmColor
	 * @param prmColor2
	 * @param imagen
	 * @param x
	 * @param y
	 * @return jButton personlizado general del menu
	 */
	private JButton miBoton(Color prmColor,Color prmColor2,String imagen,int x,int y){
		JButton btnBoton = new JButton("");
		btnBoton.setIcon(new ImageIcon(imagen));
		btnBoton.setToolTipText("");
		btnBoton.setMargin(new Insets(0, 0, 0, 0));
		btnBoton.setForeground(prmColor2);
		btnBoton.setFont(new Font("Dialog", Font.ITALIC, 12));
		btnBoton.setBorderPainted(false);
		btnBoton.setBackground(prmColor);
		btnBoton.setBounds(x, y, 70, 70);
		return btnBoton;
	}
}
