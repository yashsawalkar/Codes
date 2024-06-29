interface MasterChefRecipe{

	default void starterPackage(){
		
		System.out.println("Kadhai and Stove");
	}

	void taste();

	void quantity();

	void presentation();


}

class Contenstant1 implements MasterChefRecipe{

	public void taste(){
		System.out.println("Sweet");
	}

	public void quantity(){
		System.out.println("Can serve 2");

	}

	public void presentation(){
		System.out.println("Garnishied with Dry fruits");

	}

	void judgement(){
		
		taste();
		quantity();
		presentation();
		starterPackage();
	}



}

class Client{

	public static void main(String[] args){
		
		Contenstant1 cont = new Contenstant1();
		cont.judgement();
		
	}

}