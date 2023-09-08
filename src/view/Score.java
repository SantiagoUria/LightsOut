package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Score extends JPanel {
	private JPanel panel;

	public Score() {
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

		JLabel playerNameLabelOne = new JLabel("{name}");
		playerNameLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelOne.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelOne.setBounds(11, 135, 390, 30);
		panel.add(playerNameLabelOne);

		JLabel playerNameLabelOneSub = new JLabel("{name}");
		playerNameLabelOneSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelOneSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelOneSub.setForeground(new Color(255, 255, 255));
		playerNameLabelOneSub.setBounds(10, 137, 390, 30);
		panel.add(playerNameLabelOneSub);

		JLabel playerScoreLabelOne = new JLabel("{score}");
		playerScoreLabelOne.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelOne.setBounds(400, 135, 390, 30);
		panel.add(playerScoreLabelOne);

		JLabel playerScoreLabelOneSub = new JLabel("{score}");
		playerScoreLabelOneSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelOneSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelOneSub.setBounds(399, 137, 390, 30);
		playerScoreLabelOneSub.setForeground(new Color(255, 255, 255));
		panel.add(playerScoreLabelOneSub);

		JLabel playerNameLabelTwo = new JLabel("{name}");
		playerNameLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelTwo.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelTwo.setBounds(10, 174, 390, 30);
		panel.add(playerNameLabelTwo);

		JLabel playerNameLabelTwoSub = new JLabel("{name}");
		playerNameLabelTwoSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelTwoSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelTwoSub.setForeground(new Color(255, 255, 255));
		playerNameLabelTwoSub.setBounds(9, 176, 390, 30);
		panel.add(playerNameLabelTwoSub);

		JLabel playerScoreLabelTwo = new JLabel("{score}");
		playerScoreLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelTwo.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelTwo.setBounds(400, 174, 390, 30);
		panel.add(playerScoreLabelTwo);

		JLabel playerScoreLabelTwoSub = new JLabel("{score}");
		playerScoreLabelTwoSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelTwoSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelTwoSub.setBounds(399, 176, 390, 30);
		playerScoreLabelTwoSub.setForeground(new Color(255, 255, 255));

		panel.add(playerScoreLabelTwoSub);

		JLabel playerNameLabelThree = new JLabel("{name}");
		playerNameLabelThree.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelThree.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelThree.setBounds(10, 215, 390, 30);
		panel.add(playerNameLabelThree);

		JLabel playerNameLabelThreeSub = new JLabel("{name}");
		playerNameLabelThreeSub.setForeground(new Color(255, 255, 255));
		playerNameLabelThreeSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelThreeSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelThreeSub.setBounds(9, 217, 390, 30);
		panel.add(playerNameLabelThreeSub);

		JLabel playerScoreLabelThree = new JLabel("{score}");
		playerScoreLabelThree.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelThree.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelThree.setBounds(400, 215, 390, 30);
		panel.add(playerScoreLabelThree);

		JLabel playerScoreLabelThreeSub = new JLabel("{score}");
		playerScoreLabelThreeSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelThreeSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelThreeSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelThreeSub.setBounds(399, 217, 390, 30);
		panel.add(playerScoreLabelThreeSub);

		JLabel playerNameLabelFour = new JLabel("{name}");
		playerNameLabelFour.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelFour.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelFour.setBounds(10, 256, 390, 30);
		panel.add(playerNameLabelFour);

		JLabel playerNameLabelFourSub = new JLabel("{name}");
		playerNameLabelFourSub.setForeground(new Color(255, 255, 255));
		playerNameLabelFourSub.setBackground(new Color(255, 255, 255));
		playerNameLabelFourSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelFourSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelFourSub.setBounds(9, 258, 390, 30);
		panel.add(playerNameLabelFourSub);

		JLabel playerScoreLabelFour = new JLabel("{score}");
		playerScoreLabelFour.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelFour.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelFour.setBounds(400, 256, 390, 30);
		panel.add(playerScoreLabelFour);

		JLabel playerScoreLabelFourSub = new JLabel("{score}");
		playerScoreLabelFourSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelFourSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelFourSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelFourSub.setBounds(399, 258, 390, 30);
		panel.add(playerScoreLabelFourSub);

		JLabel playerNameLabelFive = new JLabel("{name}");
		playerNameLabelFive.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelFive.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelFive.setBounds(10, 297, 390, 30);
		panel.add(playerNameLabelFive);

		JLabel playerNameLabelFiveSub = new JLabel("{name}");
		playerNameLabelFiveSub.setForeground(new Color(255, 255, 255));
		playerNameLabelFiveSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelFiveSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelFiveSub.setBounds(9, 299, 390, 30);
		panel.add(playerNameLabelFiveSub);

		JLabel playerScoreLabelFive = new JLabel("{score}");
		playerScoreLabelFive.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelFive.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelFive.setBounds(400, 297, 390, 30);
		panel.add(playerScoreLabelFive);

		JLabel playerScoreLabelFiveSub = new JLabel("{score}");
		playerScoreLabelFiveSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelFiveSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelFiveSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelFiveSub.setBounds(399, 299, 390, 30);
		panel.add(playerScoreLabelFiveSub);

		JLabel playerNameLabelSix = new JLabel("{name}");
		playerNameLabelSix.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelSix.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelSix.setBounds(10, 338, 390, 30);
		panel.add(playerNameLabelSix);

		JLabel playerNameLabelSixSub = new JLabel("{name}");
		playerNameLabelSixSub.setForeground(new Color(255, 255, 255));
		playerNameLabelSixSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelSixSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelSixSub.setBounds(9, 340, 390, 30);
		panel.add(playerNameLabelSixSub);

		JLabel playerScoreLabelSix = new JLabel("{score}");
		playerScoreLabelSix.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelSix.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelSix.setBounds(400, 338, 390, 30);
		panel.add(playerScoreLabelSix);

		JLabel playerScoreLabelSixSub = new JLabel("{score}");
		playerScoreLabelSixSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelSixSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelSixSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelSixSub.setBounds(399, 340, 390, 30);
		panel.add(playerScoreLabelSixSub);

		JLabel playerNameLabelSeven = new JLabel("{name}");
		playerNameLabelSeven.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelSeven.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelSeven.setBounds(10, 379, 390, 30);
		panel.add(playerNameLabelSeven);

		JLabel playerNameLabelSevenSub = new JLabel("{name}");
		playerNameLabelSevenSub.setForeground(new Color(255, 255, 255));
		playerNameLabelSevenSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelSevenSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelSevenSub.setBounds(9, 381, 390, 30);
		panel.add(playerNameLabelSevenSub);

		JLabel playerScoreLabelSeven = new JLabel("{score}");
		playerScoreLabelSeven.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelSeven.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelSeven.setBounds(400, 379, 390, 30);
		panel.add(playerScoreLabelSeven);

		JLabel playerScoreLabelSevenSub = new JLabel("{score}");
		playerScoreLabelSevenSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelSevenSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelSevenSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelSevenSub.setBounds(399, 381, 390, 30);
		panel.add(playerScoreLabelSevenSub);

		JLabel playerNameLabelEight = new JLabel("{name}");
		playerNameLabelEight.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelEight.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelEight.setBounds(10, 420, 390, 30);
		panel.add(playerNameLabelEight);

		JLabel playerNameLabelEightSub = new JLabel("{name}");
		playerNameLabelEightSub.setForeground(new Color(255, 255, 255));
		playerNameLabelEightSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelEightSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelEightSub.setBounds(9, 422, 390, 30);
		panel.add(playerNameLabelEightSub);

		JLabel playerScoreLabelEight = new JLabel("{score}");
		playerScoreLabelEight.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelEight.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelEight.setBounds(400, 420, 390, 30);
		panel.add(playerScoreLabelEight);

		JLabel playerScoreLabelEightSub = new JLabel("{score}");
		playerScoreLabelEightSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelEightSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelEightSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelEightSub.setBounds(399, 422, 390, 30);
		panel.add(playerScoreLabelEightSub);

		JLabel playerNameLabelNine = new JLabel("{name}");
		playerNameLabelNine.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelNine.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelNine.setBounds(10, 461, 390, 30);
		panel.add(playerNameLabelNine);

		JLabel playerNameLabelNineSub = new JLabel("{name}");
		playerNameLabelNineSub.setForeground(new Color(255, 255, 255));
		playerNameLabelNineSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelNineSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelNineSub.setBounds(9, 463, 390, 30);
		panel.add(playerNameLabelNineSub);

		JLabel playerScoreLabelNine = new JLabel("{score}");
		playerScoreLabelNine.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelNine.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelNine.setBounds(400, 461, 390, 30);
		panel.add(playerScoreLabelNine);

		JLabel playerScoreLabelNineSub = new JLabel("{score}");
		playerScoreLabelNineSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelNineSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelNineSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelNineSub.setBounds(399, 463, 390, 30);
		panel.add(playerScoreLabelNineSub);

		JLabel playerNameLabelTen = new JLabel("{name}");
		playerNameLabelTen.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelTen.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelTen.setBounds(10, 502, 390, 30);
		panel.add(playerNameLabelTen);

		JLabel playerNameLabelTenSub = new JLabel("{name}");
		playerNameLabelTenSub.setForeground(new Color(255, 255, 255));
		playerNameLabelTenSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameLabelTenSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerNameLabelTenSub.setBounds(9, 504, 390, 30);
		panel.add(playerNameLabelTenSub);

		JLabel playerScoreLabelTen = new JLabel("{score}");
		playerScoreLabelTen.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelTen.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelTen.setBounds(400, 502, 390, 30);
		panel.add(playerScoreLabelTen);

		JLabel playerScoreLabelTenSub = new JLabel("{score}");
		playerScoreLabelTenSub.setForeground(new Color(255, 255, 255));
		playerScoreLabelTenSub.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabelTenSub.setFont(new Font("MingLiU-ExtB", Font.BOLD, 24));
		playerScoreLabelTenSub.setBounds(399, 504, 390, 30);
		panel.add(playerScoreLabelTenSub);

		Util.setBackground(panel);

	}
}
