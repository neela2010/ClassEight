package exercise;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Give me a String: ");
		
		String userData = userInput.next();
		
		char[] allCharacter = userData.toCharArray();
		
		String finalOutput = "";
		
		for(int i =allCharacter.length-1;i>=0 ;i--){
			finalOutput = finalOutput + allCharacter[i];
			//System.out.print(allCharacter[i]);
		}
		
		System.out.println("Reverse word: " + finalOutput);
		
		
		  if (userData.equalsIgnoreCase(finalOutput)) {
		  System.out.println("String is a palindrome."); } else {
		  System.out.println("String is not a palindrome."); }
		 
		
		
	}
	
	
}
