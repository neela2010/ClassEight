package javaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			System.out.println("This is a division calculator");

			Scanner userInput = new Scanner(System.in);
			System.out.println("1st number");
			int a = userInput.nextInt();

			System.out.println("2nd number");
			int b = userInput.nextInt();

			System.out.println("Result: " + a / b);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Try running again, something went wrong");
		}finally {
			System.out.println("Finally block");
		}

	}

}
