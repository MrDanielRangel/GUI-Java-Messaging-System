import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(164, 162, 97, 25);
		frame.getContentPane().add(btnLogIn);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(156, 82, 116, 22);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 117, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblChatLogin = new JLabel("Chat LogIn");
		lblChatLogin.setBounds(142, 23, 130, 30);
		frame.getContentPane().add(lblChatLogin);
	}
}
