package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

public class WarGuiView {

	private JFrame frame;
	private JTextField txtPlayer1;
	private JTextField txtPlayer2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarGuiView window = new WarGuiView();
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
	public WarGuiView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		frame.setBounds(100, 100, 916, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblGame = new JLabel("I DECLARE WAR!");
		lblGame.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPlayer1 = new JLabel("Player 1, Enter your name:");
		lblPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtPlayer1 = new JTextField();
		txtPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPlayer1.setColumns(10);
		
		JLabel lblPlayer2 = new JLabel("Player 2, Enter your name:");
		lblPlayer2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtPlayer2 = new JTextField();
		txtPlayer2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPlayer2.setColumns(10);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setForeground(new Color(34, 139, 34));
		btnPlay.setBackground(new Color(34, 139, 34));
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(437, Short.MAX_VALUE)
					.addComponent(lblGame)
					.addGap(405))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPlayer2, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
							.addGap(55)
							.addComponent(txtPlayer2, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPlayer1, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
							.addGap(55)
							.addComponent(txtPlayer1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
							.addGap(165))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(292)
					.addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(364, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGame)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPlayer1)
						.addComponent(txtPlayer1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addComponent(lblPlayer2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(txtPlayer2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(416, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
