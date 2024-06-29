import java.util.*;

class EnumerationDemo{

	public static void main(String[] args){

		Vector v = new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);

		Enumeration e = v.elements();	

		while(e.hasMoreElements()){
		
			Integer i = (Integer)e.nextElement();
						
			System.out.println(i+100);
		}	

		
		
	}
}