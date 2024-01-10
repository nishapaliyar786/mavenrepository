package customException;

public class Example {
	
	public void display(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("Not eligible");
		}
		else {
			System.out.println("Eligible for licence");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example example1 = new Example();
		try {
			example1.display(15);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("age should be greater than 18");
		}

	}


