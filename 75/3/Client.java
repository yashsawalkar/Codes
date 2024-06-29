import CP.course.CompilePanda;

class Client{

	public static void main(String[] args){

		CompilePanda cp = new CompilePanda("Java Oct 2023");
		System.out.println(cp.getCourse());
	}
}