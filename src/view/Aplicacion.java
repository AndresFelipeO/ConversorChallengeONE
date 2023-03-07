package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Aplicacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @brief Create the frame.
	 */
	public Aplicacion() {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBounds(0, 0, 450, 273);
		contentPane.add(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBounds(0, 0, 450, 25);
		pnlTitulo.setBackground(new Color(87, 227, 137));
		pnlPrincipal.add(pnlTitulo);
		
		JLabel lblMenu = new JLabel("Conversor Alura");
		lblMenu.setFont(new Font("Noto Traditional Nushu", Font.BOLD | Font.ITALIC, 15));
		lblMenu.setForeground(new Color(255, 255, 255));
		lblMenu.setBackground(new Color(0, 0, 0));
		pnlTitulo.add(lblMenu);
		lblMenu.setVerticalAlignment(SwingConstants.TOP);
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlContenedor = new JPanel();
		pnlContenedor.setBounds(0, 22, 450, 251);
		pnlPrincipal.add(pnlContenedor);
		pnlContenedor.setLayout(null);
		
		Menu pagina1=new Menu(pnlContenedor);
		pagina1.setSize(450,251);
		pnlContenedor.removeAll();
		pnlContenedor.add(pagina1,BorderLayout.CENTER);
		pnlContenedor.revalidate();
		pnlContenedor.repaint();
	}
	
}
