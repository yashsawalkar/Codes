
class Demo{

	int x = 10;
	private int y = 30;

	Demo(){
	}

	Demo(int x){
		
	}

	void anyMethod(){

		System.out.println(x);
		System.out.println(y);

	}

}


class Client{

	public static void main(String[] args){

		Demo obj1 = new Demo(35); 	
		
	}
}
