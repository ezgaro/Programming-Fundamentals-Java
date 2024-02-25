import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	private static class InvalidNumberException extends RuntimeException {
		public InvalidNumberException(String message) {
			super(message);
		}
		
		public InvalidNumberException(String message, Exception cause) {
			super(message, cause);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<>();
		while(numbers.size() != 10) {
			try {
				readNumbers(numbers, scanner.nextLine());				
			} catch (InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
		
	}

	private static void readNumbers(List<Integer> numbers, String input) {
		int number = -1;
		try {
			number = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new InvalidNumberException("Invalid Number!" , e);
		}
		
		int start = numbers.isEmpty() ? 1 : numbers.get(numbers.size() - 1);
		int end = 100;
		
		if (number < start || number > end) {
			throw new InvalidNumberException(String.format("Your number is not in range (%d - 100)", start, end));
		}
		
		numbers.add(number);
	}
}
