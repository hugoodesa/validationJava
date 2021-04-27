import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 		
		
		try {
			//start data
			System.out.println("Enter account data : ");
			System.out.print("Number : ");
			int number=sc.nextInt();
			sc.nextLine();
			System.out.print("Holder : ");
			String holder=sc.nextLine();
			System.out.print("Initial Balance : ");
			double initialBalance=sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit=sc.nextDouble();
			//end data

			//create Account
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			//withDraw
			System.out.print("Enter amount for withdraw: ");
			double withdraw=sc.nextDouble();
			acc.withDraw(withdraw);
			
			System.out.println(acc);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error !");
		}
				
		sc.close();
	}
}
