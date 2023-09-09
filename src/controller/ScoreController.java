package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ScoreController {
	private final static String filePath = "src/controller/scores.json";
	static Score scores = new Score();

	public static void generateJSON() {
		File jsonFile = new File(filePath);
		if (!jsonFile.exists()) {

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(scores);
			try {
				FileWriter fw = new FileWriter(filePath);
				fw.write(json);
				fw.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static Score getScores() {
		Gson gson = new Gson();
		Score ret = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			ret = gson.fromJson(br, Score.class);
		} catch (Exception e) {
			System.out.println(e);
		}
		return ret;
	}

	public void addScore(PlayerScore score) {
		Score scores = getScores();
		scores.addScore(score);
		Collections.sort(scores.getScores(), new Comparator<PlayerScore>() {
			@Override
			public int compare(PlayerScore jugador1, PlayerScore jugador2) {
				// Compara los puntajes en orden descendente (de mayor a menor)
				return Integer.compare(jugador1.getScore(), jugador2.getScore());
			}
		});
		try (FileWriter writer = new FileWriter(filePath)) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(scores, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PlayerScore[] getHighestThree() {
		PlayerScore[] ret = new PlayerScore[3];
		ArrayList<PlayerScore> scores = getScores().getScores();
		int limit = 3;
		if (scores.size() < 3) {
			limit = scores.size();
		}
		for (int i = 0; i < limit; i++) {
			ret[i] = scores.get(i);
		}
		return ret;
	}

}
