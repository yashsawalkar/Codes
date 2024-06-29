class Outer{

	static int x = 10;

	class Inner{
		final static int y = 20;
		int z = 30;
		void m1(){
			System.out.println("In m1");			
		}			
	}
}

class Client{

	public static void main(String[] args){
		Outer outt = new Outer();
		Outer.Inner obj = outt.new Inner();

		System.out.println(obj.y);

		
	}
}

