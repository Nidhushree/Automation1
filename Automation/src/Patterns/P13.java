package Patterns;

public class P13 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++)
		{    int a=1;
			for(int j=0;j<n;j++)
			{
				System.out.print(a+++" ");
			}
			System.out.println( );
		}
	}
}


