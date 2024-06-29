class Demo{

	public static void main(String[] args){

		/*Integer x = new Integer(100);
		Integer z = new Integer(100);
		Integer y = new Integer(100);*/
		Integer x = 100;
		Integer y = 100;
			
		if(System.identityHashCode(x) == System.identityHashCode(y)){
			System.out.println("They Are Equal");
		}
		else{
			System.out.println("They Aren't Equal");
		}
		


		
	}

}