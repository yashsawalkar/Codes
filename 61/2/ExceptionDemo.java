class ExceptionDemo{

	void m1(){
		System.out.println("In m2");

	}

	void m2(){
		System.out.println(10/0);
		System.out.println("In m2");
	}

	public static void main(String[] args){
		ExceptionDemo obj = new ExceptionDemo();
		obj.m1();
		obj.m2();
		
	}

}