class CompilePanda{

	static int c = 20;

	static{
		//System.out.println(c);
		System. out.println("In static block 1");
	}

	public static void main(String[] args){

		System.out.println("In main...");
	}

	static{
		System.out.println("In static block 2");
		
	}
	

}

