class CompilePanda{

	String randomMethod(Object obj){
		
		return "In Child randomMethod";
	}


}

class CPChild extends CompilePanda{

	Object randomMethod(Object obj){

		return new Object();
		
	}

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CPChild();
			
		
	}

}