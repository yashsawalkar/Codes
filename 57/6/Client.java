interface InterfaceDemo{

	int x = 10;
	
	void anyMethod();
	void display();
}

class Demo implements InterfaceDemo{

	int y = x;


	public void anyMethod(){
		System.out.println("in any method");
		System.out.println(y);	

	}

	public void display(){
		System.out.println(y);	

	}
}

class Client{

	public static void main(String[] args){

		InterfaceDemo obj = new Demo();
		
		obj.anyMethod();
		obj.display();
	}
}