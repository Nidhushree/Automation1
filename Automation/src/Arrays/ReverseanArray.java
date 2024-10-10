package Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int a[]= {90,30,20,40,80,60};
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
		System.out.println("reverse elements are");
		for(int k=0;k<=a.length;k++)
		{
			System.out.println("reverse an ineteger" +a[k]);
		}

	}

}
