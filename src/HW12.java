import java.util.Scanner;


public class HW12 {

	public static void main(String[] args) {
		
		String continuation;	
		
		do{
		final Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of your school: ");
		String school = input.nextLine();
		boolean match;
		if(school.matches("([A-Z]([a-z]{2,})) ?([A-Z][a-z]*)?(University|College)") == true)
		{
			match = true;
		}
		else if(school.matches("(College|University) of ([A-Z]([a-z]{2,})) ?([A-Za-z][a-z]*)? ?([A-Z][a-z]*)?") == true)
		{
			match = true;
		}
		else
		{
			match = false;
		}
		
		System.out.println(match);
		
		System.out.println("Would you like to find another school?y/n ");
		continuation = input.next();		
		}
		while(continuation.equals("y"));		
		System.out.println("End of Program.");		
	}
}
