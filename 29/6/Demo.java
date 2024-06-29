class Demo{

	public static void main(String[] args){

		int ch = 'A';
		int a = 65;

		char ch1= 'A';
		char b = 65;

		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(a));

		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(b));
		

		
	}

}