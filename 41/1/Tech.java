class Tech{

	//instance / non static 
	int x = 20;

	void method1(){
		
		//local
		int y = 10;
		System.out.println(x);	

	}

	public static void main(String[] args){

		int z = 30;
		Tech obj = new Tech();
		System.out.println(obj.x);
			
	
	}

}