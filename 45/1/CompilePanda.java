class CompilePanda{

	int p = 10;
	private static int q = 20;

	void display(){
		
		System.out.println(p);
		System.out.println(q);
	}
}

class Demo{

	public static void main(String[] args){
		
		CompilePanda cp = new CompilePanda();
		System.out.println(cp.p);
		//System.out.println(CompilePanda.q);
		//System.out.println(cp.q);

		cp.display();



	}
}