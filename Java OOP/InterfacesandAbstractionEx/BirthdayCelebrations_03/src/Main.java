import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		List<Birthable> birthableList = new ArrayList<>();

		while (!"End".equals(input)) {
			String[] tokens = input.split("\\s+");
			String object = tokens[0];
			switch (object) {
			case "Citizen":
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]);
				String id = tokens[3];
				String birthDate = tokens[4];

				Citizen citizen = new Citizen(name, age, id, birthDate);
				birthableList.add(citizen);
				break;
			case "Pet":
				name = tokens[1];
				birthDate = tokens[2];

				Pet pet = new Pet(name, birthDate);
				birthableList.add(pet);
				break;
			}
			input = scanner.nextLine();
		}
		
		String year = scanner.nextLine();
		
		birthableList.stream().filter(birthable -> birthable.getBirthDate().endsWith(year))
		.map(Birthable::getBirthDate)
		.forEach(System.out::println);
	}
}
