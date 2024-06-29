class Mukesh{

	//Mukesh(Mukesh this)
	Mukesh(){
		//super(this)
		System.out.println("In Constructor - Mukesh");
		System.out.println(this);
	}

}

class Akash extends Mukesh{

	//Internally : Akash(Akash this)
	Akash(){
		//super(this);
		super();
		System.out.println("In Constructor - Akash");
		System.out.println(this);

	}

}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Akash(mukesh);
	
	}

}