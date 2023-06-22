package exception;

public class Throwexception {
public static void validate(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("The person is not eligible to vote");
	}
	else
	{
		System.out.println("Person is eligible to vote");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(12);
		System.out.println("rest of the code");
      validate(30);
      
	}

}
