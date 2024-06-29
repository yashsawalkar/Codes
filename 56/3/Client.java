interface InterfaceDemo1{

	void anyMethod();

}

interface InterfaceDemo2{

	void anyMethod();	

}

class Implementor implements InterfaceDemo1, InterfaceDemo2{

	public void anyMethod(){
		
		System.out.println("Keli implement konti pn method");
	}
}

class Client{

	public static void main(String[] args){
		
		InterfaceDemo1 impl1 = new Implementor();
		impl1.anyMethod();

		InterfaceDemo2 impl2 = new Implementor();
		impl2.anyMethod();

		
	}

}