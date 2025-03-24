package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String[] words = text.split(" "); // Split the string into words

		// Removing duplicate words
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("")) {
				continue; // Skip already replaced words
			}
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) { // Case-insensitive match
					words[j] = ""; // Replace duplicate with empty string
				}
			}
		}

		// Printing the final output using a normal for loop
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals("")) { // Ignore empty strings
				System.out.print(words[i] + " ");
			}

		}

	}
}
