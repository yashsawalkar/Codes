class StringDemo{

	public static void main(String[] args){

		String str1 = "Yash";
		String str2 = "EFS";
		System.out.println(str1);
		System.out.println("===========");
		//append method gets called Internally
		//String str3 = str1 + str2;

		//String str3 = str1.concat(str2);
		
		System.out.println("===========");
		//str1.concat(str2);
		System.out.println(str1 + str2);
		System.out.println(str1);

		System.out.println("===========");
		String str4 = "YashEFS";
		String str5 = "YashEFS";
		//System.out.println(str3);
		//System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));


	}

}