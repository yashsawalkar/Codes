class Outer{

	int outtX = 20;
	static int sOuttX = 30;


	void outtMethod(){
		System.out.println("In outtMethod");
	}

	class Inner{

		Inner(){
			System.out.println(this);
		}

		int innX = 10;

		void innMethod(){
			System.out.println(outtX);
			System.out.println(sOuttX);

		}
	}
}

class Client{

	public static void main(String[] args){

		Outer outt = new Outer();
		Outer.Inner inn1 = outt.new Inner();

		inn1.innMethod();
		
	}
}