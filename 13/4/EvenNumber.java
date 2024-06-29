class EvenNumber{

	public static void main(String[] args){

		int count = 0;
		
		for(int i = 1; i <= 20; i++){
			
			if(i % 2 == 0){
				
				if(count < 5)
					count++;
				else
					break;
				System.out.println(i);

				
			}

		}

	}


}