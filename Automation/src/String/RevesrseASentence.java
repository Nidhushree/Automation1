package String;

import java.util.Scanner;

public class RevesrseASentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		String rev=" ";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==0)
		rev=rev+arr[i];
		else
		rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
			
		}

	}


