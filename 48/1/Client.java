class Demo{

	Demo(){
		System.out.println("No-args Constructor");
	}

	Demo(int x){
		System.out.println("Parameterized Constructor - int");
	}

	Demo(String str){
		System.out.println("Parameterized Constructor - String");
		
	}
	

}


class Client{

	public static void main(String[] args){

		Demo obj = new Demo();
		Demo obj1 = new Demo(10);
		Demo obj2 = new Demo("Alpha");

		
	}
}