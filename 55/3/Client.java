class Parent{

	static void play(){
		System.out.println("In Parent play");
	}

}

class Child extends Parent{

	static void play(){
		System.out.println("In Child play");
	}
}

class Client{

	public static void main(String[] args){

		Parent obj = new Child();
		obj.play();

		Parent obj2 = new Parent();
		obj2.play();

		Child obj3 = new Child();
		obj3.play();
	}
}