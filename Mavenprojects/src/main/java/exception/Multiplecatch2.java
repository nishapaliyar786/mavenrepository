package exception;

public class Multiplecatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try
  {
	  int a[]=new int[5];
	  a[5]=30/0;
	  System.out.println(a[5]);
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
