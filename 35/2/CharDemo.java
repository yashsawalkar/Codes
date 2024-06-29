class CharDemo{

	public static void main(String[] args){

		char ch = 'A';
		int i = 65;
		int j = (int)ch;

		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(i));


	}

}