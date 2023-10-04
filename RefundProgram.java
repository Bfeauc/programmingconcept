package test;

import java.util.Scanner;

public class RefundProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Is the flight in 72 hours?(answer 1 for yes and 0 for no): ");
		int firstans = input.nextInt();
		
		
		while(firstans!=1&&firstans!=0) {
			System.out.print("Invalid input, please input correctly: ");
			firstans = input.nextInt();
		}
		if(firstans==1) {
			System.out.println("Was the purchase in;");
			System.out.println("1. First Class Suite.");
			System.out.println("2. Business Class.");
			System.out.println("3. Economy Class.");
			System.out.print("Enter an option: ");
			int flightclass = input.nextInt();
			input.nextLine();
			
			while(flightclass!=1&&flightclass!=2&&flightclass!=3) {
				System.out.print("Invalid input, please input correctly: ");
				flightclass = input.nextInt();
				input.nextLine();
				
			}
			String flightclassname = "";
			switch (flightclass) {
			case 1:
				flightclassname = "First Class Suite";
				break;
			case 2:
				flightclassname = "Business Class";
				break;
			case 3:
				flightclassname = "Economy Class";
				break;
				
			}
				
			while(flightclass!=1&&flightclass!=2&&flightclass!=3) {
				System.out.print("Invalid input, please input correctly: ");
				flightclass = input.nextInt();
				input.nextLine();
					
			}
		
			
			if(flightclass==1||flightclass==2||flightclass==3) {
				System.out.println("What will the refund be done in?");
				System.out.println("1. Cash.");
				System.out.println("2. Cheque.");
				System.out.println("3. Travel Point.");
				System.out.print("Enter an option: ");
				int refundchoice = input.nextInt();
				input.nextLine();
				
				while(refundchoice!=1&&refundchoice!=2&&refundchoice!=3) {
					System.out.print("Invalid input, please input correctly: ");
					refundchoice = input.nextInt();
					input.nextLine();
				}

				String refundname = "";
				switch (refundchoice) {
				case 1:
					refundname = "Cash";
					break;
				case 2:
					refundname = "Cheque";
					break;
				case 3:
					refundname = "Travel Point";
					break;
				
			}
				
					
				System.out.println("Your " + flightclassname + " ticket will be refunded in " +	refundname);
				}

			
			
		}
		else
			System.out.println("Cannot be refunded.");
		
		input.close();
		
	}
}
