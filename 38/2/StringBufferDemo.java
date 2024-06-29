class StringBufferDemo{

	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		sb.append("_Hii");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		StringBuffer sb2 = sb.append("_Peter_Parker");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb2);

	}
}
