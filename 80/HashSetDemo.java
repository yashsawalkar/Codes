import java.util.*;

class HashSetDemo{

	public static void main(String[] args){

		HashSet hs = new HashSet();
		//initial capacity -> 16 and load factor/ fill ratio -> 0.75

		HashSet hs1 = new HashSet(20);
		// initial capacity -> 20

		HashSet hs2 = new HashSet(22,0.5f);
		//customosed initial capacity -> 16 and load factor/ fill ratio -> 0.75

		HashSet hs3 = new HashSet(hs2);

		

	}
}