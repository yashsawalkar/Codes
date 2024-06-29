interface MasterChefRecipe{

	static void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}	

}


class Contenstant1 implements MasterChefRecipe{



}

class Client{

	public static void main(String[] args){
		
		MasterChefRecipe.starterPackage();
		
	}

}
