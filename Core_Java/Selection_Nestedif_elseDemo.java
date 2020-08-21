package fundamentals;

/*
 *  Write a Java program that takes the user to provide a single character from the alphabet. 
 * Print Vowel or Consonant, depending on the user input. 
 * If the user input is not a letter (between an and z or A and Z), or is a string of length > 1, print an error message.
 */

import java.util.Scanner;

public class Selection_Nestedif_elseDemo {

	public static void main(String[] args) {
		
		String s;
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single character : ");
		s = sc.next();
		if(s.length()>1)
		{
			System.out.println("ERROR : Please enter single character");
		}
		else {
		c=s.charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
		{
			System.out.println("Its a vowel");
		}
		else
		{
			System.out.println("Its a consonent");
		}
		}

	}

}
