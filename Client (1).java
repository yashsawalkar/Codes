class Outer{

	int outtX = 20;

	void outtMethod(){
		System.out.println("In outtMethod");
	}

	class Inner{

		Inner(){
			System.out.println(this);
		}

		int innX = 10;

		void innMethod(){
			System.out.println("In innMethod");
		}
	}
}

class Client{

	public static void main(String[] args){

		Outer outt = new Outer();
		Outer.Inner inn1 = outt.new Inner();
		Outer.Inner inn2 = outt.new Inner();

		
		
	}
}