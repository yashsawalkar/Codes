class EvenNumber{

	public static void main(String[] args){

		int count = 0;
		
		for(int i = 1; i <= 20; i++){
			
			if(i % 2 == 0 && count < 5){
				
				System.out.println(i);
				count++;
			}
			else
				break;

		}

	}


}