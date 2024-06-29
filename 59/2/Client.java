class Parent{

	Parent(){

	}

}

class Child extends Parent{

	Child(){

	}

}

class Demo{

	Demo(Parent parent){
		System.out.println("In Demo Constructor : Parent");

	}

	Demo(Child child){
		System.out.println("In Demo Constructor : Child");

	}

	

	Demo(){
		System.out.println("In Demo Constructor");

	}

}

class Client{

	public static void main(String[] args){

		Demo demo = new Demo(new Parent());
		Demo demo2 = new Demo(new Child());

	}


}