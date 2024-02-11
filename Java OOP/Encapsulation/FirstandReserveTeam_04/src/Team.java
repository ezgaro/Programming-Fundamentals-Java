import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
	
	private String name;
	private List<Person> firstTeam;
	private List<Person> reservedTeam;
	
	public Team(String name) {
		setName(name);
		this.firstTeam = new ArrayList<>();
		this.reservedTeam = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public List<Person> getFirstTeam() {
		return Collections.unmodifiableList(firstTeam);
	}
	
	public List<Person> getReservedTeam() {
		return Collections.unmodifiableList(reservedTeam);
	}
	
	public void addPlayer(Person person) {
		if(person.getAge() < 40) {
			firstTeam.add(person);
		} else {
			reservedTeam.add(person);
		}
	}
	
}
