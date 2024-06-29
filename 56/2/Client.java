interface InterfaceDemo{

	void m1();

	void m2();

}

class Implementor implements InterfaceDemo{

	public void m1(){
		System.out.println("In m1");
	}

	public void m2(){
		System.out.println("In m2");
	}

}

class Client{

	public static void main(String[] args){

		Implementor impl = new Implementor();
		impl.m1();
		impl.m2();

	}

}