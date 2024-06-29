class Demo{

	int x = 10;
	int y = 20;

	void show(){
		
		System.out.println(x);
		System.out.println(y);
	}			

}

class Client{

	public static void main(String[] args){
		
		//Interconnection of classes
		Demo obj = new Demo();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
	}

}