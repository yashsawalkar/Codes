class Mukesh{

	Mukesh(){
		System.out.println("In Constructor - Mukesh");
		System.out.println(this);
	}

}

class Akash extends Mukesh{

	Akash(){
		super();
		//this();
		System.out.println("In Constructor - Akash");
		System.out.println(this);

	}

}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Akash();
	
	}

}