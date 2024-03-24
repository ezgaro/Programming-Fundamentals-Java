public class PermutationswithoutRepetitions_01 {
	private static String[] elements = new String[] {"A", "B", "C"};
	private static String[] permutes = new String[elements.length];
	
	public static void main(String[] args) {
		permute(0);
	}

	private static void permute(int index) {
		if(index >= elements.length) {
			print();
			return;
		}
		
		for (int i = 0; i < elements.length; i++) {
			if (permutes[i] == null) {
				permutes[i] = elements[index];
				permute(index + 1);
				permutes[i] = null;
			}
		}
	}

	private static void print() {
        System.out.println(String.join(" ", permutes));
	}
}
