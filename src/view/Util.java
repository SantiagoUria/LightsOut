package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Board;

public final class Util {

	public static void setBackground(JPanel panel) {
		JLabel background;
		String path = "src/view/background.jpg";
		ImageIcon img = new ImageIcon(path);
		background = new JLabel("", img, SwingConstants.TRAILING);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		background.setBounds(10, 11, 764, 539);
		panel.add(background);
	}

	public static void showWinScreen(JPanel panel, int tries) {
		WinScreen winScreen = new WinScreen(tries);
		panel.removeAll();
		panel.add(winScreen, Component.CENTER_ALIGNMENT);
		winScreen.setSize(800, 600);
		winScreen.setLocation(0, 0);
		panel.revalidate();
		panel.repaint();
	}

	public static void showGameModeSelectorScreen(JPanel panel, int level, int gameMode) {
		Board board = new Board(level, gameMode);
		Game game = new Game(board);
		game.setSize(800, 600);
		game.setLocation(0, 0);
		panel.removeAll();
		panel.add(game, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}

	public static void showLevelSelectorScreen(JPanel panel) {
		LevelSelector selection = new LevelSelector();
		selection.setSize(800, 600);
		selection.setLocation(0, 0);
		panel.removeAll();
		panel.add(selection, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();

	}

	public static void showScoreScreen(JPanel panel) {
		Records score = new Records();
		panel.removeAll();
		panel.add(score, Component.CENTER_ALIGNMENT);
		score.setSize(800, 600);
		score.setLocation(0, 0);
		panel.revalidate();
		panel.repaint();

	}

	public static void showGameModeSelectorScreen(JPanel panel, int level) {
		GameModeSelector gamemode = new GameModeSelector(level);
		gamemode.setSize(800, 600);
		gamemode.setLocation(0, 0);
		panel.removeAll();
		panel.add(gamemode, Component.CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();
	}

	public static String getProperName(String str) {
		String ret = str;
		int lenght = str.length();
		if (lenght >= 3) {
			ret = ret.substring(0, 3);
		}
		return ret.toUpperCase();
	}
}
