package controller;

import java.util.Random;

public class Board {
	private Light[][] lights;
	private int tries;

	Board(int size) {
		lights = new Light[size][size];
		tries = 0;
		Random random = new Random();
		for (int i = 0; i < lights.length; i++)
			for (int j = 0; j < lights.length; j++)
				lights[i][j] = new Light(random.nextBoolean());
	}

	public void switchLightValue(int row, int col) {
		if (validPosition(row, col)) {
			getLight(row, col).hitSwitch();
			if (col - 1 >= 0)
				getLightLeft(row, col).hitSwitch();
			if (col + 1 < lights.length)
				getLightRight(row, col).hitSwitch();
			if (row - 1 >= 0)
				getLightUp(row, col).hitSwitch();
			if (row + 1 < lights.length)
				getLightDown(row, col).hitSwitch();
			tries++;
		} else {
			System.out.println(":( Thats not a valid position. Try again!");
		}

	}

	public String toString() {
		StringBuilder board = new StringBuilder();
		board.append(getDashLine());
		for (Light[] lightRow : lights)
			board.append(rowToString(lightRow));
		board.append(getDashLine());
		board.append("tries: ").append(tries).append("\n");
		board.append(getDashLine());
		return board.toString();
	}

	public boolean isCompleted() {
		for (Light[] lightRow : lights)
			for (Light light : lightRow)
				if (light.getState())
					return false;
		return true;
	}

	private boolean validPosition(int row, int col) {
		return row >= 0 && row < lights.length && col >= 0 && col < lights.length;
	}

	private Light getLight(int row, int col) {
		return lights[row][col];
	}

	private Light getLightLeft(int row, int col) {
		return lights[row][col - 1];
	}

	private Light getLightRight(int row, int col) {
		return lights[row][col + 1];
	}

	private Light getLightUp(int row, int col) {
		return lights[row - 1][col];
	}

	private Light getLightDown(int row, int col) {
		return lights[row + 1][col];
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
		for (int i = 0; i < lights.length * 2; i++)
			dashLine.append("-");
		dashLine.append("\n");
		return dashLine.toString();
	}

}