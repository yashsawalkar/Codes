interface InterfaceDemo{

	int x = 10;
	
	void anyMethod();
	void display();
}

class Demo implements InterfaceDemo{

	int x = 20;

	public void anyMethod(){
		System.out.println("in any method");
		System.out.println(x);	
		System.out.println(InterfaceDemo.x);	

	}

	public void display(){
		System.out.println(x);	
		System.out.println(InterfaceDemo.x);	

	}
}

class Client{

	public static void main(String[] args){

		InterfaceDemo obj = new Demo();
		
		obj.anyMethod();
		obj.display();
	}
}