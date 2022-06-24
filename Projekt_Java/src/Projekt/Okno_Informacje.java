package Projekt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_Informacje {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Informacje() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno_Informacje window = new Okno_Informacje();
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
	public Okno_Informacje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 657, 345);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Klient po poprawnym zalogowaniu uzyska dost\u0119p do opcji: ");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 573, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- przeszukiwania oraz przegl\u0105dania bazy z lotami,");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 132, 426, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- przegl\u0105dania oraz wydruku floty dost\u0119pnych samolot\u00F3w, ");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(30, 85, 492, 63);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- wyb\u00F3r odpowiedniego dla siebie lotu oraz rezerwacja biletu,");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(30, 168, 492, 63);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Wstecz");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Strona_Startowa str_startowa = new Strona_Startowa();
				str_startowa.main(null);
			}
		});
		btnNewButton.setBounds(542, 272, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("- rezerwacja biletu");
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(30, 208, 492, 63);
		frame.getContentPane().add(lblNewLabel_3_1);
	}
}
