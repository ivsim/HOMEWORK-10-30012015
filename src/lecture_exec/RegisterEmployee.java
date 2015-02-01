package lecture_exec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RegisterEmployee extends JFrame {

	private JTextField firstName;
	private JTextField lastName;
	private JLabel label_1;
	private JTextField age;
	private JTextField salary;
	private JLabel label_3;
	private JTextField phoneNum;
	
	public JButton okRegisterEmployee;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterEmployee frame = new RegisterEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Employee getEmployee() {
		Employee employee = new Employee(this.firstName.getText(), this.lastName.getText(), 
				this.age.getText(), this.salary.getText(), this.phoneNum.getText());
		return employee;
	}
	
	
	/**
	 * Create the application.
	 */
	public RegisterEmployee() {
		getContentPane().setBackground(Color.WHITE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("       ВЪВЕЖДАНЕ НА СЛУЖИТЕЛИ");
		setBounds(100, 100, 458, 348);
		getContentPane().setLayout(null);
		
		this.okRegisterEmployee = new JButton("OK");
		okRegisterEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		okRegisterEmployee.setBounds(301, 263, 121, 25);
		getContentPane().add(okRegisterEmployee);
		
		firstName = new JTextField();
		firstName.setBounds(28, 52, 394, 19);
		getContentPane().add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(28, 102, 394, 19);
		getContentPane().add(lastName);
		
		JLabel label = new JLabel("име:");
		label.setBounds(28, 32, 70, 15);
		getContentPane().add(label);
		
		label_1 = new JLabel("фамилия:");
		label_1.setBounds(28, 81, 70, 15);
		getContentPane().add(label_1);
		
		age = new JTextField();
		age.setBounds(28, 169, 114, 19);
		getContentPane().add(age);
		age.setColumns(10);
		
		salary = new JTextField();
		salary.setBounds(273, 169, 149, 19);
		getContentPane().add(salary);
		salary.setColumns(10);
		
		JLabel label_2 = new JLabel("възраст:");
		label_2.setBounds(28, 149, 70, 15);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("възнаграждение:");
		label_3.setBounds(284, 149, 138, 15);
		getContentPane().add(label_3);
		
		phoneNum = new JTextField();
		phoneNum.setBounds(29, 219, 114, 19);
		getContentPane().add(phoneNum);
		phoneNum.setColumns(10);
		
		JLabel label_4 = new JLabel("телефон:");
		label_4.setBounds(28, 200, 70, 15);
		getContentPane().add(label_4);
	}
}
