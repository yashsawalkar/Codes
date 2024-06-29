class CompilePanda{

	int x = 10;

	//CompilePanda(CompilePanda this)
	CompilePanda(){
		System.out.println("In Constructor");
	}

	void display(){
		System.out.println(this.x);
		System.out.println(this);
	}

}

class Client{
		
	public static void main(String[] args){
		
		CompilePanda obj1 = new CompilePanda(); //new CompilePanda(obj1);
		obj1.display(); //display(obj1)
		System.out.println(obj1);

	}
}