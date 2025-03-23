package week1.day3;

public class ArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare two arrays
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		// Iterate through the first array
		for (int i = 0; i < array1.length; i++) {
			// Iterate through the second array
			for (int j = 0; j < array2.length; j++) {
				// Compare elements of both arrays
				if (array1[i] == array2[j]) {
					// Print the matching element
					System.out.println("Matching element: " + array1[i]);
				}

			}
		}
	}
}