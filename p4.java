import java.util.ArrayList;

class ALDemo{

	public static void main(String[] args){
		
		ArrayList al =  new ArrayList();
		
		al.add(10); 
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] arr = al.toArray();
		for(Object obj: arr){
			System.out.println(obj);
		}		
		
		


		

	}
}