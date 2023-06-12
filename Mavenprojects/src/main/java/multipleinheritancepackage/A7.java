package multipleinheritancepackage;

public class A7 implements Printable, Showable{
	public void print()
	{
		System.out.println("Hai");
	}
	public void show()
	{
		System.out.println("welcome");
	}
	public static void main(String args[])
	{
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

}
