package week1.day3;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array declaration
		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };

		// Sort the array
		Arrays.sort(arr);

		// Loop to check for the missing number
		for (int i = 0; i < arr.length - 1; i++) {

			// If next element is not +1 of current element
			if (arr[i] + 1 != arr[i + 1]) {
				System.out.println("Missing number: " + (arr[i] + 1));

				// Exit loop after finding missing number
				break;
			}
		}
	}
}
