import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader reader = new BufferedReader(new

		InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		
		Team team = new Team("Black Eagles");


		for (int i = 0; i < n; i++) {

			String[] input = reader.readLine().split(" ");
			team.addPlayer(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
		}
		
		System.out.println("First team have " + team.getFirstTeam().size() + " players");
		System.out.println("Reserve team have " + team.getReservedTeam().size() + " players");
	}

}
