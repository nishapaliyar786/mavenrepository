package linkedlistpackage;

import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.add(12);
ll.add(34);
ll.add("nisha");
ll.add("chithra");
System.out.println(ll);
ll.addFirst("ayra");
System.out.println(ll);
ll.addLast("nesrin");
System.out.println(ll);
System.out.println("indexof "+ll.indexOf("nisha"));
System.out.println("contains "+ll.contains(34));
System.out.println(ll.contains(11));
System.out.println(ll.peekLast());
System.out.println(ll.peekFirst());
System.out.println(ll.pollFirst());
System.out.println(ll);
System.out.println(ll.pollLast());
System.out.println(ll);
	}

}
