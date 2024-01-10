package javaPlacement;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "malayala";
		String reverse="";
	
		
			for(int j=s.length()-1;j>=0;j--)
			{
				reverse = reverse+s.charAt(j);
			}
				if(s.equals(reverse))
					System.out.println("String is palindrome");
				else 
					System.out.println("String is not palindrome");
			
		}

	

}
