package String;

public class PracticeString {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hi";
		if(s1==s2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		s1=s1+"H";
		if(s1==s2)
		{
			System.out.println("Strings are not immutable");
		}
			else
			{
				System.out.println("Strings are immutable");
		}

	}

}
