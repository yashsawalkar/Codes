class InstanceDemo{

	InstanceDemo(){

		System.out.println("In Constructor");
	}

	{

		System.out.println("Instance Block 1");
	}

	public static void main(String[] args){
		
		System.out.println("Before :- In Main");
		InstanceDemo obj = new InstanceDemo();
		System.out.println("In Main");
		
	}

	{

		System.out.println("Instance Block 2");
	}

}