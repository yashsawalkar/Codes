class ExceptionDemo{

	void m1(){
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ex){
			System.out.println("Exception in thread main"+ Thread.currentThread().getName() +": Are oyee!! Nit input de. Zero ne divide nako karu");
			ex.printStackTrace();
		}
	}

	void m2(){
		System.out.println("In m2");
	}

	public static void main(String[] args){
		ExceptionDemo obj = new ExceptionDemo();
		obj.m1();
		obj.m2();
		
	}

}