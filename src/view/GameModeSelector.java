package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Board;
import model.ClassicBoard;
import model.VariantBoard;

public class GameModeSelector extends JPanel {
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
				startGame(size,0);
			}
		});
		panel.add(classicBoardButton);

		JButton variantBoardButton = new JButton("Variant");
		variantBoardButton.setBounds(280, 152, 89, 23);
		variantBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame(size, 1);
			}
		});
		panel.add(variantBoardButton);

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

	public void startGame(int level, int mode) {
		Board board;
		if (mode == 0) {
			board = new ClassicBoard(level);
		} else {
			board = new VariantBoard(level);
		}
		Game game = new Game(board);
		game.setSize(800, 600);
		game.setLocation(0, 0);
		panel.removeAll();
		panel.add(game, CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}
}
