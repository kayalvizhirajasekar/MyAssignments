package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

        String[] words = test.split(" "); // Split the string into words

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) { // Check if the position is odd (0-based index)
                char[] charArray = words[i].toCharArray(); // Convert word to char array

                // Reverse the char array
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }
            } else {
                System.out.print(words[i]); // Print the even-positioned words as they are
            }
            System.out.print(" "); // Add space after each word
    }
}
}