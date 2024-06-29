class StringDemo{

	public static void main(String[] args){

		String str1 = "Yash";
		String str2 = new String("Yash");
		char chArr[] = {'E','F','S','1'};
		String str3 = new String(chArr);
		String str4 = "Yash";

		//System.out.println(chArr);
		//System.out.println("Value of chArr " + str3); 

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}


}