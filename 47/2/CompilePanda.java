class CompilePanda{

	int x = 10;

	//CompilePanda(CompilePanda this)
	CompilePanda(){
		System.out.println("In Constructor");
	}

	void display(){
		System.out.println(x);
	}

}

class Client{
		
	public static void main(String[] args){
		
		CompilePanda obj1 = new CompilePanda(); //new CompilePanda(obj1);
		CompilePanda obj2 = new CompilePanda(); //new CompilePanda(obj2);
		obj1.display(); //display()
		obj1.x = 20;
		obj1.display();

		obj2.display();

	}
}