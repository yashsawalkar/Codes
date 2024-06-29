class CompilePanda{

	Object randomMethod(Object obj){
		
		return new Object();
		
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