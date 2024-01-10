package superkeywordconstructor;

public class Dog extends Animal{
	Dog()
	{
		super();//call immediate parent class constructor
		System.out.println("Dog is created");
		
	}
	public static void main(String args[])
	{
	  Dog d = new Dog();	
	}

}
