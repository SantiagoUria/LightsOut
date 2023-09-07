package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameModeSelector extends JPanel implements Utilities {
	JPanel panel;

	public GameModeSelector(int size) {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		JLabel gameModeSelectLabel = new JLabel("Select a game mode");
		gameModeSelectLabel.setFont(new Font("MingLiU-ExtB", Font.BOLD, 22));
		gameModeSelectLabel.setBounds(275, 159, 250, 48);
		panel.add(gameModeSelectLabel);

		JButton classicBoardButton = new JButton("Classic");
		classicBoardButton.setBounds(239, 288, 90, 30);
		classicBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, size, 0);
			}
		});
		panel.add(classicBoardButton);

		JButton variantBoardButton = new JButton("Variant");
		variantBoardButton.setBounds(461, 288, 90, 30);
		variantBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, size, 1);
			}
		});
		panel.add(variantBoardButton);

		setBackground(panel);

	}

}
