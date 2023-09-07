package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Board;

public interface Utilities {
	default void setBackground(JPanel panel) {
		JLabel background;
		String path = getClass().getResource("background.jpg").getPath();
		ImageIcon img = new ImageIcon(path);
		background = new JLabel("", img, SwingConstants.TRAILING);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		background.setBounds(10, 11, 764, 539);
		panel.add(background);
	}

	default void showWinScreen(JPanel panel, int tries) {
		WinScreen winScreen = new WinScreen(tries);
		panel.removeAll();
		panel.add(winScreen, Component.CENTER_ALIGNMENT);
		winScreen.setSize(800, 600);
		winScreen.setLocation(0, 0);
		panel.revalidate();
		panel.repaint();
	}

	default void showGameModeSelectorScreen(JPanel panel, int level, int gameMode) {
		Board board = new Board(level, gameMode);
		Game game = new Game(board);
		game.setSize(800, 600);
		game.setLocation(0, 0);
		panel.removeAll();
		panel.add(game, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}

	default void showLevelSelectorScreen(JPanel panel) {
		LevelSelector selection = new LevelSelector();
		selection.setSize(800, 600);
		selection.setLocation(0, 0);
		panel.removeAll();
		panel.add(selection, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();

	}

	default void showScoreScreen(JPanel panel) {
		Score score = new Score();
		panel.removeAll();
		panel.add(score, Component.CENTER_ALIGNMENT);
		score.setSize(800, 600);
		score.setLocation(0, 0);
		panel.revalidate();
		panel.repaint();

	}

	default void showGameModeSelectorScreen(JPanel panel, int level) {
		GameModeSelector gamemode = new GameModeSelector(level);
		gamemode.setSize(800, 600);
		gamemode.setLocation(0, 0);
		panel.removeAll();
		panel.add(gamemode, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}

}