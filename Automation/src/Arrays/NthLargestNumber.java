package Arrays;

import java.util.Scanner;

public class NthLargestNumber {

	public static void main(String[] args) {
		int a[]= {40,10,70,90,16,88};
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value to"+a.length);
		int n=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					count++;
				}
				
			}
			if(count==n-1)
			{
				System.out.println(a[i]);
			}
		}

	}

}
