class SBDemo{

	public static void main(String[] args){

		String str1 = "Sejal";
		String str2 = "Janvi";
		String str3 = "Avanti";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		str1.concat(str2);
		
		String str4 = str3.concat(str1);

	}

}