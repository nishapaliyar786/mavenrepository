package arratlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("nisha");
		al.add("chithra");
		al.add("florance");
		al.add("Tijo");
		al.add("chinju");
		System.out.println(al);
		Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		al.remove(2);
		System.out.println(al);
		int size = al.size();
		System.out.println("The size of the list is :"+size);
		al.add(1,"java");
		System.out.println("new list : "+al);
		System.out.println("use contains function : "+al.contains("chinju"));
		System.out.println("use contains function : "+al.contains("welcome"));
		System.out.println("returing element "+al.get(3));
		System.out.println("use set function : "+al.set(2, "ayra"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting : "+al);
		

	}

}
