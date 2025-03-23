package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define input string
        String test = "I am a software tester";

        // Split the string into an array of words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {
            // Check if index is odd (1-based index: odd positions)
            if (i % 2 != 0) {
                // Convert the word to a character array and reverse it
                words[i] = new StringBuilder(words[i]).reverse().toString();
	}
        }
        // Print the modified string
        System.out.println(String.join(" ", words));
    }
}
