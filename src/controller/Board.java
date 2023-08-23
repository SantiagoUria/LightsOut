package controller;

import java.util.Random;

public class Board {
	private Light[][] lights;

	Board(int size) {
		lights = new Light[size][size];
		Random random = new Random();
		for (int i = 0; i < lights.length; i++) {
			for (int j = 0; j < lights.length; j++) {
				lights[i][j] = new Light(random.nextBoolean());
			}
		}
	}

	public boolean getLightValue(int row, int col) {
		return lights[row][col].getState();
	}

	public void switchLightValue(int row, int col) {
		try {
			lights[row][col].hitSwitch();
			lights[row - 1][col].hitSwitch();
			lights[row + 1][col].hitSwitch();
			lights[row][col - 1].hitSwitch();
			lights[row][col + 1].hitSwitch();
		} catch (Exception e) {

		}

	}

	private String rowToString(Light[] lightRow) {
		StringBuilder stringBuilder = new StringBuilder("- ");
		for (Light light : lightRow) {
			if (light.getState()) {
				stringBuilder.append(1).append(" ");
			} else {
				stringBuilder.append(0).append(" ");
			}
		}
		stringBuilder.append("-\n");
		return stringBuilder.toString();
	}

	private String getDashLine() {
		StringBuilder dashLine = new StringBuilder("---");
		for (int i = 0; i < lights.length * 2; i++) {
			dashLine.append("-");
		}
		dashLine.append("\n");
		return dashLine.toString();
	}

	public String toString() {
		StringBuilder board = new StringBuilder();
		board.append(getDashLine());
		for (Light[] lightRow : lights) {
			board.append(rowToString(lightRow));
		}
		board.append(getDashLine());
		return board.toString();
	}

}
