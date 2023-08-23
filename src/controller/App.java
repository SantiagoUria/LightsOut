package controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! Which board size would you like to play?");
		int boardSize = scan.nextInt();
		Board board = new Board(boardSize);
		
		System.out.println(board.toString());
	}
}
