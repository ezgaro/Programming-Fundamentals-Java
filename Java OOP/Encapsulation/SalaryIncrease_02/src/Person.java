public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Person(String firstName, String lastName, int age, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
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
