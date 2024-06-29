import java.util.ArrayList;

class ALDemo extends ArrayList{

	public static void main(String[] args){
		
		ALDemo al =  new ALDemo();
		
		al.add(10); 
		al.add(20);
		al.add(30);
		al.add(40);

		al.removeRange(1,2);		
		System.out.println(al);
		


		

	}
}