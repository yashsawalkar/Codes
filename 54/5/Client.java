class Dadaji{

	void sheti(){

		System.out.println("In Pitaji sheti");		
	}
}


class Pitaji extends Dadaji{

	final void sheti(){

		System.out.println("In Pitaji sheti");		
	}
}

class Betaji extends Pitaji{

	void sheti(){


	}

	
}

class Client{

	public static void main(String[] args){

		Pitaji obj = new Betaji();
		obj.sheti();

		
	}

}