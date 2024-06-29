class Demo{

	int x = 10;

	Demo(){
		System.out.println(x);
	}

	Demo(int x){
		System.out.println(x);
		System.out.println(this.x);

	}

}


class Client{

	public static void main(String[] args){

		Demo obj = new Demo(); 	
		Demo obj1 = new Demo(35); 	
		
	}
}
