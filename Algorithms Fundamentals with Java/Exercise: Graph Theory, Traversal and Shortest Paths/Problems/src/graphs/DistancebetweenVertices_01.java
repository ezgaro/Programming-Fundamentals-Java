package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DistancebetweenVertices_01 {
	
	public static int[][] graph;
	public static Map<Integer, Integer> indexMapper = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nodes = Integer.parseInt(scanner.nextLine());
		int pairs = Integer.parseInt(scanner.nextLine());
		
		graph = new int[nodes + 1][];
		
		for(int i = 1; i <= nodes; i++) {
			String[] edges = scanner.nextLine().split(" ");
			indexMapper.put(Integer.parseInt(edges[0]), i);
			if(edges.length == 1) {
                graph[i] = new int[0];
            } else {            	
            	graph[i] = Arrays.stream(edges[1].split(" ")).mapToInt(Integer::parseInt).toArray();
            }
		}
		
		while (pairs-- > 0) {
			int[] relations = Arrays.stream(scanner.nextLine().split("-")).mapToInt(Integer::parseInt).toArray();
			int source = relations[0];
			int destination = relations[1];
			System.out.printf("%d, %d -> ", source, destination);
			
			int[] prev = new int[graph.length];
			
			Arrays.fill(prev, -1);
			bfs(graph ,indexMapper.get(source), indexMapper.get(destination), prev);
			
			
			List<Integer> path = new ArrayList<>();
			int parent = prev[destination];
			while (parent != -1) {
				path.add(parent);
				parent = prev[parent];
			}
			
			int size = path.isEmpty() ? -1 : path.size();
		}
	}

	private static void bfs(int[][] graph2, int source, int destination, int[] path) {
        Deque<Integer> queue = new ArrayDeque<>();
        
        queue.offer(source);
        boolean[] visited = new boolean[graph.length + 1];
        while(queue.isEmpty()) {
        	Integer node = queue.poll();
        	visited[node] = true;
        	visited[source] = true;
			if(node == destination) {
				return;
			}
        	
		    for(int i = 0; i < graph[node].length; i++) {
		    	int child = indexMapper.get(graph[node][i]);
				if (!visited[child]) {
					path[child] = node;
					visited[child] = true;
					queue.offer(child);
				}
		    }
        }
        path[source] = 0;
	}
}
