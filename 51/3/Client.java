class Mukesh{

	int sharesOfMeta = 100;
	String car = "Rollce Royce";

	
}

class Akash extends Mukesh{

	int sharesOfMeta = 200;
	String car = "Lamborghini";

	Akash(){
		System.out.println(this);
	}

	
}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Akash();
		
	}

}