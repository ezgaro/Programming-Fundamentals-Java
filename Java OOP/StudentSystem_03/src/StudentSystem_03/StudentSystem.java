package StudentSystem_03;

public class StudentSystem {
	private StudentRepository studentRepository;
	private boolean running ;

	public StudentSystem() {
		this.studentRepository = new StudentRepository();
		this.running = true;
	}
	public void parseCommand(String[] args) {
		String command = args[0];
		
		if (command.equals("Create")) {
			String name = args[1];
			int age = Integer.parseInt(args[2]);
			double grade = Double.parseDouble(args[3]);
			Student  student = new Student(name, age, grade);
			studentRepository.create(student);
		} else if (command.equals("Show")) {
			String name = args[1];
			Student student = studentRepository.get(name);
			if (student != null) {
				System.out.println(student);
			}
		} else {
			running = false;
		}
	}
	
	public boolean isRunning() {
		return running;
	}
}