package model;

import java.util.Random;

public abstract class Board {
	protected Light[][] lights;
	protected int tries;
	protected int size;

	public Board(int size) {
		this.size = size;
		lights = new Light[size][size];
		tries = 0;
		initializeBoard();
	}

	private void initializeBoard() {
		Random random = new Random();
		for (int i = 0; i < lights.length; i++)
			for (int j = 0; j < lights.length; j++)
				lights[i][j] = new Light(random.nextBoolean());
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

	public int getTries() {
		return tries;
	}

	public boolean isCompleted() {
		for (Light[] lightRow : lights)
			for (Light light : lightRow)
				if (light.getState())
					return false;
		return true;
	}

	public int getSize() {
		return size;
	}

	public Light[][] getLights() {
		return lights;
	}

	public Light getLight(int row, int col) {
		return lights[row][col];
	}

	public abstract void switchLightValue(int i, int j);

}