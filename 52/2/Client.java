class MummykiMaggi{

	private void recipe(){
		
		System.out.println("Only Phodni");
	}

	


}

class MeriMaggie extends MummykiMaggi{

	void recipe(){
		
		System.out.println("Only Phodni + Garlic and Herbs Butter + Oregano");
	}

	
}

class Client{

	public static void main(String[] args){

		MummykiMaggi mummy = new MeriMaggie();

		mummy.recipe();

		
	}

}