package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LevelSelector extends JPanel {
	private JPanel panel;

	public LevelSelector() {
		initComponents();
	}

	private void initComponents() {

		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		JLabel lblSelectALevel = new JLabel("Select a level");
		lblSelectALevel.setFont(new Font("MingLiU-ExtB", Font.BOLD, 22));
		lblSelectALevel.setBounds(299, 159, 170, 48);
		panel.add(lblSelectALevel);

		JButton btnLevelOne = new JButton("1");
		btnLevelOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame(3);
			}
		});
		btnLevelOne.setBounds(239, 288, 70, 70);
		panel.add(btnLevelOne);

		JButton btnLevelTwo = new JButton("2");
		btnLevelTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame(4);
			}
		});
		btnLevelTwo.setBounds(349, 288, 70, 70);
		panel.add(btnLevelTwo);

		JButton btnLevelThree = new JButton("3");
		btnLevelThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame(5);
			}
		});
		btnLevelThree.setBounds(461, 288, 70, 70);
		panel.add(btnLevelThree);
		setBackground();
	}

	private void setBackground() {
		JLabel background;

		background = new JLabel("",
				new ImageIcon("C:\\Users\\Santi\\eclipse-workspace\\LightsOut2\\src\\view\\background.jpg"),
				SwingConstants.TRAILING);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		background.setBounds(10, 11, 764, 539);
		panel.add(background);

	}

	public void startGame(int level) {
		GameModeSelector gamemode = new GameModeSelector(level);
		gamemode.setSize(800, 600);
		gamemode.setLocation(0, 0);
		panel.removeAll();
		panel.add(gamemode, CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}

}
