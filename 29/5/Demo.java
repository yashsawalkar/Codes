class Demo{

	public static void main(String[] args){

		
		float x = 100.02f;
		float y = 100.02f;
		Float z = 10.02f;
		double d = 10.2;
		Double d1 = 10.2;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(d1));
			
		if(System.identityHashCode(x) == System.identityHashCode(y)){
			System.out.println("They Are Equal");
		}
		else{
			System.out.println("They Aren't Equal");
		}
		


		
	}

}