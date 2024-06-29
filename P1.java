import java.util.ArrayList;

class ALDemo{

	public static void main(String[] args){
		
		ArrayList al =  new ArrayList();
		
		al.add(10); //new Integer(10)
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(10);
		
		System.out.println(al.size());

		System.out.println(al.contains(30));
		System.out.println(al.contains(50));

		System.out.println(al.indexOf(10));
		System.out.println(al.indexOf(50));

		System.out.println(al.lastIndexOf(10));
		System.out.println(al.lastIndexOf(50));

		System.out.println("Set :" + al.set(3,11));

		System.out.println("Before Removal at index 3 :" + al);
		al.remove(3);
		System.out.println("After Removal at index 3 :" + al);

		

	}
}