class JavaClass{

	int noOfDaysTilllNow = 63;
	String favTopic = "IntegerCache";

	void assignments(){
		
		System.out.println("In Assignments method");
		System.out.println(noOfDaysTilllNow);

	}

	public static void main(String[] args){

		JavaClass jc = new JavaClass();

		System.out.println(jc.noOfDaysTilllNow);
		jc.assignments();
	}


}
