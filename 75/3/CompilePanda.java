package CP.course;
public class CompilePanda{

	String course = "Java";
	
	public CompilePanda(String course){
		
		this.course = course;
		System.out.println(this.course);
	}

	public String getCourse(){

		return this.course;
	}

}