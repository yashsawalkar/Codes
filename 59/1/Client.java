class Parent{

	Parent(){
		System.out.println("In Parent Constructor");

	}

}

class Child extends Parent{

	Child(){
		System.out.println("In Child Constructor");

	}

}

class Demo{

	Demo(){
		System.out.println("In Demo Constructor");

	}

	Child anyMethod(){
		System.out.println("In any Method");
		return new Child();

	}

}

class Client{

	public static void main(String[] args){

		Demo demo = new Demo();
		demo.anyMethod();
	}


}