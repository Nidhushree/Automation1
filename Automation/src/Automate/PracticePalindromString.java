package Automate;

import java.util.Scanner;

public class PracticePalindromString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("It's a palindrome string");
		}
		else
		{
			System.out.println("It's not a palindrome string");
		}

	}

}
