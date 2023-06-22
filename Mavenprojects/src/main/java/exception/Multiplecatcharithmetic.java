package exception;

public class Multiplecatcharithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Arithmetic exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("handle arrayindexbound exception");
		}
		 System.out.println("rest of the code");
	}

}
