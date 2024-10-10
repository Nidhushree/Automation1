package String;

public class ReverseString {

	public static void main(String[] args) {
		String s="apple";
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.print(s.charAt(s.length()-i-1));
		}

	}

}
