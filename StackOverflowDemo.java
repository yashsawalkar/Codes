class StackOverflowDemo{

	public static void main(String[] args){
		
		anyFunction(1);
	}

	static void anyFunction(int i){
		System.out.println(i);
		anyFunction(++i);
	}

}