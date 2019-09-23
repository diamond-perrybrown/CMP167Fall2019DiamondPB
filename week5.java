/**
 * 
 * @author Diamond
 *
 **/
import java.util.Scanner;

public class week5 {
	public static void main(String[] args) {
		String answer; 
		int creditScore, age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Heloo I'm a car dealer, \ndo you want to buy a car?");
		answer = input.next();
		
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Ok, let me show you what we have...");
			System.out.println("Wait, what's your age?");
			age = input.nextInt();
			if(age >=25) {
				System.out.println("Ok, good");
				
			}else {
				System.out.println("Sorry, I can't sell you a car");
			}
			
			 {
			System.out.println("Ok, call me if you know me");
		}
		}
	}
	public static void checkModel(String model) {
		switch(model) {
		case "Ferrari 488GTB":
			
		}
	}

}
