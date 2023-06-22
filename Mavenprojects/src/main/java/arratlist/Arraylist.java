package arratlist;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //List<String> list1 = new ArrayList<String>();
		List list1 = new ArrayList();
  list1.add("nisha");
  list1.add("florance");
  list1.add("amalu");
  list1.add("tijo");
  list1.add("chinju");
  list1.add("Chithra");
  Iterator itr = list1.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next()); 
  }
  
  
	}

}
