package Projekt;

import java.awt.EventQueue;



import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class Logowanie_Klient {
	
	private JFrame frame;
	private JTextField tx_login;
	private JPasswordField tx_password;
	private JButton btn_Zaloguj;
	private JLabel lb_Ikona_Logowania;
	private JTextField textField_blad_login1;
	private JTextField textField_blad_haslo;
	public String login;
	private JButton btnNewButton;
	

	/**
	 * Launch the application.
	 */
	public static void Okno_Logowania() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logowanie_Klient window = new Logowanie_Klient();
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
	public Logowanie_Klient() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(60, 60));
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.getContentPane().setLayout(null);
		
		
		
		lb_Ikona_Logowania = new JLabel("");
		lb_Ikona_Logowania.setMaximumSize(new Dimension(60, 60));
		lb_Ikona_Logowania.setHorizontalAlignment(SwingConstants.CENTER);
		
		Image img_logow = new ImageIcon(this.getClass().getResource("/icon-logowanie.png")).getImage();
		lb_Ikona_Logowania.setIcon(new ImageIcon(img_logow));
		
		lb_Ikona_Logowania.setBounds(99, 11, 128, 128);
		frame.getContentPane().add(lb_Ikona_Logowania);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 164, 341, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tx_login = new JTextField();
		tx_login.setToolTipText("Podaj login: minimalnie 6 znaków, pierwsza litera z du¿ej");
		tx_login.setFont(new Font("Tahoma", Font.BOLD, 20));
		tx_login.addFocusListener(new FocusAdapter() {
		
			
		});
		tx_login.setBounds(10, 11, 244, 58);
		panel.add(tx_login);
		tx_login.setColumns(10);
		
		JLabel lb_login_img = new JLabel("");
		
		Image img_login = new ImageIcon(this.getClass().getResource("/user-icon.png")).getImage();
		lb_login_img.setIcon(new ImageIcon(img_login));
		
		lb_login_img.setBounds(271, 10, 64, 64);
		panel.add(lb_login_img);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 259, 341, 80);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		tx_password = new JPasswordField();
		tx_password.setToolTipText("Podaj has³o: minimalnie 8 znaków, 1 wielka litera");
		tx_password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tx_password.addFocusListener(new FocusAdapter() {
			
		
		});
		tx_password.setBounds(10, 11, 244, 58);
		panel_1.add(tx_password);
	
		JLabel lb_haslo_img = new JLabel("");
		lb_haslo_img.setBounds(271, 9, 64, 64);
		
		Image img_haslo = new ImageIcon(this.getClass().getResource("/icon-pass.png")).getImage();
		lb_haslo_img.setIcon(new ImageIcon(img_haslo));
		
		panel_1.add(lb_haslo_img);
		
		btn_Zaloguj = new JButton("Zaloguj!");
		btn_Zaloguj.addActionListener(new ActionListener() {
			@SuppressWarnings({ "static-access", "deprecation" })
			public void actionPerformed(ActionEvent e) {
				
				login = tx_login.getText();
				
				String haslo = tx_password.getText();
				
				
				textField_blad_login1.setText("");
				textField_blad_haslo.setText("");
				
				
				if((!tx_login.getText().equals("")) & (!tx_password.getText().equals("")))
				{
				try
				{
					dlugosc_Login(login);
				}
				catch(Login_Ilosc_Zankow ex)
				{
					textField_blad_login1.setText(ex.getMessage());
				}
				
				try
				{
					sprawdzanie_login(login);
				}
				catch(Pierwsza_Litera ex)
				{
					textField_blad_login1.setText(ex.getMessage());
				}
				
				try
				{
					dlugosc_Haslo(haslo);
				}
				catch(Dlugosc_Haslo ex)
				{
					textField_blad_haslo.setText(ex.getMessage());
				}
				
				try
				{
					haslo_duza_litera(haslo);
				}
				catch (Haslo_Znak ex) 
				{
					textField_blad_haslo.setText(ex.getMessage());
				}
				
				try
				{
					haslo_cyfra(haslo);
				}
				catch(Haslo_Cyfry ex)
				{
					textField_blad_haslo.setText(ex.getMessage());
				}
				
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wprowadz login i has³o!", "B³¹d", JOptionPane.WARNING_MESSAGE);
				}
				
				if(((textField_blad_haslo.getText().equals("")) & (textField_blad_login1.getText().equals(""))) &((!tx_login.getText().equals("")) & (!tx_password.getText().equals(""))))
				{
					frame.dispose();
					Glowne_Okno go = new Glowne_Okno();
					go.Glowne();
				}
			}
			
			
			private void sprawdzanie_login(String login) throws Pierwsza_Litera
			{
				String login_pierwsza = login.substring(0, 1);
				
				if(!login_pierwsza.matches(".*[A-Z].*"))
				{
					throw new Pierwsza_Litera(login);
				}
				
			}
				private void dlugosc_Login(String login) throws Login_Ilosc_Zankow
				{
					if(login.length()<6)
					{
						throw new Login_Ilosc_Zankow(login);
					}
				}	
				
				private void dlugosc_Haslo(String haslo) throws Dlugosc_Haslo
				{
					if(haslo.length()<8)
					{
						throw new Dlugosc_Haslo(haslo);
					}
				}
				
				private void haslo_duza_litera(String haslo) throws Haslo_Znak
				{
					if(!haslo.matches(".*[A-Z].*"))
					{
						throw new Haslo_Znak(haslo);
					}
				}
				
				private void haslo_cyfra(String haslo) throws Haslo_Cyfry
				{
					if(!haslo.matches(".*[0-9].*"))
					{
						throw new Haslo_Cyfry(haslo);					}
				}
				
			
		});
		
		
		
		btn_Zaloguj.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_Zaloguj.setBounds(30, 350, 275, 50);
		frame.getContentPane().add(btn_Zaloguj);
		
		textField_blad_login1 = new JTextField();
		textField_blad_login1.setEditable(false);
		textField_blad_login1.setBounds(10, 433, 341, 20);
		frame.getContentPane().add(textField_blad_login1);
		textField_blad_login1.setColumns(10);
		
		textField_blad_haslo = new JTextField();
		textField_blad_haslo.setEditable(false);
		textField_blad_haslo.setColumns(10);
		textField_blad_haslo.setBounds(10, 475, 341, 20);
		frame.getContentPane().add(textField_blad_haslo);
		
		btnNewButton = new JButton("Wstecz");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Strona_Startowa str_startowa = new Strona_Startowa();
				str_startowa.main(null);
			}
		});
		btnNewButton.setBounds(266, 529, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		frame.setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 381, 602);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
