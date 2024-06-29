class CompilePanda{

	void randomMethod(Object obj){
		
		System.out.println("In randomMethod");
	}

	void randomMethod(String obj){
		
		System.out.println("In String randomMethod");
	}

	

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();
		cp.randomMethod(new String("Hello"));
		cp.randomMethod("Hello");

		cp.randomMethod(1);

		
	}

}