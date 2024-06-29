class Mukesh{

	int sharesOfMeta = 100;
	String car = "Rollce Royce";

	void display(){
		System.out.println(sharesOfMeta);
		System.out.println(car);
	}
}

class Akash extends Mukesh{

	int sharesOfMeta = 200;
	String car = "Lamborghini";

	Akash(){
		System.out.println(sharesOfMeta);
		System.out.println(car);
		System.out.println(super.sharesOfMeta);
		System.out.println(super.car);
		//System.out.println(super);

	}

	

	void dispalySuper(){

		System.out.println(Mukesh.sharesOfMeta);

	}	
	
}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Akash();
		
	}

}