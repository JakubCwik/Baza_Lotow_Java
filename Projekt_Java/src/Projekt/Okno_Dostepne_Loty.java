package Projekt;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Okno_Dostepne_Loty {

	private JFrame frame;
	private static JTable table;
	private JTextField textField_wyszukiwanie;
	private JComboBox<?> comboBox_wyszukiwanie;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_Nazwisko;
	private JTextField textField_Imie;
	private JTextField textField_numer_lotu;
	private JTextField textField_linia;
	private JTextField textField_wylot;
	private JTextField textField_kierunek;
	private JTextField textField_data;
	private JTextField textField_godzina;
	private JTextField textField_miejsca;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btn_bilet;
	private String tbl_Liczba_miejsc;
	private String tbl_ID_lotu;
	private JButton btnNewButton_1;
	public static int miejsca;
	

	/**
	 * Launch the application.
	 */
	public static void Okno_loty() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno_Dostepne_Loty window = new Okno_Dostepne_Loty();
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
	public Okno_Dostepne_Loty() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static void odswiezanie()
	{
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza_samolotow", "root", "admin");
			//System.out.println("Po³¹czono");
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from dostepne_loty");
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1398, 577);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		
		JButton btn_loty = new JButton("Dost\u0119pne loty");
		btn_loty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_loty.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
//				try {
//					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza_samolotow", "root", "admin");
//					//System.out.println("Po³¹czono");
//					
//					PreparedStatement preparedStatement=connection.prepareStatement("select * from dostepne_loty");
//					
//					ResultSet resultSet=preparedStatement.executeQuery();
//					
//					table.setModel(DbUtils.resultSetToTableModel(resultSet));
//					
//				}
//				catch(SQLException ex)
//				{
//					JOptionPane.showMessageDialog(null, ex);
//				}
				
				odswiezanie();
			}
			
			
		});
		
		textField_wyszukiwanie = new JTextField();
		textField_wyszukiwanie.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				try {
					String wybor=(String)comboBox_wyszukiwanie.getSelectedItem();
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza_samolotow", "root", "admin");
					//System.out.println("Po³¹czono");
					
					PreparedStatement preparedStatement=connection.prepareStatement("select * from dostepne_loty where "+wybor+"=? ");
					preparedStatement.setString(1, textField_wyszukiwanie.getText());
					ResultSet resultSet=preparedStatement.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(resultSet));
					
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
			
			
			
		});
		
		btn_bilet = new JButton("Zarezerwuj bilet");
		btn_bilet.addActionListener(new ActionListener() {
			
			//UPDATE
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				if((!textField_Imie.getText().equals("")) & (!textField_Nazwisko.getText().equals("")) & (!textField_miejsca.getText().equals("")))
				{
					
				 miejsca = Integer.parseInt(textField_miejsca.getText());
				int miejsca_baza = Integer.parseInt(tbl_Liczba_miejsc);
				int id_l = Integer.parseInt(textField_numer_lotu.getText());
				int wynik = miejsca_baza - miejsca;
				
				
				
				try {
				
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza_samolotow", "root", "admin");
					
					PreparedStatement preparedStatement=connection.prepareStatement("UPDATE dostepne_loty SET Liczba_miejsc="+wynik+" WHERE ID_lotu ="+ id_l);
					preparedStatement.executeUpdate();
				
					odswiezanie();
					
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				
				int zakonczenie = JOptionPane.showConfirmDialog(null, "Czy chcesz wybraæ miejsce?", "Zamówienie", JOptionPane.YES_NO_OPTION ,JOptionPane.INFORMATION_MESSAGE);
				
				if(zakonczenie == JOptionPane.YES_OPTION)
				{
					
					frame.dispose();
					Wybieranie_Miejsc wmie= new Wybieranie_Miejsc();
					wmie.W_Miejsc();

					
					
				}
				else if(zakonczenie == JOptionPane.NO_OPTION)
				{
					btn_bilet.setEnabled(false);
				}
				
			}
				else
				{
					JOptionPane.showMessageDialog(null, "Wprowadz wszystkie dane!", "B³¹d", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
		});
		
		JButton btnNewButton = new JButton("Drukowanie listy lot\u00F3w");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				MessageFormat header = new MessageFormat("Dostepne loty");
				
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try
				{
					table.print(JTable.PrintMode.NORMAL,header,footer);
				}
				catch(java.awt.print.PrinterException ex)
				{
					System.err.format("Nie mozna wydrukowac", ex.getMessage());
				}
			}
			
		});
		
		btnNewButton_1 = new JButton("Wstecz");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Glowne_Okno go = new Glowne_Okno();
				go.Glowne();
			}
		});
		btnNewButton_1.setBounds(1283, 508, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton.setBounds(40, 403, 719, 53);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Podaj liczba osob");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(1108, 367, 127, 27);
		frame.getContentPane().add(lblNewLabel_5);
		btn_bilet.setBounds(965, 454, 250, 59);
		frame.getContentPane().add(btn_bilet);
		
		lblNewLabel_4 = new JLabel("Podaj nazwisko");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(1109, 111, 106, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("Podaj imi\u0119");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(982, 111, 86, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_miejsca = new JTextField();
		textField_miejsca.setColumns(10);
		textField_miejsca.setBounds(1118, 391, 106, 41);
		frame.getContentPane().add(textField_miejsca);
		
		textField_Imie = new JTextField();
		textField_Imie.setColumns(10);
		textField_Imie.setBounds(965, 131, 106, 41);
		frame.getContentPane().add(textField_Imie);
		
		textField_Nazwisko = new JTextField();
		textField_Nazwisko.setBounds(1109, 131, 106, 41);
		frame.getContentPane().add(textField_Nazwisko);
		textField_Nazwisko.setColumns(10);
		
		textField_data = new JTextField();
		textField_data.setEditable(false);
		textField_data.setColumns(10);
		textField_data.setBounds(965, 307, 106, 41);
		frame.getContentPane().add(textField_data);
		
		textField_godzina = new JTextField();
		textField_godzina.setEditable(false);
		textField_godzina.setColumns(10);
		textField_godzina.setBounds(1109, 307, 106, 41);
		frame.getContentPane().add(textField_godzina);
		
		textField_numer_lotu = new JTextField();
		textField_numer_lotu.setEditable(false);
		textField_numer_lotu.setColumns(10);
		textField_numer_lotu.setBounds(965, 183, 106, 41);
		frame.getContentPane().add(textField_numer_lotu);
		
		textField_linia = new JTextField();
		textField_linia.setEditable(false);
		textField_linia.setColumns(10);
		textField_linia.setBounds(1109, 183, 106, 41);
		frame.getContentPane().add(textField_linia);
		
		textField_wylot = new JTextField();
		textField_wylot.setEditable(false);
		textField_wylot.setColumns(10);
		textField_wylot.setBounds(965, 244, 106, 41);
		frame.getContentPane().add(textField_wylot);
		
		textField_kierunek = new JTextField();
		textField_kierunek.setEditable(false);
		textField_kierunek.setColumns(10);
		textField_kierunek.setBounds(1109, 244, 106, 41);
		frame.getContentPane().add(textField_kierunek);
		
		lblNewLabel_2 = new JLabel("Wybierz lot aby zakupi\u0107 bilet dane uzupe\u0142ni\u0105 si\u0119 automatycznie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(817, 26, 535, 59);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("Wyszukiwanie lotu:");
		lblNewLabel_1.setBackground(UIManager.getColor("CheckBox.light"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(58, 486, 222, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		comboBox_wyszukiwanie = new JComboBox();
		comboBox_wyszukiwanie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_wyszukiwanie.setModel(new DefaultComboBoxModel(new String[] {"ID_lotu", "Wylot", "Linia", "Kierunek_lotu", "Odprawa", "Gate", "Godzina_wylotu", "Data_wylotu", "Liczba_miejsc"}));
		comboBox_wyszukiwanie.setBounds(303, 478, 215, 53);
		frame.getContentPane().add(comboBox_wyszukiwanie);
		textField_wyszukiwanie.setBounds(544, 478, 215, 53);
		frame.getContentPane().add(textField_wyszukiwanie);
		textField_wyszukiwanie.setColumns(10);
		btn_loty.setBounds(40, 339, 719, 53);
		frame.getContentPane().add(btn_loty);
		
		JScrollPane scrollPane = new JScrollPane();
		
			
			
		
		scrollPane.setBounds(10, 26, 781, 302);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable() {
			//Blokowanie edycji tabeli
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		};
		
		table.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
				
				tbl_ID_lotu = tblModel.getValueAt(table.getSelectedRow(), 0).toString();
				String tbl_Wylot = tblModel.getValueAt(table.getSelectedRow(), 1).toString();
				String tbl_Linia = tblModel.getValueAt(table.getSelectedRow(), 2).toString();
				String tbl_Kierunek_lotu = tblModel.getValueAt(table.getSelectedRow(), 3).toString();
				//String tbl_Odprawa = tblModel.getValueAt(table.getSelectedRow(), 3).toString();
				//String tbl_Gate = tblModel.getValueAt(table.getSelectedRow(), 4).toString();
				String tbl_Godzina_wylotu = tblModel.getValueAt(table.getSelectedRow(), 6).toString();
				String tbl_Data_wylotu = tblModel.getValueAt(table.getSelectedRow(), 7).toString();
				tbl_Liczba_miejsc = tblModel.getValueAt(table.getSelectedRow(), 8).toString();
				
				textField_numer_lotu.setText(tbl_ID_lotu);
				textField_linia.setText(tbl_Linia);
				textField_wylot.setText(tbl_Wylot);
				textField_data.setText(tbl_Data_wylotu);
				textField_godzina.setText(tbl_Godzina_wylotu);
				//textField_zajete.setText(tbl_Liczba_miejsc);
				textField_kierunek.setText(tbl_Kierunek_lotu);
				
				
			}
			
			
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numer lotu", "Miejsce wylotu", "Linia", "Kierunek lotu", "Odprawa", "Gate", "Godzina wylotu", "Data wylotu", "Liczba miejsc"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(2).setPreferredWidth(74);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(79);
		table.getColumnModel().getColumn(6).setPreferredWidth(91);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kuba\\git\\Baza_Lotow_Java\\Projekt_Java\\icon\\samoloty_1920x1080_026_chmury__pas_startowy.jpg"));
		lblNewLabel.setBounds(0, 0, 1382, 538);
		frame.getContentPane().add(lblNewLabel);
	}
}
