package model;

import java.security.InvalidParameterException;
import java.util.Random;

public class Board {
	protected Light[][] lights;
	protected int tries = 0;
	protected int size;
	private int gameMode;
	private final int CLASSIC_MODE = 0;
	private final int VARIANT_MODE = 1;

	public Board(int size, int gameMode) {
		this.size = size;
		lights = new Light[size][size];
		this.gameMode = gameMode;
		initializeBoard();
	}

	private void initializeBoard() {
		Random random = new Random();
		for (int i = 0; i < lights.length; i++)
			for (int j = 0; j < lights.length; j++)
				lights[i][j] = new Light(random.nextBoolean());
	}

	public boolean isCompleted() {
		for (Light[] lightRow : lights)
			for (Light light : lightRow)
				if (light.getState())
					return false;
		return true;
	}

	public Light getLight(int row, int col) {
		return lights[row][col];
	}

	public Light[][] getAllLights() {
		return lights;
	}

	public int getSize() {
		return size;
	}

	public int getTries() {
		return tries;
	}

	public void switchLightValue(int row, int col) {
		if (validPosition(row, col)) {
			getLight(row, col).hitSwitch();
			if (gameMode == CLASSIC_MODE) {
				classicHitNeighbours(row, col);
			} else if (gameMode == VARIANT_MODE) {
				variantHitNeighbours(row, col);
			}
		} else {
			throw new InvalidParameterException("Thats not a valid position, the coords supplied are out of bound");
		}
	}

	private void variantHitNeighbours(int row, int col) {
		for (int i = 0; i < lights.length; i++) {
			lights[i][col].hitSwitch();
			lights[row][i].hitSwitch();
		}
	}

	private void classicHitNeighbours(int row, int col) {

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

	private boolean validPosition(int row, int col) {
		return row >= 0 && row < lights.length && col >= 0 && col < lights.length;
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