class MummykiMaggi{

	void recipe(){
		
		System.out.println("Only Phodni");
	}

	void modeOfCooking(){
		
		System.out.println("Stove");
	}

	void randomMethod(){

		System.out.println("Random Method");		
	}


}

class MeriMaggie extends MummykiMaggi{

	void recipe(){
		
		System.out.println("Only Phodni + Garlic and Herbs Butter + Oregano");
	}

	void modeOfCooking(){
		
		System.out.println("Microwave");
	}
	
}

class Client{

	public static void main(String[] args){

		MummykiMaggi mummy = new MeriMaggie();

		mummy.recipe();

		mummy.modeOfCooking();

		mummy.randomMethod();
	}

}