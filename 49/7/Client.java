class DhiruBhai{

	DhiruBhai(){
		System.out.println("Constructor - DhiruBhai");
		System.out.println(this);
	}
}

class Mukesh extends DhiruBhai{

		Mukesh(){
			super();
			System.out.println("Constructor - Mukesh");
			System.out.println(this);

		}

}

class Anant extends Mukesh{

		Anant(){
			System.out.println("Constructor - Anant");
		}
}

class Client{

	public static void main(String[] args){
	
		//DhiruBhai dhiru = new DhiruBhai();
		Mukesh mukesh = new Mukesh();
		System.out.println(mukesh);


	}

}