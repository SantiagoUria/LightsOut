package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelSelector extends JPanel implements Utilities {
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
				showGameModeSelectorScreen(panel, 3);
			}
		});
		btnLevelOne.setBounds(239, 288, 70, 70);
		panel.add(btnLevelOne);

		JButton btnLevelTwo = new JButton("2");
		btnLevelTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, 4);
			}
		});
		btnLevelTwo.setBounds(349, 288, 70, 70);
		panel.add(btnLevelTwo);

		JButton btnLevelThree = new JButton("3");
		btnLevelThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, 5);
			}
		});
		btnLevelThree.setBounds(461, 288, 70, 70);
		panel.add(btnLevelThree);
		setBackground(panel);
	}



}
