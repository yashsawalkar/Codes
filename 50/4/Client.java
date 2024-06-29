class Mukesh{

	int sharesOfMeta = 100;

	{
		System.out.println("In Instance Block");
	}

	Mukesh(){
		System.out.println("In Constructor - Mukesh");
	}
	
	void Jio(){
		System.out.println("Jio Dhan dhana dhan");
	}


}

class Akash extends Mukesh{

	Akash(){
		super();
		System.out.println("In Constructor - Akash");
		System.out.println(sharesOfMeta);
		Jio();


	}

}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Akash();
	
	}

}