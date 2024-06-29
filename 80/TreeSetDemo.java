import java.util.*;

class TreeSetDemo{

	public static void main(String[] args){

		
		TreeSet ts = new TreeSet();

		ts.add('J');
		ts.add('A');
		ts.add('N');
		ts.add('V');
		ts.add('i');

		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			
			Character c = (Character)itr.next();
			System.out.println(c);
		}
	}

}