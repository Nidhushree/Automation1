package String;

public class Freq {
public static void main(String[] args) {
	int[] a= {10,20,30,10,40,40};
	boolean[] b = new boolean[a.length];
	for(int i=0;i<a.length;i++) 
	{
		if(b[i]==false)
		{
			int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				b[i]=true;
				
			
			
		}
		}
	
	System.out.println(a[i]+count+"times");
	}
}
}
}
			
		


