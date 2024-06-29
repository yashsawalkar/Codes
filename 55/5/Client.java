abstract class Parent{

	void education(){
		System.out.println("Commerce Education Parent");
	}

	abstract void love();

}

class Child extends Parent{

	void education(){
		System.out.println("Engineering Education Parent");
	}

 	void love(){
		System.out.println("Love Child");

	}

}

class Client{

	public static void main(String[] args){

		Parent obj = new Child();
		obj.love();
	}
}