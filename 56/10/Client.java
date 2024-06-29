interface MasterChefRecipe{

	static void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}	

}

interface FoodFactory{

	static void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}

}

class Contenstant1 implements MasterChefRecipe, FoodFactory{



}

class Client{

	public static void main(String[] args){
		
		MasterChefRecipe.starterPackage();
		FoodFactory.starterPackage();
		
	}

}