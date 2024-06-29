import java.util.*;

class LinkedListDemo{
	
	public static void main(String[] args){
		
		Collection al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);

		
		LinkedList ll = new LinkedList(al);
		System.out.println(ll);

	}
}