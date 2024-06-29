class Outer{

	void m1(){
		
		System.out.println("In m1");
		class Inner{

			void m1(){
				System.out.println("In m1 : Inner");
			}

		}
	}

	void m2(){
		System.out.println("In m2");
	}

}

class Client{

	public static void main(String[] args){

		Outer outt = new Outer();
		outt.m1();
		outt.m2();

	}
}