package String;

import java.util.Scanner;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]+=32;
			}
			
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]-=32;
			}
		}
		String s1=new String(ch);
		System.out.println(s1);
		

	}

}
