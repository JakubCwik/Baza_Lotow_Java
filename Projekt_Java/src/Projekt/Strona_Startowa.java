package Projekt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;


public class Strona_Startowa {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Strona_Startowa window = new Strona_Startowa();
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
	public Strona_Startowa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 707, 485);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_logowanie = new JButton("Logowanie");
		btn_logowanie.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 65));
		btn_logowanie.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Logowanie_Klient lk = new Logowanie_Klient();
				lk.Okno_Logowania();
				
				
			}
		});
		btn_logowanie.setBounds(10, 279, 285, 156);
		frame.getContentPane().add(btn_logowanie);
		
		
		btn_logowanie.setOpaque(false);
		btn_logowanie.setContentAreaFilled(false);
		//btn_logowanie.setBorderPainted(false);
		
		JButton btn_informacje = new JButton("Informacje");
		btn_informacje.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Okno_Informacje oi = new Okno_Informacje();
				oi.Informacje();
				
			}
		});
		btn_informacje.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 65));
		btn_informacje.setBounds(362, 279, 319, 156);
		frame.getContentPane().add(btn_informacje);
		
		btn_informacje.setOpaque(false);
		btn_informacje.setContentAreaFilled(false);
		
		JLabel lblNewLabel = new JLabel("Witamy");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 90));
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(205, 11, 285, 108);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tlo = new JLabel("");
		tlo.setIcon(new ImageIcon("C:\\Users\\Kuba\\git\\Baza_Lotow_Java\\Projekt_Java\\icon\\tlo_strona_glowna.jpg"));
		tlo.setBounds(0, 0, 691, 446);
		frame.getContentPane().add(tlo);
	}
}
