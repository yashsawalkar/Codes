class Mukesh{

	Mukesh(){

		System.out.println("In Constructor - Mukesh");
		System.out.println(this);
	}

}

class Akash extends Mukesh{

	Akash(){
		System.out.println("In Constructor - Akash");
		System.out.println(this);

	}

}

class Client{

	public static void main(String[] args){

		//Akash akash = new Akash();
		//Mukesh mukesh = new Mukesh();
		Mukesh mukesh1 = new Akash();

		Akash akash = new Mukesh();
	
	}

}