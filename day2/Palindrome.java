package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		 int num = 121;  
	        int rev = 0;

	        for (int temp = num; temp > 0; temp /= 10)
	        {
	            rev = rev * 10 + (temp % 10);
	        }

	        if (num == rev) {
	            System.out.println(num + " is a Palindrome.");
	        } else {
	            System.out.println(num + " is NOT a Palindrome.");
	        }
	    }
	}
