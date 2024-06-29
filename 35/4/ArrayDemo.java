class ArrayDemo{

	public static void main(String[] args){

		Integer arr[] = {100,200,300};
		Integer arr1[] = {100,200,300};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		
		System.out.println("==================================");
	
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));

		System.out.println("==================================");
	
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));



	}

}