package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("test");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueil window = new accueil();
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
	public accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("test");
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("Bienvenue");
		lblNewLabel.setBounds(216, 11, 113, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("connexion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("test");
				connexion window = new connexion();
				window.run();
			}
		});
		btnNewButton_1.setBounds(198, 85, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("inscription");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inscription window = new inscription();
				window.run();
			}
		});
		btnNewButton_2.setBounds(198, 154, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
