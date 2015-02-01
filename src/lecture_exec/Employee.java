package lecture_exec;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private int salary;
	private int phoneNum;
	
	public Employee(String firstName, String lastName, String age, String salary, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = Integer.parseInt(age);
		this.salary = Integer.parseInt(salary);
		this.phoneNum = Integer.parseInt(phoneNum);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	

	
}
