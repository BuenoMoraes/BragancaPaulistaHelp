package br.ifsp.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaLogin {
	
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton button, cadastrar;

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getButton() {
		return button;
	}
	
	public JButton getCadastrar() {
		return cadastrar;
	}

	
	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
		frame.setVisible(true);
		
	}
		
		/**
		 * Initialize the contents of the frame.
		 */
		
		private void initialize() {
		
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.BLACK);
			frame.getContentPane().setLayout(null);
			
			JLabel label = new JLabel("Tela de Login");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Times New Roman", Font.BOLD, 50));
			label.setBounds(197, 67, 302, 42);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("Usu\u00E1rio:");
			label_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			label_1.setForeground(Color.WHITE);
			label_1.setBounds(109, 196, 106, 26);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(235, 199, 285, 23);
			frame.getContentPane().add(textField);
			
			JLabel label_2 = new JLabel("Senha:");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			label_2.setBounds(109, 257, 106, 26);
			frame.getContentPane().add(label_2);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(235, 260, 285, 23);
			frame.getContentPane().add(passwordField);
			
			button = new JButton("Entrar");
			button.setBounds(313, 365, 114, 33);
			frame.getContentPane().add(button);
			
			cadastrar = new JButton("Cadastrar-se");
	
			cadastrar.setBounds(313, 309, 114, 33);
			frame.getContentPane().add(cadastrar);
			frame.setBounds(100, 100, 701, 503);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
}
