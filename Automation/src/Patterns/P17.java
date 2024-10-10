package Patterns;

public class P17 {

	public static void main(String[] args) {
		int n=4;
		int a=1;
		char ch='A';
		for(int i=0;i<4;i++)
		{    
			for(int j=0;j<4;j++)
			{
				if(i%2==0)
				System.out.print(a+++" ");
			else
				System.out.print(ch+++" ");
				
			}
			
			System.out.println( );
		}


	}

}
