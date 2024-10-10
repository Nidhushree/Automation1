package Patterns;

public class P18 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		char ch='A';
		for(int i=0;i<4;i++)
		{    
			for(int j=0;j<4;j++)
			{
				if(j%2==0)
				System.out.print(ch+++" ");
			else
				System.out.print(a+++" ");
				
			}
			
			System.out.println( );
		}

}
}
