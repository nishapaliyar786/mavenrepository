package superkeywordmethod;

public class Dog extends Animal{
void eat()
{
	System.out.println("eating bread");
}
void bark()
{
	System.out.println("barking");
}
void work()
{
	super.eat();//call immediate parent class method
	bark();
}
public static void main(String args[])
{
	Dog d = new Dog();
	d.eat();
	d.bark();
	d.work();
}
}
