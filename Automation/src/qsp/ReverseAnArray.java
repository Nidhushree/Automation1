package qsp;

public class ReverseAnArray {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		System.out.println("swapping elements are");
		for(int k=0;i<a.length;k++)
		{
			System.out.println(a[k]);
		}
		

	}

}
