import java.util.*;

class ListIteratorDemo{

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.add("Virat");
		l.add("Hardik");
		l.add("Rishabh");
		l.add("Rohit");

		ListIterator itr = l.listIterator();
		
		while(itr.hasNext()){
		
			if(itr.next().equals("Virat")){
				itr.remove();
			}

		} 

		while(itr.hasPrevious()){
		
			System.out.println(itr.previous());
			
		}

		
	}
}