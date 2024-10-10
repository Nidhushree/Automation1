package File;

public class DepAndWith implements I1, I2 {
	public int Deposite (int amt)
	{
		System.out.println(amt+"amount is deposted");
		return 20;
	}
	
	public int Withdrawl(int amt)
	{
		System.out.println(amt+"amt is withdrawl");
		return 40;
	}

}
