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
		
			String str = (String)itr.next();
			if(str.equals("Virat")){
				itr.remove();
			}

			else if(str.equals("Hardik")){
				itr.set("Pandya");
			}

			else if(str.equals("Rishabh")){
				itr.add("Axar");
			}
		} 

		while(itr.hasPrevious()){
		
			System.out.println(itr.previous());
			
		}

		
	}
}