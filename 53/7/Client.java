class CompilePanda{

	void randomMethod(Object obj){
		
		System.out.println("In randomMethod");
	}


}

class CPChild extends CompilePanda{

	String randomMethod(Object obj){
		
		return "In Child randomMethod";
		
	}

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CPChild();
			
		
	}

}