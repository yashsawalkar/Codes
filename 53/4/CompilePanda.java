class CompilePanda{

	void display(int iNum, float fNum){
		
		System.out.println("In int display");
	}

	void display(float fNum , int iNum){
		
		System.out.println("In float display");
	}
	

}


class Client{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();
		cp.display(10,10);
		
	}

}