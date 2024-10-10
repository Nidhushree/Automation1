package qsp;

public class BubbleSort {

	public static void main(String[] args) {
		int []a= {60,40,10,5,90,15,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
			System.out.println("sorted elements are");
		
			for(int k=0;k<a.length;k++)
			{
				System.out.println(a[k]);
			}
		}

	}


