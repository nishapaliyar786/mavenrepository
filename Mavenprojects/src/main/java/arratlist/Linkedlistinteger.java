package arratlist;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistinteger {
	public static void main(String args[])
	{
		//LinkedList<Integer> llist2 = new LinkedList<Integer>();
		LinkedList llist2 = new LinkedList();
		llist2.add(10);
		llist2.add(5);
		llist2.add(30);
		llist2.add(40);
		llist2.add(2);
		llist2.add("nisha");
		llist2.addFirst("shihab");
		llist2.addLast("ayra");
		System.out.println("The index of 40 is "+llist2.indexOf(40));
		System.out.println(llist2.contains(2));
		System.out.println(llist2.contains(200));
		System.out.println(llist2.peekLast());//get last element of the list
		System.out.println(llist2.peekFirst());//get first element of the list
		System.out.println(llist2);
//		Collections.sort(llist2);
//		for(int a:llist2)
//		{
//			System.out.println(a);
//		}

	}

}
