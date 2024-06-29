class CompilePanda{

	static{

		System.out.println("CP : Static Block - 1");
	}

	public static void main(String[] args){

		
	}

}

class Test{

	static{

		System.out.println("Test : Static Block - 1");
	}

	public static void main(String[] args){

		System.out.println("In Main - 1");
		CompilePanda cp = new CompilePanda();
		System.out.println("In Main - 2");
		
	}

	static{

		System.out.println("Test : Static Block - 2");
	}

 
}