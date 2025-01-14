package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CyclesInGraph_03 {

	public static Map<Integer, List<Integer>> graph = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String source = null;
		
		String line = scanner.nextLine();
		while (!line.equals("End")) {
			String[] tokens = line.split(" ");
			if (source == null) {
				source = tokens[0];
			}
			
			graph.putIfAbsent(Integer.parseInt(tokens[0]), List.of(Integer.parseInt(tokens[1])));
			
			
			line = scanner.nextLine();
		}
		
		Set<String> visited = new HashSet<>();
		Set<String> cycles = new HashSet<>();
		
		try {
			dfs(source, visited, cycles);			
		} catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
		}

	}

	private static void dfs(String source, Set<String> visited, Set<String> cycles) {
		if (visited.contains(source)) {
			return;
		}
		if (cycles.contains(source)) {
			throw new IllegalArgumentException("Acyclic: No");
		}
		cycles.add(source);
		visited.add(source);
		
		graph.get(source).forEach(node -> dfs(String.valueOf(node), visited, cycles));
		cycles.remove(source);
	}
}
