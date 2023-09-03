package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameModeSelector extends JPanel implements Utilities {
	JPanel panel;

	public GameModeSelector(int size) {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		JButton classicBoardButton = new JButton("Classic");
		classicBoardButton.setBounds(65, 152, 89, 23);
		classicBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, size, 0);
			}
		});
		panel.add(classicBoardButton);

		JButton variantBoardButton = new JButton("Variant");
		variantBoardButton.setBounds(280, 152, 89, 23);
		variantBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGameModeSelectorScreen(panel, size, 1);
			}
		});
		panel.add(variantBoardButton);

		setBackground(panel);

	}

}
