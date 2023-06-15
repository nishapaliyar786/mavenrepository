package exception;

public class Arrayindexoutofbound {
void display()
{
	try
	{
		int a[] = new int[5];
		a[7]=20;
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println(e);
		System.out.println("Array index out of bound exception");
	}
}

}
