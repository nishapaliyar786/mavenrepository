package exception;

public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
	 int a[] = new int[5];
		System.out.println(a[7]);
 }
 catch(ArithmeticException e)
 {
	 System.out.println("Arithmetic exception handled");
	
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
	 System.out.println(e);
	 System.out.println("Arrayindex exceptionhandled");
 }
 System.out.println("rest of the code");
	}

}
