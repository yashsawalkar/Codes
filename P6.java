import java.util.ArrayList;

class ALDemo{

	public static void main(String[] args){
		
		ArrayList al =  new ArrayList();
		
		al.add(10); 
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.add(60);
		al2.add(70);
		al2.add(80);

		al.addAll(2,al2);
		System.out.println(al);

		


		

	}
}