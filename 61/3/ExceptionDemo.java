class ExceptionDemo{
		
	int x = 10;

	public static void main(String[] args){
		
		ExceptionDemo obj = new ExceptionDemo();
		System.out.println(obj.x);
		obj = null;
		System.out.println(obj.x);

 
	}

}