import java.util.*;

class HashSetDemo{

	public static void main(String[] args){

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);

		hs.add(null);

		System.out.println(hs.add(10));

		Iterator itr = hs.iterator();

		while(itr.hasNext()){

			Integer i = (Integer)itr.next();
			System.out.println(i);
		}

	}
}