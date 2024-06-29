class CompilePanda{

	private int noOfDays = 65;
	String favTopiv = "Strings";

	void display(){
		System.out.println(noOfDays);
		System.out.println(favTopiv);
	}
}

class Demo{

	public static void main(String[] args){
		
		CompilePanda cp = new CompilePanda();

		cp.display();
		System.out.println(cp.noOfDays);
		System.out.println(cp.favTopiv);

}

}