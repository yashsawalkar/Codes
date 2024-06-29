class StackOverflowDemo{

	public static void main(String[] args){
		
		anyFunction(1);
	}

	void anyFunction(int i){
		Sytem.out.println(i);
		anyFunction(++i);
	}

}