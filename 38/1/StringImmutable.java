class StringImmutable{

	public static void main(String[] args){
		
		String str1 = "Hello";
		System.out.println(System.identityHashCode(str1));

		String str3 = str1.concat("Hii");;
		System.out.println(System.identityHashCode(str3));
		
	}
}
