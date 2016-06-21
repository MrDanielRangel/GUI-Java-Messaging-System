import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class GUIClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIClass window = new GUIClass();
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
	public GUIClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnChat = new JButton("Chat 1");
		btnChat.setBackground(Color.CYAN);
		btnChat.setBounds(66, 46, 89, 23);
		frame.getContentPane().add(btnChat);
		
		JButton btnChat_1 = new JButton("Chat 2");
		btnChat_1.setBackground(Color.GREEN);
		btnChat_1.setBounds(66, 117, 89, 23);
		frame.getContentPane().add(btnChat_1);
		
		JButton btnChat_2 = new JButton("Chat 3");
		btnChat_2.setBackground(Color.RED);
		btnChat_2.setBounds(66, 188, 89, 23);
		frame.getContentPane().add(btnChat_2);
		
		JButton btnChat_3 = new JButton("Chat 4");
		btnChat_3.setBackground(Color.ORANGE);
		btnChat_3.setBounds(269, 46, 89, 23);
		frame.getContentPane().add(btnChat_3);
		
		JButton btnChat_4 = new JButton("Chat 5");
		btnChat_4.setBackground(Color.MAGENTA);
		btnChat_4.setBounds(269, 117, 89, 23);
		frame.getContentPane().add(btnChat_4);
		
		JButton btnChat_5 = new JButton("Chat 6");
		btnChat_5.setBackground(Color.BLUE);
		btnChat_5.setBounds(269, 188, 89, 23);
		frame.getContentPane().add(btnChat_5);
		
		JButton btnSettings = new JButton("Settings ");
		btnSettings.setBackground(Color.YELLOW);
		btnSettings.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(btnSettings);
	}
}
