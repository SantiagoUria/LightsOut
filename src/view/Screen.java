package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Screen extends JFrame {

	private JPanel contentPane;
	private static Color _black = new Color(0, 0, 0);
	private static Color _white = new Color(255, 255, 255);
	private static int tries = 0;
	private static int _x_axis = 200;
	private static int _y_axis = 150;

	private static void _add_x(int pixels) {
		_x_axis += pixels;
	}

	private static void _add_y(int pixels) {
		_y_axis += pixels;
	}

	private static void _reset_x_position() {
		_x_axis = 200;
	}

	private static void _reset_y_position() {
		_x_axis = 200;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void switchTile(JButton buttons) {
		if (buttons.getBackground().equals(_black)) {
			buttons.setBackground(_white);
		} else {
			buttons.setBackground(_black);
		}
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("LIGHTS OUT!");
		lblNewLabel.setBounds(10, 11, 764, 40);
		contentPane.add(lblNewLabel);

		JButton[][] buttons = new JButton[4][4];
		for (int i = 0; i < buttons.length; i++) {
			_reset_x_position();
			for (int j = 0; j < buttons.length; j++) {
				_add_x(70);
				int value_i = i;
				int value_j = j;
				buttons[i][j] = new JButton();
				buttons[i][j].setBounds(_x_axis, _y_axis, 55, 55);
				buttons[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						switchTile(buttons[value_i][value_j]);
					}
				});
				contentPane.add(buttons[i][j]);
			}
			_add_y(70);
		}
	}
}
