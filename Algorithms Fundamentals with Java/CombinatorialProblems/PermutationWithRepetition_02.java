import java.util.HashSet;

public class PermutationWithRepetition_02 {
	private static String[] elements = new String[] {"A", "B", "B"};
	private static String[] permutes = new String[elements.length];
	
	public static void main(String[] args) {
		permute(0);
	}

	private static void permute(int index) {
		if(index >= elements.length) {
			System.out.println(String.join(" ", elements));
			return;
		}
		permute(index + 1);
		HashSet<String> swapped = new HashSet<>();
		swapped.add(elements[index]);
		
		for (int i = index + 1; i < elements.length; i++) {
			if (!swapped.contains(elements[i])) {
				swap(elements, index, i);
				permute(index + 1);
				swap(elements, index, i);
				swapped.add(elements[i]);
			}
		}
	}

	private static void swap(String[] elements2, int index, int i) {
		String temp = elements2[index];
		elements2[index] = elements2[i];
		elements2[i] = temp;
	}
}
