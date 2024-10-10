package Arrays;

public class Armstrong {

	public static void main(String[] args) {
    int n=266;
    int temp=n;
    int temp1=n;
    int count=0;
    while(n>0)
    {
    	n=n/10;
    	count++;
    }
    int sum=0;
    while(temp>0)
    {
    	int x=temp%10;
    	int prod=1;
    	for(int i=1;i<=count;i++)
    	{
    		prod=prod*x;
    	}
    	sum=sum+prod;
    	temp=temp/10;
    }
    if(temp1==sum)
    {
    	System.out.println("armstrong no");
    }
    else 
    {
    	System.out.println("Not an armstrong no");
    }
	}

}
