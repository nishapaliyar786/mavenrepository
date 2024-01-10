package superkeywordinstancevariable;

public class Dog extends Animal{
	String color = "black";
	void printColor()
	{
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Dog class
		
	}

}
