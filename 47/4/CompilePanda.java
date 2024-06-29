class CompilePanda{

	int x = 10;

	CompilePanda(){
		System.out.println("No args Constructor");
	}

	CompilePanda(int a){
		System.out.println("Parameterized constructor");	
	}

	CompilePanda(CompilePanda abc){
		System.out.println("Parameterized constructor with class as argument");	
		System.out.println(this);	

	}


}

class Client{
		
	public static void main(String[] args){
		
		CompilePanda obj1 = new CompilePanda();
		CompilePanda obj2 = new CompilePanda(4);
		CompilePanda obj3 = new CompilePanda(obj2);
		

	}
}