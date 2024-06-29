
class CompilePanda{
	
	static int x = 10;
	int y = 20;

	CompilePanda(){
		System.out.println("In Constructor");
	}

	{
		System.out.println("Instance Block 1");		
	}

	static{
		System.out.println("Static Block 1");		
	}

	void display(){
		System.out.println("Instance Method");
	}

	public static void main(String[] args){

		System.out.println("In Main");		
		CompilePanda cp = new CompilePanda();
		cp.display();
	}

	{
		System.out.println("Instance Block 2");		
	}

	static{
		System.out.println("Static Block 2");		
	}


}