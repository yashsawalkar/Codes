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
			}

			Demo fun(){
				System.out.println("In fun : AIC");
				return new Demo();
				
			}
		}.fun();
 // 2nd way

	}

}