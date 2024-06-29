class ThreeDArray{

	public static void main(String[] args){

		int arr1[][][] = new int[4][][];

		int arr[][][] = {{{10,20},{30,40}},{{50,60},{70,80}},{{90,110},{100,120}}};

		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
			
				for(int k = 0; k < arr[i][j].length; k++){
					
					System.out.println(arr[i][j][k]);

				}
			}
		

		}

			
	
	}

}