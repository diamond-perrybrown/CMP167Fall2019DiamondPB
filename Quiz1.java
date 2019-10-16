
import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation;");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		String LOL = "Laughing Out Loud";
		String TMI = "Too Much Info";
		String SMH = "Shanking My Head";
		
		
		
	
	if (abbreviation.equals("LOL")) {
		System.out.println(LOL);
	}
	else if (abbreviation.equals("TMI")) {
		System.out.println(TMI);
	}
	else if (abbreviation.equals("SMH")) {
		System.out.println(SMH);
	}
	else {
		System.out.println("Unknown Abbreviation");
	}
	}

}
