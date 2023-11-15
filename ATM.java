package bank;

import java.util.Scanner;

public class ATM extends Account{
	
	public ATM(int num, String name, float b) {
		super(num, name, b);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Account account= new Account(814084234, "Edward Mankiewicz", 0f);
		
		System.out.println("Welcome to BANK's ATM. What would you like to do?");
		boolean breaker = false;
		
		while (breaker==false) {//Runs program infinitely unless case 4
			System.out.println("1). Access information");// Runs every time
			System.out.println("2). Deposit amount");
			System.out.println("3). Withdraw amount");
			System.out.println("4). Exit ATM");
			int userInput = input.nextInt();
			
			switch(userInput) {//Original case input
			
			case 1:
				System.out.println(account.toString());
				System.out.println();
				break;
			
			case 2://Case input for deposit
				System.out.println("How much would you like to deposit?");
				System.out.println("Type 0 to exit deposit console");
				int userInput2 = input.nextInt();
				switch (userInput2) {
				case 0: //Breaker statement
					System.out.println("Exiting deposit console");
					System.out.println();
					break;
				default: 
					account.deposit(userInput2);
					System.out.println();
					break;
				}
				break;
			
			case 3://Case input for withdraw
				System.out.println("How much would you like to withdraw?");
				System.out.println("1). $5 in 1s");
				System.out.println("2). $10 in 1s");
				System.out.println("3). $20 in 5s");
				System.out.println("4). $50 in 10s");
				System.out.println("5). Exit withdraw console");
				int userInput3 = input.nextInt();
				
				switch(userInput3) {
				case 1:
					account.withdraw(5);
					System.out.println();
					break;
					
				case 2:
					account.withdraw(10);
					System.out.println();
					break;
					
				case 3:
					account.withdraw(20);
					System.out.println();
					break;
					
				case 4:
					account.withdraw(50);
					System.out.println();
					break;
					
				case 5:
					System.out.println("Exiting withdraw console");
					System.out.println();
					break;
					
				default:
					System.out.println("Invalid input.");
					System.out.println();
					break;
				}
				break;
			
			case 4:
				System.out.println("Closing account. Have a nice day!");
				breaker = true;				
				break;
			
			default:
				System.out.println("Invalid input. Please try again.");
				System.out.println();
				break;
			}
		}
		input.close();
	}
}

