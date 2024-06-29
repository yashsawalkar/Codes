class MumbaiJwelleryShop{

	float Chokerprice = 50;

	void displayPrice(){
		System.out.println(Chokerprice);
	}

	void quality(){
		System.out.println("Average");
		
	}

	void material(){
		System.out.println("Brass");
		
	}

	void color(){
		System.out.println("Golden");
		
	}

}

class PuneJwelleryShop extends MumbaiJwelleryShop{

	float Chokerprice = 150;

	void displayPrice(){
		System.out.println(this.Chokerprice);
	}

}

class Client{

	public static void main(String[] args){
	
		MumbaiJwelleryShop mumbaiShop = new PuneJwelleryShop();
		mumbaiShop.displayPrice();
		mumbaiShop.quality();
		mumbaiShop.color();
		mumbaiShop.material();


	}

}