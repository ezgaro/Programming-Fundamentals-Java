public class Animal {
	private String name;
	private int age;
	private String gender;

	public Animal(String name, int age, String gender) {
		setName(name);
		setAge(age);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isBlank() && name.isEmpty()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (name.isBlank() && name.isEmpty()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "";
	}

	public String produceSound() {
		return String.format("%s\n" + "%s %d %s\n" + "%s", this.getClass().getSimpleName(), this.name, this.age,
				this.gender, this.produceSound());
	}

}
