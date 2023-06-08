package abstractclass2;

public class C extends B{
	void show()
	{
		System.out.println("Hai");
	}
	void welcome()
	{
		System.out.println("welcome window");
	}
	public static void main(String args[])
	{
		C obj=new C();
		obj.show();
		obj.display();
		obj.welcome();
	}

}
