class Home{


	void gardening(){
		
		class Plant{
		
			String plantName= "Jade";
		}

		Plant plant = new Plant();
		System.out.println(plant.plantName);
		
	}

	public static void main(String[] args){
		
		Home home = new Home();
		home.gardening();

	}
}