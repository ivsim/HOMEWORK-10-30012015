package lecture_exec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nok {

	private JFrame frame;
	private JTextField firstEnter;
	private JTextField secondEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nok window = new Nok();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int calculateNok (String a, String b) {
		
		int firstEnter = Integer.parseInt(a);
		int secondEnter = Integer.parseInt(b);
		int multiplication = firstEnter*secondEnter;
		double sqrRoot = Math.sqrt(multiplication);
		int scDenom = (int)sqrRoot;
		
		for (int i = 6; i <= multiplication; i++) {
			if (i % firstEnter == 0 && i % secondEnter == 0) {
				scDenom = i;
				break;
			}
		}
		
		return scDenom;
	}
	
	/**
	 * Create the application.
	 */
	public Nok() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstEnter = new JTextField();
		firstEnter.setBounds(66, 69, 124, 19);
		frame.getContentPane().add(firstEnter);
		firstEnter.setColumns(10);
		
		secondEnter = new JTextField();
		secondEnter.setBounds(256, 69, 124, 19);
		frame.getContentPane().add(secondEnter);
		secondEnter.setColumns(10);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, 
						calculateNok(firstEnter.getText(), secondEnter.getText()));
			}
		});
		btnCalculate.setBounds(163, 182, 116, 25);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblNewLabel = new JLabel("integer");
		lblNewLabel.setBounds(66, 42, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("integer");
		label.setBounds(256, 42, 70, 15);
		frame.getContentPane().add(label);
	}
}
