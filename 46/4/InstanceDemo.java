class InstanceDemo{

	//instance variable
	int x = 10; 

	//instance method
	void display(){

		int y = 30;
		System.out.println("In Display");
	}

	void indirectCalling(){

		display();
		System.out.println("In indirectCalling");

	}

	public static void main(String[] args){

		InstanceDemo obj = new InstanceDemo();
		obj.indirectCalling();
		
		
	}

}