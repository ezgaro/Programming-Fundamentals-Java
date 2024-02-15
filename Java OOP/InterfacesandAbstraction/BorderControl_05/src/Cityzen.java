public class Cityzen implements Indentifyable{
	private String name;
	private int age;
	private String id;
	
	public Cityzen(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
