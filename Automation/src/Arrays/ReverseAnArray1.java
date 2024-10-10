package Arrays;

public class ReverseAnArray1 {

	public static void main(String[] args) {
	int []a= {100,50,60,80,40};
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
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}

	}

}
