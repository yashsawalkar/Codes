class Demo{

	static void fun(int arr[]){
		
		//System.out.println(System.identityHashCode(arr));
		
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;

		for(int x : arr){
			System.out.println(x);
		}
	} 

	public static void main(String[] args){

		int arr[] = {10,20,30,40,50};

		System.out.println("In Main");
		//System.out.println(System.identityHashCode(arr));

		fun(arr);
		System.out.println("==============================");
		for(int x : arr){
			System.out.println(x);
		}	


	}

}