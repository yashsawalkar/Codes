class CompilePanda{

	void randomMethod(Object obj){
		
		System.out.println("In randomMethod");
	}

	

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();
		cp.randomMethod("Hello");
		cp.randomMethod(1);

		
	}

}