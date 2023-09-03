package model;

public class ClassicBoard extends Board {

	public ClassicBoard(int size) {
		super(size);
	}

	public void switchLightValue(int row, int col) {
		hitNeighboursLights(row, col);
	}

	private void hitNeighboursLights(int row, int col) {
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
//			System.out.println(":( Thats not a valid position. Try again!");
		}

	}

	private boolean validPosition(int row, int col) {
		return row >= 0 && row < lights.length && col >= 0 && col < lights.length;
	}

	public Light getLight(int row, int col) {
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

}