class OuterClass{

	static class InnerClass{
		String InnerClassName= "Jade";
	}

	public static void main(String[] args){
		
		OuterClass.InnerClass InnerClass = new InnerClass();
		System.out.println(InnerClass.InnerClassName);

	}
}