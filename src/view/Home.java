package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private JPanel panel;

	public Home() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		panel.setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 11, 800, 600);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel welcomeLabel = new JLabel("Lights Out!");
		welcomeLabel.setBackground(new Color(255, 255, 255));
		welcomeLabel.setFont(new Font("MingLiU-ExtB", Font.BOLD, 35));
		welcomeLabel.setBounds(279, 102, 220, 77);
		panel.add(welcomeLabel);

		JButton playButton = new JButton("Play!");
		playButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		playButton.setBounds(322, 304, 120, 55);
		panel.add(playButton);

		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playButtonActionPerformance();
			}

		});

		JLabel welcomeLabel_1 = new JLabel("Lights Out!");
		welcomeLabel_1.setForeground(new Color(255, 255, 255));
		welcomeLabel_1.setFont(new Font("MingLiU-ExtB", Font.BOLD, 35));
		welcomeLabel_1.setBounds(278, 104, 220, 77);
		panel.add(welcomeLabel_1);

		setBackground();
	}

	private void setBackground() {
		JLabel background;

		background = new JLabel("",
				new ImageIcon("C:\\Users\\Santi\\eclipse-workspace\\LightsOut2\\src\\view\\background.jpg"),
				SwingConstants.TRAILING);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		background.setBounds(10, 11, 764, 539);
		panel.add(background);

	}

	private void playButtonActionPerformance() {
		LevelSelector selection = new LevelSelector();
		selection.setSize(800, 600);
		selection.setLocation(0, 0);
		panel.removeAll();
		panel.add(selection, CENTER_ALIGNMENT);
		panel.revalidate();
		panel.repaint();

	}
}
