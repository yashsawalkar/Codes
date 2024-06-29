class Outer{

	Object m1(){
		
		System.out.println("In m1");
		class Inner{

			void m1(){
				System.out.println("In m1 : Inner");

				class InnerAnother{

					void m1(){
					System.out.println("In m1 : Inner");
				
				}

		}

				
			}

		}

		return new Inner();
	}

	void m2(){
		System.out.println("In m2");
	}

}

class Client{

	public static void main(String[] args){

		Outer outt = new Outer();
		Object obj = outt.m1();
		outt.m2();

	}
}