class CompilePanda{

	private String meetingLink = "hwy-iamn-wkn";
	
	double fees = 11000;

	void display(){
		
		System.out.println(meetingLink);
		System.out.println(fees);
	}


}

class Calling{

	public static void main(String[] args){
	
		CompilePanda cp = new CompilePanda();

		System.out.println(cp.fees);
		//System.out.println(cp.meetingLink);

		cp.display();

	}
}