class StringDemo{

	public static void main(String[] args){

		String str1 = "Janvi";
		String str2 = new String("Janvi");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		if(str1.hashCode() == str2.hashCode()){

			System.out.println("They Are Equal");

		}
		else{

			System.out.println("They Aren't Equal");

		}


	
	}

}