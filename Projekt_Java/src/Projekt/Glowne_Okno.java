package Projekt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Glowne_Okno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Glowne() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Glowne_Okno window = new Glowne_Okno();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Glowne_Okno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 409);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_1 = new JButton("Rodzaje samolot\u00F3w");
		
		
		
		btn_1.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Samoloty sr = new Samoloty();
				sr.Samoloty_r();
				
			}
		});
		
		JButton btn_2 = new JButton("Dost\u0119pne loty");
		
		
		
		btn_2.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Okno_Dostepne_Loty odl = new Okno_Dostepne_Loty();
				odl.Okno_loty();
			}
		});
		
		JButton btnWyloguj = new JButton("Wyloguj");
		btnWyloguj.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Strona_Startowa str_startowa = new Strona_Startowa();
				str_startowa.main(null);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Opcje dla klienta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setBounds(108, 11, 535, 80);
		frame.getContentPane().add(lblNewLabel_1);
		btnWyloguj.setBounds(635, 336, 89, 23);
		frame.getContentPane().add(btnWyloguj);
		btn_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		btn_2.setBounds(380, 147, 344, 122);
		frame.getContentPane().add(btn_2);
		btn_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		btn_1.setBounds(10, 147, 344, 122);
		frame.getContentPane().add(btn_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kuba\\git\\Baza_Lotow_Java\\Projekt_Java\\Zdjecia\\tlo_strona_glowna.jpg"));
		lblNewLabel.setBounds(0, 0, 734, 370);
		frame.getContentPane().add(lblNewLabel);
	}
}
