class ForEachDemo{

	public static void main(String[] args){

		int arr[] = {10,20,30,40,50};

		for(int x : arr){
			System.out.println(x);
		}

		float arr1[] = {10.1f,20.2f,30.3f,40.4f,50.5f};

		for(float x : arr1){
			System.out.println(x);
		}

		double arr2[] = {10.1,20.2,30.3,40.4,50.5};

		for(double x : arr2){
			System.out.println(x);
		}

		boolean arr3[] = {true, false};
		
		for(boolean x : arr3){
			
			System.out.println(x);
		}
				

	}

}