package exception;

public class Arithmetccexception {
	void dispaly()
	{
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("error");
		}
	}
	public static void main(String arg[])
	{
		Arithmetccexception ee = new Arithmetccexception();
		ee.dispaly();
;	}

}
