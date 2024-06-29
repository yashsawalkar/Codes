class JaggedArrayDemo{

	public static void main(String[] args){
		
		int arr[][] = {{10},{40,50,60,90,100},{70,80,90}};

		//int arr[][] = {{10,20,30},{40,50},{70}};

		for(int j = 0; j < arr.length; j++){

			for(int i = 0; i < arr[j].length; i++){
					
				System.out.println(arr[j][i]);
			}			

		}

	}

}