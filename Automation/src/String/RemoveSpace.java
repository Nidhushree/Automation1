package String;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String out=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				out=out+s.charAt(i);
			}
		}
		System.out.println(out);
		

	}

}
