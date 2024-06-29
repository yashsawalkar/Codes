class PatternDemo{


	public static void main(String[] args){

		
		for(int j = 1; j <= 3; j++){
			
			char ch = 'A';
			for(int i = 1; i <= 3; i++){

				System.out.print(ch++);
				System.out.print(" ");
			}

			System.out.println();
		}

	}


}