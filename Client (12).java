class Demo{

	void m1(){

		System.out.println("In m1");
	}

}

class Client{

	public static void main(String[] args){

		//Demo obj = new Client$1();
		Demo obj = new Demo(){
			
			void m1(){
				System.out.println("In m1 : AIC");
				fun(); // 1st way
			}

			void fun(){
				System.out.println("In fun : AIC");
				
			}
		};

		obj.m1();
	}

}