package exception;

public class Nullpointerexception 
{
	void display()
	{
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Nullpointer exception handled");
		}
	}
	public static void main(String args[])
	{
		Nullpointerexception n = new Nullpointerexception();
		n.display();
		}

}
