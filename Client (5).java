class Outer{

	static class Inner{

		void m1(){

			System.out.println("In m1 Of inner class");
		}
	}

}

class Client{

	public static void main(String[] args){

		Outer.Inner obj = new Outer.Inner();
		obj.m1();
		
	}

}