package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		// Define input strings
		String str1 = "stops";
		String str2 = "potss";

		//Check if lengths are equal
		if (str1.length() != str2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		 // Convert strings to character arrays
		char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
     // Condition to check if sorted arrays are equal
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
	}
	}
}
