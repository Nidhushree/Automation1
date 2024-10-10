package Arrays;

import java.util.Scanner;

public class KeyElement {

	public static void main(String[] args) {
		int []a= {60,30,50,10,70};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n value upto"+" " +a.length);
		int n=sc.nextInt();
		System.out.println("enter a key element");
		int key=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				count++;
				break;
			}
		}
		if(count==1)
			System.out.println("key element is found");
		else
			System.out.println("key element is not found");
		
		
		

	}

}
