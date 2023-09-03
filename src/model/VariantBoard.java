package model;

public class VariantBoard extends Board {

	public VariantBoard(int size) {
		super(size);
	}

	public void switchLightValue(int row, int col) {
		lights[row][col].hitSwitch();
		hitNeighboursLights(row, col);
	}

	private void hitNeighboursLights(int row, int col) {
		if (validPosition(row, col)) {
			for (int i = 0; i < lights.length; i++) {
				lights[i][col].hitSwitch();
				lights[row][i].hitSwitch();
			}
		} else {
			System.out.println(":( Thats not a valid position. Try again!");
		}

	}

	private boolean validPosition(int row, int col) {
		return row >= 0 && row < lights.length && col >= 0 && col < lights.length;
	}

	public Light getLight(int row, int col) {
		return lights[row][col];
	}
}
