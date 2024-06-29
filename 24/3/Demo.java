class Demo{

	
	public static void main(String[] args){

		Demo obj = new Demo();
		//int result = obj.method1(2,3);

		//int result = obj.method1('A','B');		
		//System.out.println(result);
		
		//int a = 'A';
		//System.out.println(a);

		//float result = obj.method1(10.2f,20.4f);

		//double result = obj.method1(10.2,20.4);	
		//System.out.println(result);

		System.out.println(obj.method1(10.2,20.4));

	}

	void method1(double a, double b){
		System.out.println(a);
		System.out.println(b);
		double result = a + b;		
		System.out.println("In method1..");
		//return result;

	}

}