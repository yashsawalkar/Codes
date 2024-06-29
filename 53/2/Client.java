class CompilePanda{

	void display(int x){
		
		System.out.println("In int display");
	}

	void display(float y){
		
		System.out.println("In float display");
	}
	

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();

		cp.display(1);		
		cp.display('A');

		cp.display(4.0);
		
	}

}