class Mukesh{

	static int sharesOfMeta = 100;

	Mukesh(){
		System.out.println("In Constructor - Mukesh");
	}

	static void Jio(){
		System.out.println("Jio Dhan Dhana Dhan");
	}
	
	static{

		System.out.println("SB - 1");		
	}

	static{
		System.out.println("SB - 2");
	}
	
}

class Isha extends Mukesh{

	Isha(){
		super();
		System.out.println("In Constructor - Akash");
	}

	static{
		System.out.println(sharesOfMeta);
		Jio();
	}

}

class Client{

	public static void main(String[] args){

		Mukesh mukesh = new Isha();
	
	}

}