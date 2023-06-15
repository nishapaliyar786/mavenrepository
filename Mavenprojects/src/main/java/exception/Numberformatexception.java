package exception;

public class Numberformatexception {
  void display()
  {
	  try
	  {
		  String s = "hai";
		  int num = Integer.parseInt(s);
	  }
	  catch(NumberFormatException e)
	  {
		  System.out.println(e);
		  System.out.println("Number format exception handled");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Numberformatexception n = new Numberformatexception();
        n.display();
	}

}
