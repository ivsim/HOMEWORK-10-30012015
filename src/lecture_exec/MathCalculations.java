package lecture_exec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MathCalculations {

	private JFrame frmCalaculator;
	private JTextField firstNum;
	private JTextField secondNum;
	private JButton button_2;
	private JButton button_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathCalculations window = new MathCalculations();
					window.frmCalaculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void calcSum(String a, String b) {
		float firstNum = Float.parseFloat(a);
		float secondNum = Float.parseFloat(b);
		
		float sum = firstNum + secondNum;
		
		JOptionPane.showMessageDialog(null, sum);
		
	}
	
	public void calcSub(String a, String b) {
		float firstNum = Float.parseFloat(a);
		float secondNum = Float.parseFloat(b);
		
		float sub = firstNum - secondNum;
		
		JOptionPane.showMessageDialog(null, sub);
		
	}
	
	public void calcMultiply(String a, String b) {
		float firstNum = Float.parseFloat(a);
		float secondNum = Float.parseFloat(b);
		
		float multiply = firstNum * secondNum;
		
		JOptionPane.showMessageDialog(null, multiply);
		
	}
	
	public void calcDiv(String a, String b) {
		float firstNum = Float.parseFloat(a);
		float secondNum = Float.parseFloat(b);
		
		float division = firstNum / secondNum;
		
		JOptionPane.showMessageDialog(null, division);
		
	}
	
	/**
	 * Create the application.
	 */
	public MathCalculations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalaculator = new JFrame();
		frmCalaculator.setTitle("CALCULATOR");
		frmCalaculator.setBounds(100, 100, 450, 300);
		frmCalaculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalaculator.getContentPane().setLayout(null);
		
		firstNum = new JTextField();
		firstNum.setBounds(73, 91, 114, 19);
		frmCalaculator.getContentPane().add(firstNum);
		firstNum.setColumns(10);
		
		secondNum = new JTextField();
		secondNum.setBounds(260, 91, 114, 19);
		frmCalaculator.getContentPane().add(secondNum);
		secondNum.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcSum(firstNum.getText(), secondNum.getText());
			}
		});
		button.setBounds(72, 173, 117, 25);
		frmCalaculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcSub(firstNum.getText(), secondNum.getText());
			}
		});
		button_1.setBounds(261, 173, 117, 25);
		frmCalaculator.getContentPane().add(button_1);
		
		button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMultiply(firstNum.getText(), secondNum.getText());
			}
		});
		button_2.setBounds(73, 220, 117, 25);
		frmCalaculator.getContentPane().add(button_2);
		
		button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcDiv(firstNum.getText(), secondNum.getText());
			}
		});
		button_3.setBounds(262, 220, 117, 25);
		frmCalaculator.getContentPane().add(button_3);
	}
}
