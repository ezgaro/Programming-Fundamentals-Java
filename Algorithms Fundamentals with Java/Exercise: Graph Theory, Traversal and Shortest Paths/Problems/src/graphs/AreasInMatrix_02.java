package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AreasInMatrix_02 {
	
	
	public static class Edge {
		int[] source;
		int[] destination;

		public Edge(int sRow, int sCol) {
			this.source = new int[] {sRow, sCol};
		}

		public void setDestination(int dRow, int dCol) {
            this.destination = new int[] {dRow, dCol};
	}
	}
	
	public static List<Edge> graph = new ArrayList<>();
	public static boolean[][] visited;
	public static boolean[] visitedNode;
	public static char[][] matrix;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rows = Integer.parseInt(scanner.nextLine());
		
		matrix = new char[rows][];
		visited = new boolean[rows][];
		
		for (int i = 0; i < rows; i++) {
			matrix[i] = scanner.nextLine().toCharArray();
			visited[i] = new boolean[matrix[i].length];
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(!visited[i][j])
				dfs(i,j, matrix[i][j]);				
			}
		}
		
		visitedNode = new boolean[graph.size()];
		
		Map<Character, Integer> areas = new TreeMap<>();
		
		for (int i = 0; i < graph.size(); i++) {
			if (!visitedNode[i]) {
				areas.putIfAbsent(matrix[graph.get(i).source[0]][graph.get(i).source[1]], 0);
				areas.put(matrix[graph.get(i).source[0]][graph.get(i).source[1]], areas.get(matrix[graph.get(i).source[0]][graph.get(i).source[1]]) + 1);
				
				bfs(i);
			}
			
			System.out.println("Areas: " + areas.values().stream().mapToInt(Integer::intValue).sum());
			areas.forEach((k,v) -> System.out.printf("Letter '%c' -> %d%n", k, v));
		}
	}

	private static void bfs(int source) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(source);
        
        visitedNode[source] = true;
        while(!queue.isEmpty()) {
        	int node = queue.poll();
        	Edge edge = graph.get(node);
        	if(edge.destination != null) {
        		visitedNode[node + 1] = true;
        		queue.offer(node + 1);        		
        	}
        	
        }
	}

	private static void dfs(int row, int col, char symbol) {
		
		visited[row][col] = true;
		
		
		Edge edge = new Edge(row, col);
		graph.add(edge);
		
		if (isInBounds(row, col + 1) && !visited[row][col + 1] && matrix[row][col + 1] == symbol) {
			graph.get(graph.size() - 1).setDestination(row, col + 1);
			dfs(row, col + 1, symbol);
		}
		if (isInBounds(row, col - 1) && !visited[row][col - 1] && matrix[row][col - 1] == symbol) {
			graph.get(graph.size() - 1).setDestination(row, col - 1);
			dfs(row, col - 1, symbol);
		}
		if (isInBounds(row + 1, col) && !visited[row + 1][col] && matrix[row + 1][col] == symbol) {
			graph.get(graph.size() - 1).setDestination(row + 1, col);
			dfs(row + 1, col, symbol);
		}
		if (isInBounds(row - 1, col) && !visited[row - 1][col] && matrix[row - 1][col] == symbol) {
			graph.get(graph.size() - 1).setDestination(row - 1, col);
			dfs(row - 1, col, symbol);
		}
	}

	private static boolean isInBounds(int i, int col) {
		return false;
	}
}
