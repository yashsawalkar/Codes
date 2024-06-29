class SBDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("Avengers");
		
		sb.reverse();

		System.out.println(sb);

//===============================================================
		String str = "Kamal R. Khan";

		StringBuffer sb1 = new StringBuffer(str);
		sb1.reverse();

		str = sb1.toString();
		System.out.println(str);

	}

}
