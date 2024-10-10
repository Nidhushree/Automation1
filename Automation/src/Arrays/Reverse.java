package Arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String out="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==0)
			{
				out=out+arr[i];
			}
				else
					out=out+arr[i]+" ";
			}
			System.out.println(out);
		}
		

	}


