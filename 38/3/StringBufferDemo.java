class StringBufferDemo{

	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("Every");
		System.out.println(sb.capacity());
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());

		sb2.append("Everything From Scratch");
		System.out.println(sb2.capacity());
		sb2.append("Everything From Scratch");
		System.out.println(sb2.capacity());


	}
}
