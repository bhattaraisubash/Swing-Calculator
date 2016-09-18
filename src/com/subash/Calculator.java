package com.subash;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Subash Bhattarai
 * @version 1.0
 *
 */
public class Calculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	double a = 0, b = 0, result = 0;
	int operator = 0;
	private JPanel panel;
	private JLabel label;
	private JTextField tf;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, mult, div, eq, pers, point,
			c, del;

	Calculator() {
		setSize(380, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocation(450, 100);

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		add(panel);

		label = new JLabel("Welcome to Subash's Calculator");
		label.setForeground(Color.BLUE);
		label.setBounds(95, 5, 300, 30);
		panel.add(label);

		tf = new JTextField();
		tf.setBounds(45, 30, 300, 50);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(tf);

		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		pers = new JButton("%");
		eq = new JButton("=");
		point = new JButton(".");
		c = new JButton("C");
		del = new JButton(new ImageIcon("C:/Users/dell/Desktop/myIcons/back.jpg"));

		seven.setBounds(20, 100, 60, 60);
		eight.setBounds(90, 100, 60, 60);
		nine.setBounds(160, 100, 60, 60);
		four.setBounds(20, 180, 60, 60);
		five.setBounds(90, 180, 60, 60);
		six.setBounds(160, 180, 60, 60);
		one.setBounds(20, 260, 60, 60);
		two.setBounds(90, 260, 60, 60);
		three.setBounds(160, 260, 60, 60);
		point.setBounds(20, 330, 60, 60);
		zero.setBounds(90, 330, 60, 60);
		pers.setBounds(160, 330, 60, 60);
		plus.setBounds(230, 100, 60, 60);
		minus.setBounds(230, 180, 60, 60);
		mult.setBounds(230, 260, 60, 60);
		div.setBounds(230, 330, 60, 60);
		c.setBounds(300, 100, 60, 80);
		del.setBounds(300, 190, 66, 68);
		eq.setBounds(300, 270, 70, 100);

		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(point);
		panel.add(zero);
		panel.add(pers);
		panel.add(plus);
		panel.add(minus);
		panel.add(mult);
		panel.add(div);
		panel.add(c);
		panel.add(del);
		panel.add(eq);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		point.addActionListener(this);
		pers.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		c.addActionListener(this);
		del.addActionListener(this);
		eq.addActionListener(this);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == one) {
				tf.setText(tf.getText().concat("1"));

			}
			if (e.getSource() == two) {
				tf.setText(tf.getText().concat("2"));

			}
			if (e.getSource() == three) {
				tf.setText(tf.getText().concat("3"));

			}
			if (e.getSource() == four) {
				tf.setText(tf.getText().concat("4"));

			}
			if (e.getSource() == five) {
				tf.setText(tf.getText().concat("5"));

			}
			if (e.getSource() == six) {
				tf.setText(tf.getText().concat("6"));

			}
			if (e.getSource() == seven) {
				tf.setText(tf.getText().concat("7"));

			}
			if (e.getSource() == eight) {
				tf.setText(tf.getText().concat("8"));

			}
			if (e.getSource() == nine) {
				tf.setText(tf.getText().concat("9"));

			}
			if (e.getSource() == zero) {
				tf.setText(tf.getText().concat("0"));

			}
			if (e.getSource() == point) {
				tf.setText(tf.getText().concat("."));

			}
			if (e.getSource() == plus) {
				a = Double.parseDouble(tf.getText());
				operator = 1;
				tf.setText("");
			}
			if (e.getSource() == minus) {
				a = Double.parseDouble(tf.getText());
				operator = 2;
				tf.setText("");
			}
			if (e.getSource() == mult) {
				a = Double.parseDouble(tf.getText());
				operator = 3;
				tf.setText("");
			}
			if (e.getSource() == div) {
				a = Double.parseDouble(tf.getText());
				operator = 4;
				tf.setText("");
			}
			if (e.getSource() == pers) {
				a = Double.parseDouble(tf.getText());
				operator = 5;
				tf.setText("");
			}
			if (e.getSource() == eq) {
				b = Double.parseDouble(tf.getText());
				switch (operator) {
				case 1:
					result = a + b;
					break;
				case 2:
					result = a - b;
					break;
				case 3:
					result = a * b;
					break;
				case 4:
					result = a / b;
					break;
				case 5:
					result = a * b / 100;
					break;
				default:
					result = 0;
				}
				tf.setText("" + result);
			}
			if (e.getSource() == c) {
				tf.setText("");
			}
			if (e.getSource() == del) {
				String rem = tf.getText();
				tf.setText("");
				for (int i = 0; i < rem.length() - 1; i++) {
					tf.setText(tf.getText() + rem.charAt(i));
				}
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Invalid key" + ex.getStackTrace(), "Invalid", 1);
		}

	}

	public static void main(String[] args) {
		new Calculator();
	}
}
