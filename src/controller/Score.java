package controller;

import java.util.ArrayList;

public class Score {
	private ArrayList<PlayerScore> scores = new ArrayList<PlayerScore>();

	public void addScore(PlayerScore score) {
		scores.add(score);
	}

	public String toString() {
		String ret = "";
		for (PlayerScore score : scores) {
			ret = ret + "name: " + score.getName() + " - score: " + score.getScore() + "\n";
		}
		return ret;
	}

	public ArrayList<PlayerScore> getScores() {
		return scores;
	}
}
