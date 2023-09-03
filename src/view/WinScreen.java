package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WinScreen extends JPanel {
	private JTextField playerNameTextField;
	private JPanel panel;
	private int tries;

	/**
	 * Create the panel.
	 */
	public WinScreen(int tries) {
		this.tries = tries;
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		JLabel winMessage = new JLabel("You Won!");
		winMessage.setFont(new Font("MingLiU-ExtB", Font.BOLD, 32));
		winMessage.setHorizontalAlignment(SwingConstants.CENTER);
		winMessage.setBounds(10, 103, 780, 60);
		panel.add(winMessage);

		JLabel lblScore = new JLabel("Number of tries: " + tries);
		lblScore.setVerticalAlignment(SwingConstants.BOTTOM);
		lblScore.setFont(new Font("MingLiU-ExtB", Font.BOLD, 32));
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(10, 194, 780, 49);
		panel.add(lblScore);

		JLabel lblEnterYourNickname = new JLabel("Enter your nickname");
		lblEnterYourNickname.setFont(new Font("MingLiU-ExtB", Font.BOLD, 32));
		lblEnterYourNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourNickname.setBounds(10, 281, 780, 39);
		panel.add(lblEnterYourNickname);

		playerNameTextField = new JTextField();
		playerNameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameTextField.setFont(new Font("MingLiU-ExtB", Font.BOLD, 22));
		playerNameTextField.setBounds(300, 341, 200, 40);
		panel.add(playerNameTextField);
		playerNameTextField.setColumns(10);

		JButton sendScoreButton = new JButton("Send");
		sendScoreButton.setFont(new Font("MingLiU-ExtB", Font.BOLD, 20));
		sendScoreButton.setBounds(350, 391, 100, 40);
		sendScoreButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// envia datos
				scoreScreen();
			}

		});
		panel.add(sendScoreButton);

		setBackground();

	}

	private void setBackground() {
		JLabel background;

		new ImageIcon("background.jpg");
		background = new JLabel("",
				new ImageIcon("C:\\Users\\Santi\\eclipse-workspace\\LightsOut2\\src\\view\\background.jpg"),
				SwingConstants.TRAILING);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		background.setBounds(10, 11, 764, 539);
		panel.add(background);

	}

	public void scoreScreen() {
		Score score = new Score();
		panel.removeAll();
		panel.add(score, CENTER_ALIGNMENT);
		score.setSize(800, 600);
		score.setLocation(0, 0);
		panel.revalidate();
		panel.repaint();

	}
}
