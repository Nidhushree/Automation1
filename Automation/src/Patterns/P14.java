package Patterns;

public class P14 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++)
		{    char ch='A';
			for(int j=0;j<n;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println( );
		}

}
}
