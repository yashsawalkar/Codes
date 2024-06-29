class IndianCricPlayer{

	private String pName = null;
	private int pAge = 0;

	IndianCricPlayer(String pName, int pAge){

		this.pName = pName; 
		this.pAge = pAge;
	}

	void displayPlayerInfo(){
		System.out.println(pName);
		System.out.println(pAge);

	}

	String naavGheunYe(){
		
		return this.pName;
	}

	void naavBadlav(String pName){

		this.pName = pName;		
	} 

}

class Client{

	public static void main(String[] args){

		IndianCricPlayer vk = new IndianCricPlayer("Akaay ke Pappa",36);
	
	
		System.out.println(vk.naavGheunYe());	

		vk.naavBadlav("Vamika ke Daddy");

		vk.displayPlayerInfo();
	}
}