class SBDemo{

	public static void main(String[] args){

		String str1 = "Sejal";
		String str2 = "Janvi";
		StringBuffer sb = new StringBuffer("Avanti");

		System.out.println("str1 :"+System.identityHashCode(str1));
		System.out.println("str2 :"+System.identityHashCode(str2));
		System.out.println("sb :"+System.identityHashCode(sb));

		String str3 = str1.concat(str2);
		System.out.println("str3 :"+System.identityHashCode(str3));

		
		//String str4 = str1.concat(sb);

		//StringBuffer str4 = sb.append(str1);

		StringBuffer str4 = sb;

		System.out.println(sb);
		System.out.println("sb :"+System.identityHashCode(sb));
		System.out.println("str4 :"+System.identityHashCode(str4));

		StringBuffer str5 = new StringBuffer("AvantiSejal");
		System.out.println("str5 :"+System.identityHashCode(str5));

		System.out.println(str4);
		System.out.println(sb);


	}

}