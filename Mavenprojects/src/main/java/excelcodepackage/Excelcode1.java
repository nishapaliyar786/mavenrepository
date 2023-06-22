package excelcodepackage;

import java.io.IOException;

public class Excelcode1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try 
		{
			String a = Excelcode.getStringData(1, 1);    
			System.out.println(a);   
			} 
		catch (Exception e) 
		{    
			System.out.println("Error here " + e.getMessage());   }   
		try 
		{    
			String b = Excelcode.getIntergerData(1, 1);    
			System.out.println(b);   
			} 
		catch (Exception e) 
		{    
			System.out.println("Error in getting Integer data: " + e.getMessage());   }
	}

}
