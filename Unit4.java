package week3;
import java.util.Scanner;

public class Unit4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age");
		age = in.nextInt();
		
		if (age<=18) {
			System.out.println("What's up");
		}
		else if (age>18) {
			System.out.println("Greetings");
		}
		else {
			System.out.println("Ok");
		}
	
	}

}
