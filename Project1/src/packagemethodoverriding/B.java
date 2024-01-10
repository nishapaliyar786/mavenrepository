package packagemethodoverriding;

public class B extends A{
	void show()
	{
		System.out.println("welcome");
	}
	public static void main(String args[])
	{
		B b=new B();
		b.show();
	}
}
