package arratlist;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList llist = new LinkedList();
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("nisha");
		llist.add("chithra");
		llist.add("florance");
		System.out.println("returning element "+llist.get(1));
		llist.set(1, "shihab");
		//llist.add(5);
		//llist.add(6);
		//System.out.println(llist);
		for(String i:llist)
		{
			System.out.println(i);	
		}
	}

}
