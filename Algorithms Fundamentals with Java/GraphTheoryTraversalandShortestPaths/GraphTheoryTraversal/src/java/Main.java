package java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); 
    	int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
        	String nextLine = scanner.nextLine();
			if (nextLine.trim().isEmpty()) {
				graph.add(new ArrayList<>());
			} else {
				
        	List<Integer> nextNodes =Arrays.stream(nextLine.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        	graph.add(nextNodes);
			}
        }
        
        List<Deque<Integer>> components = getConnectedComponents(graph);

    }

    public static List<Deque<Integer>> getConnectedComponents(List<List<Integer>> graph) {
    	boolean[] visited = new boolean[graph.size()];
    	List<Deque<Integer>> components = new ArrayList<>();
		for (int start = 0; start < graph.size(); start++) {
			if (!visited[start]) {
				Deque<Integer> component = new ArrayDeque<>();
				dfs(start, graph.get(start), components, graph, visited);
				components.add(component);
			}
		}
    	return components;
    }

	private static void dfs(int node, List<Integer> list, List<Deque<Integer>> components, List<List<Integer>> graph, boolean[] visited) {
		if(!visited[node]) {
			visited[node] = true;
			for(int child : graph.get(node)) {
                dfs(child, graph.get(child), components, graph, visited);
            }
			System.out.println(node + " ");
		}
        			
	}

	public static Collection<String> topSort(Map<String, List<String>> graph) {
        throw new AssertionError("Not Implemented");
    }
}