// To verify about invokespecial open the bytecode and have a look at it. Compare invokespecial of both the constructors.

class Demo{

	int x = 10;

	Demo(){
		System.out.println(x);
	}

	Demo(int x){
		this();
		System.out.println("In Demo Constructor parameterized");
		this.anyMethod();

	}

	void anyMethod(){

		System.out.println("In anyMethod");

	}

}


class Client{

	public static void main(String[] args){

		Demo obj1 = new Demo(35); 	
		
	}
}
