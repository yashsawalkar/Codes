class Demo{

	public static void main(String[] args){

		//Integer z = new Integer(1000);
		int x = 129;
		int y = 20;
		Integer i = 129;	
		Integer j = 20;	
		int k = 129;

		//
System.out.println("Reference of z which is created using new :" + System.identityHashCode(z));	

		System.out.println("Reference of x :"+System.identityHashCode(x));
		System.out.println("Reference of i :"+System.identityHashCode(i));	
			
		System.out.println("Reference of y :"+System.identityHashCode(y));
		System.out.println("Reference of j :"+System.identityHashCode(j));

		System.out.println("Reference of k :"+System.identityHashCode(k));


		
	}

}