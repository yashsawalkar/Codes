class Demo{

	public static void main(String[] args){

		Integer x = new Integer(100);
		Integer z = new Integer(100);
		Integer y = new Integer(100);

			
		System.out.println("Reference of x :"+System.identityHashCode(x));
		System.out.println("Reference of y :"+System.identityHashCode(y));
		System.out.println("Reference of z :"+System.identityHashCode(z));


		
	}

}