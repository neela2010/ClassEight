package exercise;

import java.util.Scanner;

public class PalindromeNumbers2 {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner userInput = new Scanner(System.in); 
		int oririnalInput = userInput.nextInt();
		
		 
        if(isPalindrome(oririnalInput)){
            System.out.println("Number : " + oririnalInput + " is a palindrome");
        }else{
            System.out.println("Number : " + oririnalInput + " is not a palindrome");
        }  
		
		
	}
	
	public static boolean isPalindrome(int number) {
        int oririnalInput = number; // copied number into variable
        int reverse = 0;

        while (oririnalInput != 0) {
            int remainder = oririnalInput % 10;
            reverse = reverse * 10 + remainder;
            oririnalInput = oririnalInput / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

	
	
	
}
