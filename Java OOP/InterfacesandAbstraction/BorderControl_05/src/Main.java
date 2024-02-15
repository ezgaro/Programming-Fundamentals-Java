import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		List<Indentifyable> identifiables = new ArrayList<>();
		while (!line.equalsIgnoreCase("end")) {
			String[] tokens = line.split("\\s+");
			Indentifyable identifiable;
			if (tokens.length == 2) {
				identifiable = new Robot(tokens[0], tokens[1]);
			} else {
				identifiable = new Cityzen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
			}
			identifiables.add(identifiable);
			line = scanner.nextLine();
		}

		String fakeId = scanner.nextLine();
		identifiables.stream().filter(i -> i.getId().endsWith(fakeId)).forEach(i -> System.out.println(i.getId()));

	}
}
