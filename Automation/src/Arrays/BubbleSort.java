package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {20,40,10,5,70,90};
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=1;j<=a.length-1;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<=a.length;i++)
		{
			System.out.println("sorted elements are"+a[i]);
		}

	}

}
