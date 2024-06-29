class JaggedArrayDemo{

	public static void main(String[] args){
		
		int arr1[][] = {{10,20,30},{40,50},{70}};
		
		int arr[][] = new int[3][];

		arr[0] = new int[]{10,30};
		arr[1] = new int[]{40,50};
		arr[2] = new int[]{70};

		for(int j = 0; j < arr.length; j++){

			for(int i = 0; i < arr[j].length; i++){
					
				System.out.println(arr[j][i]);
			}			

		}

	}

}