class Home{

	class BedRoom{

		void makeUp(){
			System.out.println("In Bedroom : Makeup");
		}
		
	}

	void guestGathering(){
		System.out.println("Chit chat : Chugli");
	}

	public static void main(String[] args){
		
		Home home = new Home();
		Home.BedRoom bed = home.new BedRoom();
	}
}