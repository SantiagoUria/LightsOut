package controller;

import java.util.Random;

public class Board {
	private Light[][] lights;

	Board(int size) {
		lights = new Light[size][size];
		initializeBoard();
	}

	private void initializeBoard() {
		Random random = new Random();
		for (Light[] lightArray : lights) {
			for (Light light : lightArray) {
				light = new Light(random.nextBoolean());
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
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}

	private String printRow(Light[] row) {
		StringBuilder stringBuilder = new StringBuilder("- ");
		for (Light light : row) {
			if (light.getState()) {
				stringBuilder.append(1).append(" ");
			} else {
				stringBuilder.append(0).append(" ");
			}
		}
		stringBuilder.append("-\n");
		return stringBuilder.toString();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("-------------\n");
		for (int i = 0; i < lights.length; i++) {
			stringBuilder.append(printRow(lights[i]));
		}
		stringBuilder.append("-------------\n");
		return stringBuilder.toString();
	}

}
