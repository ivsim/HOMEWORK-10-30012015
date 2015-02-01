package lecture_exec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.util.ArrayList;

public class EmployeeApp {

	private JFrame frame;
	public static ArrayList<Employee> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeApp window = new EmployeeApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void newEmployeeRegister() {
		RegisterEmployee employeeWindow = new RegisterEmployee();
		employeeWindow.setVisible(true);
		
		employeeWindow.okRegisterEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee currentWindowEmployee = employeeWindow.getEmployee();
				employeeWindow.setVisible(false);
				
				
				JOptionPane.showMessageDialog(null, "Вие въведохте: " + currentWindowEmployee.getFirstName() + " " +
						currentWindowEmployee.getLastName() + ",\n" + currentWindowEmployee.getAge() + " години, " +
						currentWindowEmployee.getSalary() + " лв.\n" + currentWindowEmployee.getPhoneNum());
				list.add(currentWindowEmployee);
				
			}
		});
	}
	
	public void calculate() {
		
		int salary = 0;// let's avoid the BigInteger for now...
		String minAgeName = list.get(0).getFirstName() + " " + list.get(0).getLastName();;
		String maxAgeName = minAgeName;
		int minAge = list.get(0).getAge();
		int maxAge = minAge;
		int numberOfWorkers = list.size();
		
		for (int i = 0; i < list.size(); i++) {
			int employeeAge = list.get(i).getAge();
			String employeeName = list.get(i).getFirstName() + " " + list.get(i).getLastName();
			int salaryEmployee = list.get(i).getSalary();
			
			if (employeeAge < minAge) {
				minAge = employeeAge;
				minAgeName = employeeName;
			}
			
			if (employeeAge > maxAge) {
				maxAge = employeeAge;
				maxAgeName = employeeName;
			}
			
			salary = salary + salaryEmployee;
		}
		
		float averageSalary = (float)salary / numberOfWorkers;
		
		
		JOptionPane.showMessageDialog(null, "средна заплата: " + averageSalary + 
										"\nнай-млад служител: " + minAgeName +
										"\nнай-възрастен служител: " + maxAgeName);
	}

	/**
	 * Create the application.
	 */
	public EmployeeApp() {
		initialize();
		this.list = new ArrayList<Employee>();// for the time being no permanent storage of current employees...
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("       УПРАВЛЕНИЕ НА СЛУЖИТЕЛИ");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 426, 124);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel companyName = new JLabel("ФИРМА КОМПАНИЯ");
		companyName.setHorizontalAlignment(SwingConstants.CENTER);
		companyName.setBounds(122, 26, 200, 25);
		frame.getContentPane().add(companyName);
		
		JButton addEmployee = new JButton("добави СЛУЖИТЕЛ");
		addEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newEmployeeRegister();
			}
		});
		addEmployee.setBounds(12, 66, 194, 25);
		frame.getContentPane().add(addEmployee);
		
		JButton generateReport = new JButton("изчисли");
		generateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		generateReport.setBounds(218, 66, 194, 25);
		frame.getContentPane().add(generateReport);
	}
}
