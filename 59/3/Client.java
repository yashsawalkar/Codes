class Outer{

	int outtX = 20;

	void outtMethod(){
		System.out.println("In outtMethod");
	}

	class Inner{

		Inner(){
			System.out.println(this$0);
		}

		int innX = 10;

		void innMethod(){
			System.out.println("In innMethod");
		}
	}
}

class Client{

	public static void main(String[] args){
		//Inner inn = new Inner(); Check the Error : Can't find Symbol
		
		Outer outt = new Outer();
		Outer.Inner inn1 = outt.new Inner();
		System.out.println(outt.outtX);
		outt.outtMethod();
		System.out.println(inn1.innX);
		inn1.innMethod();

		System.out.println("====================================");

		Outer.Inner inn2 = new Outer().new Inner();
		inn2.innMethod();
		
	}
}