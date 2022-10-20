package step1;

import java.util.Scanner;

public class JavaInputFromUser {

	public static void main(String[] args) {
		
		Scanner userInput = new  Scanner(System.in);
		

		System.out.println("Enter Your Full Name:");
		String userName = userInput.nextLine();
		
		System.out.println("Enter Your Mobile Number :");
		int userPhoneNumber = userInput.nextInt();
		
		System.out.println("Enter Your Age:");
		int userAge = userInput.nextInt();

		
		System.out.println("Dear Sir \nYour name is :" +userName+"\nYour mobile number is:" +userPhoneNumber+"\nYour age is:" + userAge);
	}

}
