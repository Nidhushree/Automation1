package qsp;

public class FrequencyArray {

	public static void main(String[] args) {
		int []a= {10,50,60,10,20,20,60};
		boolean [] b=new boolean[a.length];
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
						b[j]=true;
					}
				}
				System.out.println(a[i]+"===="+count);
				
			}
		}
		

	}

}
