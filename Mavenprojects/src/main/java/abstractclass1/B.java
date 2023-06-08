package abstractclass1;

public class B extends A{
void display()
{
	System.out.println("hello world");
}
public static void main(String args[])
{
	B obj = new B();
	obj.display();
}
}
