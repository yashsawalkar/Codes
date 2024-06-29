interface MasterChefRecipe{

	default void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}

	


}

interface FoodFactory{

	default void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}

}

class Contenstant1 implements MasterChefRecipe, FoodFactory{



}

class Client{

	public static void main(String[] args){
		
		
		
	}

}