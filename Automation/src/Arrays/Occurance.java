package Arrays;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String[]a=s.split(" ");
		boolean []b=new boolean[a.length];
		for(int i=0;i<a.length;i++)
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
			if(count==1)
			{
				System.out.println(a[i]+"==>"+count);
			}
		}
		}
	}
}
		
		
		
		

	


