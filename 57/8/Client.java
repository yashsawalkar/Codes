interface One{

	int x = 10;
}

interface Two{

	int x = 20;
}

class Demo implements One, Two{

	//int x = 30;
	
	void fun(){
		System.out.println(x);
		System.out.println(x);

	}

}

class Client{

	public static void main(String[] args){
		
		Demo demo = new Demo();
		demo.fun();
	}
}