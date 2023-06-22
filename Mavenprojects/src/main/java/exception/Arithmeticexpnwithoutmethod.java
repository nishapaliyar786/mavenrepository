package exception;

public class Arithmeticexpnwithoutmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
