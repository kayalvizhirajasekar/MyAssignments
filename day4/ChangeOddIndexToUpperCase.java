package week1.day4;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Strinf declaration 		
		   String input = "changeme";
		 
		   //Convert String to Character Array
	        char[] charArray = input.toCharArray();

	        // Iterate from end to start
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            
	        //If index is odd, convert to uppercase
	            if (i % 2 != 0) {
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }
	        
	        // Print the modified string
	        // Convert the character array back to a string and print the result
	        System.out.println(new String(charArray));
	            }
	       
	        
	        
	        	
	

}
