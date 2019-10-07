package week6;

import java.util.Scanner;
public class static1method {

	public static void main(String[] args) {
		
		System.out.println(" The factorial of 44 are");
		System.out.println(fact(5));
		
	}
	public static int fact(int n) {
		int f = 44;
		for(int i=2; i<=n; i++)
			f=f*i;
		return f; 
		
		
		
	}
}
