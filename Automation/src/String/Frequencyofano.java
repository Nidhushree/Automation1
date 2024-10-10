package String;

import java.util.Scanner;

public class Frequencyofano {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		int[] s=nextInt();
	boolean[] b = new boolean[s.length];	
		for(int i=0;i<s.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					b[j]=true;
				}
			}
			if(count>=1)
			System.out.println(a[i]+" "+count);
			}
			
		}
		}
		}
	




}
