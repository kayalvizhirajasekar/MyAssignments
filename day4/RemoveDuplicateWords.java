package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		// declare input String
		String text = "We learn Java basics as part of java sessions in java week1";

		// Split the text into words
		String[] words = text.split(" ");
		int count;

		// Compare each word with every other word
		for (int i = 0; i < words.length; i++) {
			count = 1;

			// Process only non-empty words
			if (!words[i].equals("")) {
				for (int j = i + 1; j < words.length; j++) {
					// Check for duplicates (case insensitive)
					if (words[i].equalsIgnoreCase(words[j])) {
						words[j] = ""; // Replace duplicate with an empty string
						count++;
					}
				}
			}
		}

		// Print the modified string without duplicates
		for (String word : words) {
			if (!word.equals("")) {
				System.out.print(word + " ");
			}

		}

	}
}
