public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public void setFirstName(String firstName) throws Exception {
		if(lastName.length() < 3) {
			throw new Exception("Name is too short");
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) throws Exception{
		if(lastName.length() < 3) {
			throw new Exception("Name is too short");
		}
		this.lastName = lastName;
	}

	public void setAge(int age) throws Exception{
		if(age <= 0) {
			throw new Exception("Age is not valid");
		}
		this.age = age;
	}

	public void setSalary(double salary) throws Exception{
		if(salary < 460.0) {
			throw new Exception("Salary is not valid");
		}
		this.salary = salary;
	}

	public Person(String firstName, String lastName, int age, double salary) throws Exception {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setSalary(salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}
	

	public String getLastName() {
		return lastName;
	}
	
	public void increaseSalary(double bonus) {
		if(age < 30) {
			bonus /= 2;	
		}
		
		salary = salary * (1 + (bonus / 100));
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return String.format("%s %s gets %.2f leva", this.getFirstName(), this.getLastName(), salary);
	}
}
