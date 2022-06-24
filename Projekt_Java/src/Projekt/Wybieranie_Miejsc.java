package Projekt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Wybieranie_Miejsc implements ActionListener{

	private JFrame frame;
	int g = Okno_Dostepne_Loty.miejsca;
	
	
	JButton btn_A2 = new JButton("A2");
	JButton btn_A3 = new JButton("A3");
	JButton btn_A4 = new JButton("A4");
	JButton btn_A5 = new JButton("A5");
	JButton btn_A6 = new JButton("A6");
	JButton btn_A1 = new JButton("A1");
	
	JButton btn_B1 = new JButton("B1");
	JButton btn_B2 = new JButton("B2");
	JButton btn_B3 = new JButton("B3");
	JButton btn_B4 = new JButton("B4");
	JButton btn_B5 = new JButton("B5");
	JButton btn_B6 = new JButton("B6");
	
	JButton btn_C1 = new JButton("C1");
	JButton btn_C2 = new JButton("C2");
	JButton btn_C3 = new JButton("C3");
	JButton btn_C4 = new JButton("C4");
	JButton btn_C5 = new JButton("C5");
	JButton btn_C6 = new JButton("C6");
	
	JButton btn_D1 = new JButton("D1");
	JButton btn_D2 = new JButton("D2");
	JButton btn_D3 = new JButton("D3");
	JButton btn_D4 = new JButton("D4");
	JButton btn_D5 = new JButton("D5");
	JButton btn_D6 = new JButton("D6");
	
	JButton btn_E1 = new JButton("E1");
	JButton btn_E2 = new JButton("E2");
	JButton btn_E3 = new JButton("E3");
	JButton btn_E4 = new JButton("E4");
	JButton btn_E5 = new JButton("E5");
	JButton btn_E6 = new JButton("E6");
	
	JButton btn_F1 = new JButton("E1");
	JButton btn_F2 = new JButton("F2");
	JButton btn_F3 = new JButton("F3");
	JButton btn_F4 = new JButton("F4");
	JButton btn_F5 = new JButton("F5");
	JButton btn_F6 = new JButton("F6");
	
	JButton btn_G1 = new JButton("G1");
	JButton btn_G2 = new JButton("G2");
	JButton btn_G3 = new JButton("G3");
	JButton btn_G4 = new JButton("G4");
	JButton btn_G5 = new JButton("G5");
	JButton btn_G6 = new JButton("G6");
	
	JButton btn_H1 = new JButton("H1");
	JButton btn_H2 = new JButton("H2");
	JButton btn_H3 = new JButton("H3");
	JButton btn_H4 = new JButton("H4");
	JButton btn_H5 = new JButton("H5");
	JButton btn_H6 = new JButton("H6");
	
	JButton btn_ponownie = new JButton("Wybierz ponownie");
	JButton btn_zatwierdzenie = new JButton("Zatwierdz");
	

	/**
	 * Launch the application.
	 */
	public static void W_Miejsc() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wybieranie_Miejsc window = new Wybieranie_Miejsc();
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
	public Wybieranie_Miejsc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 680);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
frame.getContentPane().setLayout(null);
		
		btn_A1.addActionListener(this);
		btn_A2.addActionListener(this);
		btn_A3.addActionListener(this);
		btn_A4.addActionListener(this);
		btn_A5.addActionListener(this);
		btn_A6.addActionListener(this);
		
		btn_B1.addActionListener(this);
		btn_B2.addActionListener(this);
		btn_B3.addActionListener(this);
		btn_B4.addActionListener(this);
		btn_B5.addActionListener(this);
		btn_B6.addActionListener(this);
		
		btn_C1.addActionListener(this);
		btn_C2.addActionListener(this);
		btn_C3.addActionListener(this);
		btn_C4.addActionListener(this);
		btn_C6.addActionListener(this);
		btn_C5.addActionListener(this);
		
		btn_D1.addActionListener(this);
		btn_D2.addActionListener(this);
		btn_D3.addActionListener(this);
		btn_D4.addActionListener(this);
		btn_D5.addActionListener(this);
		btn_D6.addActionListener(this);
		
		btn_E1.addActionListener(this);
		btn_E2.addActionListener(this);
		btn_E3.addActionListener(this);
		btn_E4.addActionListener(this);
		btn_E5.addActionListener(this);
		btn_E6.addActionListener(this);
		
		btn_F1.addActionListener(this);
		btn_F2.addActionListener(this);
		btn_F3.addActionListener(this);
		btn_F4.addActionListener(this);
		btn_F5.addActionListener(this);
		btn_F6.addActionListener(this);
		
		btn_G1.addActionListener(this);
		btn_G2.addActionListener(this);
		btn_G3.addActionListener(this);
		btn_G4.addActionListener(this);
		btn_G5.addActionListener(this);
		btn_G6.addActionListener(this);
		
		btn_H1.addActionListener(this);
		btn_H2.addActionListener(this);
		btn_H3.addActionListener(this);
		btn_H4.addActionListener(this);
		btn_H5.addActionListener(this);
		btn_H6.addActionListener(this);
		
		btn_ponownie.addActionListener(this);
		btn_zatwierdzenie.addActionListener(this);
		
		
		
		btn_A1.setBounds(10, 112, 50, 50);
		frame.getContentPane().add(btn_A1);
		
		
		btn_A2.setBounds(70, 112, 50, 50);
		frame.getContentPane().add(btn_A2);
		
		
		btn_A3.setBounds(130, 112, 50, 50);
		frame.getContentPane().add(btn_A3);
		
		
		btn_A4.setBounds(251, 112, 50, 50);
		frame.getContentPane().add(btn_A4);
		
		
		btn_A5.setBounds(311, 112, 50, 50);
		frame.getContentPane().add(btn_A5);
		
		
		btn_A6.setBounds(371, 112, 50, 50);
		frame.getContentPane().add(btn_A6);
		
		
		btn_B1.setBounds(10, 173, 50, 50);
		frame.getContentPane().add(btn_B1);
		
	
		btn_B2.setBounds(70, 173, 50, 50);
		frame.getContentPane().add(btn_B2);
		
	
		btn_B3.setBounds(130, 173, 50, 50);
		frame.getContentPane().add(btn_B3);
		
		
		btn_B4.setBounds(251, 173, 50, 50);
		frame.getContentPane().add(btn_B4);
		
	
		btn_B5.setBounds(311, 173, 50, 50);
		frame.getContentPane().add(btn_B5);
		
	
		btn_B6.setBounds(371, 173, 50, 50);
		frame.getContentPane().add(btn_B6);
		
	
		btn_C1.setBounds(10, 234, 50, 50);
		frame.getContentPane().add(btn_C1);
		
		
		btn_C2.setBounds(70, 234, 50, 50);
		frame.getContentPane().add(btn_C2);
		
	
		btn_C3.setBounds(130, 234, 50, 50);
		frame.getContentPane().add(btn_C3);
		
		
		btn_C4.setBounds(251, 234, 50, 50);
		frame.getContentPane().add(btn_C4);
		
		
		btn_C5.setBounds(311, 234, 50, 50);
		frame.getContentPane().add(btn_C5);
		
	
		btn_C6.setBounds(371, 234, 50, 50);
		frame.getContentPane().add(btn_C6);
		
	
		btn_D1.setBounds(10, 295, 50, 50);
		frame.getContentPane().add(btn_D1);
		
	
		btn_D2.setBounds(70, 295, 50, 50);
		frame.getContentPane().add(btn_D2);
		
	
		btn_D3.setBounds(130, 295, 50, 50);
		frame.getContentPane().add(btn_D3);
		
	
		btn_D4.setBounds(251, 295, 50, 50);
		frame.getContentPane().add(btn_D4);
		

		btn_D5.setBounds(311, 295, 50, 50);
		frame.getContentPane().add(btn_D5);
		

		btn_D6.setBounds(371, 295, 50, 50);
		frame.getContentPane().add(btn_D6);
		
	
		btn_E1.setBounds(10, 356, 50, 50);
		frame.getContentPane().add(btn_E1);
		
	
		btn_E2.setBounds(70, 356, 50, 50);
		frame.getContentPane().add(btn_E2);
		
	
		btn_E3.setBounds(130, 356, 50, 50);
		frame.getContentPane().add(btn_E3);
		

		btn_E4.setBounds(251, 356, 50, 50);
		frame.getContentPane().add(btn_E4);
		

		btn_E5.setBounds(311, 356, 50, 50);
		frame.getContentPane().add(btn_E5);
		

		btn_E6.setBounds(371, 356, 50, 50);
		frame.getContentPane().add(btn_E6);
		

		btn_F1.setBounds(10, 417, 50, 50);
		frame.getContentPane().add(btn_F1);
		
	
		btn_F2.setBounds(70, 417, 50, 50);
		frame.getContentPane().add(btn_F2);
		
	
		btn_F3.setBounds(130, 417, 50, 50);
		frame.getContentPane().add(btn_F3);
		
		
		btn_F4.setBounds(251, 417, 50, 50);
		frame.getContentPane().add(btn_F4);
		
		
		btn_F5.setBounds(311, 417, 50, 50);
		frame.getContentPane().add(btn_F5);
		
	
		btn_F6.setBounds(371, 417, 50, 50);
		frame.getContentPane().add(btn_F6);
		
	
		btn_G1.setBounds(10, 478, 50, 50);
		frame.getContentPane().add(btn_G1);
		

		btn_G2.setBounds(70, 478, 50, 50);
		frame.getContentPane().add(btn_G2);
		
		
		btn_G3.setBounds(130, 478, 50, 50);
		frame.getContentPane().add(btn_G3);
		
		
		btn_G4.setBounds(251, 478, 50, 50);
		frame.getContentPane().add(btn_G4);
		
		
		btn_G5.setBounds(311, 478, 50, 50);
		frame.getContentPane().add(btn_G5);
		
	
		btn_G6.setBounds(371, 478, 50, 50);
		frame.getContentPane().add(btn_G6);
		
	
		btn_H1.setBounds(10, 539, 50, 50);
		frame.getContentPane().add(btn_H1);
		
	
		btn_H2.setBounds(70, 539, 50, 50);
		frame.getContentPane().add(btn_H2);
		
	
		btn_H3.setBounds(130, 539, 50, 50);
		frame.getContentPane().add(btn_H3);
		
	
		btn_H4.setBounds(251, 539, 50, 50);
		frame.getContentPane().add(btn_H4);
		
	
		btn_H5.setBounds(311, 539, 50, 50);
		frame.getContentPane().add(btn_H5);
		
	
		btn_H6.setBounds(371, 539, 50, 50);
		frame.getContentPane().add(btn_H6);
		
		
		btn_ponownie.setBounds(10, 607, 153, 23);
		frame.getContentPane().add(btn_ponownie);
		
		JButton btn_zatwierdzenie = new JButton("Zatwierdz");
		btn_zatwierdzenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int zakonczenie = JOptionPane.showConfirmDialog(null, "Dziêkujemy za z³o¿enie zamówienia \n Czy chcesz zakoñczyæ program?", "Zamówienie", JOptionPane.YES_NO_OPTION ,JOptionPane.INFORMATION_MESSAGE);
				
				if(zakonczenie == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			
			}
		});
		btn_zatwierdzenie.setBounds(292, 607, 132, 23);
		frame.getContentPane().add(btn_zatwierdzenie);
		
		JLabel lblNewLabel = new JLabel("Wyb\u00F3r podanej ilo\u015Bci miejsc w samolocie");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 411, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Kuba\\OneDrive\\Pulpit\\Java\\Projekt_Java\\icon\\sam_msc.jpg"));
		lblNewLabel_1.setBounds(-244, -61, 733, 702);
		frame.getContentPane().add(lblNewLabel_1);
	}

	int i = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		Object zrodlo = e.getSource();
		i++;
		if(i<=g)
		{
		if(zrodlo == btn_A1)
		{
		btn_A1.setEnabled(false);
		}
		else if(zrodlo == btn_A2)
		{
			btn_A2.setEnabled(false);
		}
		else if(zrodlo == btn_A3)
		{
			btn_A3.setEnabled(false);
		}
		else if(zrodlo == btn_A4)
		{
			btn_A4.setEnabled(false);
		}
		else if(zrodlo == btn_A5)
		{
			btn_A5.setEnabled(false);
		}
		else if(zrodlo == btn_A6)
		{
			btn_A6.setEnabled(false);
		}
		
		if(zrodlo == btn_B1)
		{
		btn_B1.setEnabled(false);
		}
		else if(zrodlo == btn_B2)
		{
			btn_B2.setEnabled(false);
		}
		else if(zrodlo == btn_B3)
		{
			btn_B3.setEnabled(false);
		}
		else if(zrodlo == btn_B4)
		{
			btn_B4.setEnabled(false);
		}
		else if(zrodlo == btn_B5)
		{
			btn_B5.setEnabled(false);
		}
		else if(zrodlo == btn_B6)
		{
			btn_B6.setEnabled(false);
		}
		
		if(zrodlo == btn_C1)
		{
		btn_C1.setEnabled(false);
		}
		else if(zrodlo == btn_C2)
		{
			btn_C2.setEnabled(false);
		}
		else if(zrodlo == btn_C3)
		{
			btn_C3.setEnabled(false);
		}
		else if(zrodlo == btn_C4)
		{
			btn_C4.setEnabled(false);
		}
		else if(zrodlo == btn_C5)
		{
			btn_C5.setEnabled(false);
		}
		else if(zrodlo == btn_C6)
		{
			btn_C6.setEnabled(false);
		}
		
		if(zrodlo == btn_D1)
		{
		btn_D1.setEnabled(false);
		}
		else if(zrodlo == btn_D2)
		{
			btn_D2.setEnabled(false);
		}
		else if(zrodlo == btn_D3)
		{
			btn_D3.setEnabled(false);
		}
		else if(zrodlo == btn_D4)
		{
			btn_D4.setEnabled(false);
		}
		else if(zrodlo == btn_D5)
		{
			btn_D5.setEnabled(false);
		}
		else if(zrodlo == btn_D6)
		{
			btn_D6.setEnabled(false);
		}
		
		if(zrodlo == btn_E1)
		{
		btn_E1.setEnabled(false);
		}
		else if(zrodlo == btn_E2)
		{
			btn_E2.setEnabled(false);
		}
		else if(zrodlo == btn_E3)
		{
			btn_E3.setEnabled(false);
		}
		else if(zrodlo == btn_E4)
		{
			btn_E4.setEnabled(false);
		}
		else if(zrodlo == btn_E5)
		{
			btn_E5.setEnabled(false);
		}
		else if(zrodlo == btn_E6)
		{
			btn_E6.setEnabled(false);
		}
		
		if(zrodlo == btn_F1)
		{
		btn_F1.setEnabled(false);
		}
		else if(zrodlo == btn_F2)
		{
			btn_F2.setEnabled(false);
		}
		else if(zrodlo == btn_F3)
		{
			btn_F3.setEnabled(false);
		}
		else if(zrodlo == btn_F4)
		{
			btn_F4.setEnabled(false);
		}
		else if(zrodlo == btn_F5)
		{
			btn_F5.setEnabled(false);
		}
		else if(zrodlo == btn_F6)
		{
			btn_F6.setEnabled(false);
		}
		
		if(zrodlo == btn_G1)
		{
		btn_G1.setEnabled(false);
		}
		else if(zrodlo == btn_G2)
		{
			btn_G2.setEnabled(false);
		}
		else if(zrodlo == btn_G3)
		{
			btn_G3.setEnabled(false);
		}
		else if(zrodlo == btn_G4)
		{
			btn_G4.setEnabled(false);
		}
		else if(zrodlo == btn_G5)
		{
			btn_G5.setEnabled(false);
		}
		else if(zrodlo == btn_G6)
		{
			btn_G6.setEnabled(false);
		}
		
		if(zrodlo == btn_H1)
		{
		btn_H1.setEnabled(false);
		}
		else if(zrodlo == btn_H2)
		{
			btn_H2.setEnabled(false);
		}
		else if(zrodlo == btn_H3)
		{
			btn_H3.setEnabled(false);
		}
		else if(zrodlo == btn_H4)
		{
			btn_H4.setEnabled(false);
		}
		else if(zrodlo == btn_H5)
		{
			btn_H5.setEnabled(false);
		}
		else if(zrodlo == btn_H6)
		{
			btn_H6.setEnabled(false);
		}
		
		}
		
		else if ((i>g)&&(zrodlo!=btn_ponownie && zrodlo!=btn_zatwierdzenie))
		{
			JOptionPane.showMessageDialog(null, "Próbujesz wybraæ za du¿o miejsc!", "B³¹d", JOptionPane.WARNING_MESSAGE);
		}
		
		if(zrodlo == btn_ponownie)
			{
				i=0;
				
		
				btn_A1.setEnabled(true);
				btn_A2.setEnabled(true);
				btn_A3.setEnabled(true);
				btn_A4.setEnabled(true);
				btn_A5.setEnabled(true);
				btn_A6.setEnabled(true);
				
				btn_B1.setEnabled(true);
				btn_B2.setEnabled(true);
				btn_B3.setEnabled(true);
				btn_B4.setEnabled(true);
				btn_B5.setEnabled(true);
				btn_B6.setEnabled(true);
				
				btn_C1.setEnabled(true);
				btn_C2.setEnabled(true);
				btn_C3.setEnabled(true);
				btn_C4.setEnabled(true);
				btn_C6.setEnabled(true);
				btn_C5.setEnabled(true);
				
				btn_D1.setEnabled(true);
				btn_D2.setEnabled(true);
				btn_D3.setEnabled(true);
				btn_D4.setEnabled(true);
				btn_D5.setEnabled(true);
				btn_D6.setEnabled(true);
				
				btn_E1.setEnabled(true);
				btn_E2.setEnabled(true);
				btn_E3.setEnabled(true);
				btn_E4.setEnabled(true);
				btn_E5.setEnabled(true);
				btn_E6.setEnabled(true);
				
				btn_F1.setEnabled(true);
				btn_F2.setEnabled(true);
				btn_F3.setEnabled(true);
				btn_F4.setEnabled(true);
				btn_F5.setEnabled(true);
				btn_F6.setEnabled(true);
				
				btn_G1.setEnabled(true);
				btn_G2.setEnabled(true);
				btn_G3.setEnabled(true);
				btn_G4.setEnabled(true);
				btn_G5.setEnabled(true);
				btn_G6.setEnabled(true);
				
				btn_H1.setEnabled(true);
				btn_H2.setEnabled(true);
				btn_H3.setEnabled(true);
				btn_H4.setEnabled(true);
				btn_H5.setEnabled(true);
				btn_H6.setEnabled(true);
				
				
			}
			
		else if((zrodlo == btn_zatwierdzenie) & (i+1 == g))
			{
				int zakonczenie = JOptionPane.showConfirmDialog(null, "Dziêkujemy za z³o¿enie zamówienia \n Czy chcesz zakoñczyæ program?", "Zamówienie", JOptionPane.YES_NO_OPTION ,JOptionPane.INFORMATION_MESSAGE);
				
				if(zakonczenie == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				
			}
//			else if((zrodlo == btn_zatwierdzenie) & (i<g))
//			{
//				JOptionPane.showMessageDialog(null, "Wybierz odpowiedni¹ liczbê miejsc przed zatwierdzeniem!", "B³¹d", JOptionPane.WARNING_MESSAGE);
//			}
		}
}
