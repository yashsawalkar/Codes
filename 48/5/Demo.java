class Demo{

	int x = 10;

	Demo(){
		this(20); //recursive constructor invocation
		System.out.println("In Demo Constructor No Args");
	}

	Demo(int x){
		this();
		this.x = x; 
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
