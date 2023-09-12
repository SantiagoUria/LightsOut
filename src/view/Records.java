package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.PlayerScore;
import controller.ScoreController;

public class Records extends JPanel {
	private JPanel panel;
	private PlayerScore[] scores;

	public Records() {
		ScoreController sc = new ScoreController();
		scores = sc.getHighestThree();
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		JLabel topScoresLabel = new JLabel("Top Scores:");
		topScoresLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topScoresLabel.setFont(new Font("MingLiU-ExtB", Font.BOLD, 32));
		topScoresLabel.setBounds(10, 72, 780, 52);
		panel.add(topScoresLabel);

		if (scores[0] != null) {

			JLabel playerNameLabelOne = new JLabel(Util.getProperName(scores[0].getName()));
			playerNameLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelOne.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelOne.setBounds(11, 135, 390, 30);
			panel.add(playerNameLabelOne);

			JLabel playerNameLabelOneSub = new JLabel(Util.getProperName(scores[0].getName()));
			playerNameLabelOneSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelOneSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelOneSub.setForeground(new Color(255, 255, 255));
			playerNameLabelOneSub.setBounds(10, 137, 390, 30);
			panel.add(playerNameLabelOneSub);

			JLabel playerScoreLabelOne = new JLabel(Integer.toString(scores[0].getScore()));
			playerScoreLabelOne.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelOne.setBounds(400, 135, 390, 30);
			panel.add(playerScoreLabelOne);

			JLabel playerScoreLabelOneSub = new JLabel(Integer.toString(scores[0].getScore()));
			playerScoreLabelOneSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelOneSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelOneSub.setBounds(399, 137, 390, 30);
			playerScoreLabelOneSub.setForeground(new Color(255, 255, 255));
			panel.add(playerScoreLabelOneSub);

			JLabel firstPlaceImg = new JLabel("");
			String path = "scr/view/medal1.png";
			firstPlaceImg.setIcon(new ImageIcon(path));
			firstPlaceImg.setBounds(50, 135, 20, 32);
			panel.add(firstPlaceImg);

		}
		if (scores[1] != null) {

			JLabel playerNameLabelTwo = new JLabel(Util.getProperName(scores[1].getName()));
			playerNameLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelTwo.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelTwo.setBounds(10, 174, 390, 30);
			panel.add(playerNameLabelTwo);

			JLabel playerNameLabelTwoSub = new JLabel(Util.getProperName(scores[1].getName()));
			playerNameLabelTwoSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelTwoSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelTwoSub.setForeground(new Color(255, 255, 255));
			playerNameLabelTwoSub.setBounds(9, 176, 390, 30);
			panel.add(playerNameLabelTwoSub);

			JLabel playerScoreLabelTwo = new JLabel(Integer.toString(scores[1].getScore()));
			playerScoreLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelTwo.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelTwo.setBounds(400, 174, 390, 30);
			panel.add(playerScoreLabelTwo);

			JLabel playerScoreLabelTwoSub = new JLabel(Integer.toString(scores[1].getScore()));
			playerScoreLabelTwoSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelTwoSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelTwoSub.setBounds(399, 176, 390, 30);
			playerScoreLabelTwoSub.setForeground(new Color(255, 255, 255));
			panel.add(playerScoreLabelTwoSub);

			JLabel secondPlaceImg = new JLabel("");
			String path = "src/view/medal2.png";
			secondPlaceImg.setIcon(new ImageIcon(path));
			secondPlaceImg.setBounds(50, 175, 20, 32);
			panel.add(secondPlaceImg);
		}
		if (scores[2] != null) {

			JLabel playerNameLabelThree = new JLabel(Util.getProperName(scores[2].getName()));
			playerNameLabelThree.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelThree.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelThree.setBounds(10, 215, 390, 30);
			panel.add(playerNameLabelThree);

			JLabel playerNameLabelThreeSub = new JLabel(Util.getProperName(scores[2].getName()));
			playerNameLabelThreeSub.setForeground(new Color(255, 255, 255));
			playerNameLabelThreeSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerNameLabelThreeSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerNameLabelThreeSub.setBounds(9, 217, 390, 30);
			panel.add(playerNameLabelThreeSub);

			JLabel playerScoreLabelThree = new JLabel(Integer.toString(scores[2].getScore()));
			playerScoreLabelThree.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelThree.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelThree.setBounds(400, 215, 390, 30);
			panel.add(playerScoreLabelThree);

			JLabel playerScoreLabelThreeSub = new JLabel(Integer.toString(scores[2].getScore()));
			playerScoreLabelThreeSub.setForeground(new Color(255, 255, 255));
			playerScoreLabelThreeSub.setHorizontalAlignment(SwingConstants.CENTER);
			playerScoreLabelThreeSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
			playerScoreLabelThreeSub.setBounds(399, 217, 390, 30);
			panel.add(playerScoreLabelThreeSub);
			
			JLabel thirdPlaceImg = new JLabel("");
			String path = "scr/view/medal3.png";
			thirdPlaceImg.setIcon(new ImageIcon(path));
			thirdPlaceImg.setBounds(50, 215, 20, 32);
			panel.add(thirdPlaceImg);
		}

		Util.setBackground(panel);

	}
}
