interface MasterChefRecipe{

	default void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}

	void taste();

	void quantity();

	void presentation();

	void judgement();


}

class Contenstant1 implements MasterChefRecipe{

	public void starterPackage(){
		
		System.out.println("Kadhai, Stove and Cutlery");
	}

	public void taste(){
		System.out.println("Sweet");
	}

	public void quantity(){
		System.out.println("Can serve 2");

	}

	public void presentation(){
		System.out.println("Garnishied with Dry fruits");

	}

	public void judgement(){
		
		taste();
		quantity();
		presentation();
		starterPackage();
	}



}

class Client{

	public static void main(String[] args){
		
		MasterChefRecipe recipe = new Contenstant1();
		recipe.judgement();
		
	}

}