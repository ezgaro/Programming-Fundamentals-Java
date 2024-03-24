import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindAllPathsInaLabirinth_05 {
	
	static List<Character> path = new ArrayList<Character>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rows = Integer.parseInt(scanner.nextLine());
		int cols = Integer.parseInt(scanner.nextLine());
		
		
		char[][] labirynth = new char[rows][cols];
		
		for(int row = 0 ;row < rows; row++) {
			labirynth[row] = scanner.nextLine().toCharArray();
		}
		
		findPath(labirynth, 0, 0, ' ');
		
	}

	private static void findPath(char[][] labirynth, int row, int col, char direction) {
		if(!isInBounds(labirynth, row, col) || labirynth[row][col] == 'V' || labirynth[row][col] == '*') {
			return;
		}
		
		path.add(direction);
		
		if(labirynth[row][col] == 'e') {
			printPath();
			path.remove(path.size() - 1); 
			return;
		}
		
		labirynth[row][col] = 'V'; // visited
		findPath(labirynth, row - 1, col, 'U'); //up
		findPath(labirynth, row + 1, col, 'D'); //down
		findPath(labirynth, row, col - 1, 'L'); //left
		findPath(labirynth, row, col + 1, 'R'); // right
		labirynth[row][col] = '-';
		
		path.remove(path.size() - 1);
	}

	private static void printPath() {
		for (int i = 1; i < path.size(); i++) {
			System.out.print(path.get(i));
		}
		System.out.println();
	}

	private static boolean isInBounds(char[][] labirynth, int row, int col) {
		return row < labirynth.length && row >= 0 && col < labirynth[row].length && col >= 0;
	}
}
