abstract class Parent{

	void education(){
		System.out.println("Commerce Education Parent");
	}

	void love(){
		System.out.println("Love Parent");

	}

}

class Child extends Parent{

	void education(){
		System.out.println("Engineering Education Child");
	}

 	/*void love(){
		System.out.println("Love Child");

	}*/

}

class Client{

	public static void main(String[] args){

		Parent obj = new Child();
		obj.love();
		obj.education();
	}
}