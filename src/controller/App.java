package controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! Which board size would you like to play?");
		int boardSize = scan.nextInt();

		
		Board board = new Board(boardSize);
		while(!board.isCompleted()) {
			System.out.println(board.toString());
			System.out.println("Enter the row number");
			int rowTarget = scan.nextInt();
			System.out.println("Enter the column number");
			int colTarget = scan.nextInt();
			board.switchLightValue(rowTarget, colTarget);
		}
	}
}
