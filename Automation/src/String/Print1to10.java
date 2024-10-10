package String;

public class Print1to10 {

	public static void main(String[] args) {
		int[]a= {10,90,40,15,80,19,30};
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
		for(int i=0;i<a.length;i++)
		{
			System.out.println("sorted elements are"+a[i]);
		}

}
}
