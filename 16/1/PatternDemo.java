class PatternDemo{

	public static void main(String[] args){
		
		for(int j = 1; j <= 3; j++){
			
			for(int i = 1; i <= 4; i++){
			
				if(i == 1 || i == 4){
					System.out.print("* ");
				}
				else{
					System.out.print("_ ");
				}
			}
			System.out.println();

		}

	}


}