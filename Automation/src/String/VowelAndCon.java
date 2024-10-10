package String;

import java.util.Scanner;

public class VowelAndCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		int vowel;
		int cons;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z')
			{
				if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='U')
				{
					vowel++;
				}
				else
				{
					cons++;
				}
			}
		}
		System.out.println("count of vowel" +vowel);
		System.out.println("count of cons" +cons);
	}
}
		

	


