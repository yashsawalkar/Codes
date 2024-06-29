class Zomato{

	int noOfOutlets = 126;
	String customerName = "YourName";

	void zomaland(){
		
		System.out.println("Delicious Food!! Mama mia... I am loving it :-*");
	}

}

class Instagram{

	String username = "compile_panda";
	
	void reels(){

		System.out.println("Payemnt in process...");	
		
	}

}

class YourMobile{

	public static void main(String[] args){

		Instagram insta = new Instagram();
		Zomato zomato = new Zomato();

		insta.reels();
		zomato.zomaland();
	}
}