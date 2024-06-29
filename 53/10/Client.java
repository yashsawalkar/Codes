class CompilePanda{

	void methodRandom(String obj){
		
		System.out.println("In methodForString");
	}

	void methodRandom(StringBuffer obj){
		
		System.out.println("In methodForStringBuffer");
		
	}


}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();

		cp.methodRandom("Hello");
		cp.methodRandom(new StringBuffer("Hello"));
	
		//StringBuffer sb = null;
		//String str = null;

		cp.methodRandom(null);
		
	}

}