package Projekt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Samoloty {

	private JFrame frame;
	private JButton btn;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btn_wydrukuj;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void Samoloty_r() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Samoloty window = new Samoloty();
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
	public Samoloty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 549);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn = new JButton("Wy\u015Bwietl");
		btn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza_samolotow", "root", "admin");
					//System.out.println("Po³¹czono");
					
					PreparedStatement preparedStatement=connection.prepareStatement("select * from samoloty");
					
					ResultSet resultSet=preparedStatement.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(resultSet));
					
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		
		btn_wydrukuj = new JButton("Wydrukuj");
		btn_wydrukuj.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				MessageFormat header = new MessageFormat("Dostepna flota samolotow");
				
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
		
		btnNewButton = new JButton("Wstecz");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Glowne_Okno go = new Glowne_Okno();
				go.Glowne();
			}
		});
		btnNewButton.setBounds(629, 487, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btn_wydrukuj.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		btn_wydrukuj.setBounds(473, 389, 235, 63);
		frame.getContentPane().add(btn_wydrukuj);
		btn.setBounds(10, 389, 235, 63);
		frame.getContentPane().add(btn);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 129, 698, 219);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable() {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Typ samolotu", "Nazwa samolotu", "Max pasa\u017Cer\u00F3w", "Pr\u0119dko\u015B\u0107 przelotowa", "Rozpi\u0119to\u015B\u0107 skrzyde\u0142", "Zasi\u0119g samolotu"
			}
		));
		
		JLabel lblNewLabel = new JLabel("Wszystkie rodzaje samolot\u00F3w w naszej flocie");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 698, 106);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Kuba\\git\\Baza_Lotow_Java\\Projekt_Java\\icon\\tlo_strona_glowna.jpg"));
		lblNewLabel_1.setBounds(0, 0, 718, 510);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
