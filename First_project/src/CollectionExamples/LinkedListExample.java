package CollectionExamples;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(34);
		llist.add(45);
		llist.add(56);
		llist.add(23);
		llist.add(32);
		System.out.println(llist);
		llist.remove();
		
		System.out.println("After remove  first element:" +llist);
		llist.removeLast();
		System.out.println(" After remove last element : " +llist);
		llist.addFirst(12);
		System.out.println("After adding element at first :" +llist);
		llist.removeFirst();
		System.out.println("After remove element at first :" +llist);
		Collections.sort(llist);
		System.out.println("After sorting list" +llist);
		System.out.println("minimum of list elments is : " +llist.getFirst());
		System.out.println("maximum of list elments is : " +llist.getLast());
		System.out.println("remove element at position 2 is :" +llist.remove(2));
		
	}
		

		

		
		

	

}
