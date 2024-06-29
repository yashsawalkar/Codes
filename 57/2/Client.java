interface InterfaceDemo{

	int x = 10;
	
	void anyMethod();
	void display();
}

class Demo implements InterfaceDemo{

	public void anyMethod(){
		System.out.println("in any method");
	}

	public void display(){
		System.out.println(x);	
	}
}

class Client{

	public static void main(String[] args){

		InterfaceDemo obj = new Demo();

		obj.display();
	}
}