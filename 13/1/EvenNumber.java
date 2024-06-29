class EvenNumber{

	public static void main(String[] args){

		int count = 0;
		
		for(int i = 1; i <= 20; i++){
			if(count == 5)
			{
				break;
			}
			if(i % 2 == 0){
				
				System.out.println(i);
				count++;
			}

		}

	}


}