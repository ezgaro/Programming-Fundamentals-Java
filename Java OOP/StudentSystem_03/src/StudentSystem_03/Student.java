package StudentSystem_03;

public class Student {
	private final String name;
	private final int age;
	private final double grade;

	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return String.format("%s is %s years old.", name, age) + getGradeCommentary();
	}

	private String getGradeCommentary() {
		if (grade >= 5.00) {
			return " Excellent student.";
		} else if (grade < 5.00 && grade >= 3.50) {
			return " Average student.";
		} else {
			return " Very nice person.";
		}
	}
}
