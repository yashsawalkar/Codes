
class ArrayDemo{
	
	public static void main(String[] args){
				
		int arr[] = new int[]{10,20,30,100,127,128,129};

		int arr1[] = new int[]{1,2,10,100,127,128,129};

		System.out.println("What is inside arr and arr1?");
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println("============================================================");

		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));

		System.out.println("============================================================");

		System.out.println("Is 10 in both Array have same unique number");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr1[2]));
		System.out.println("============================================================");

		System.out.println("Is 100 in both Array have same unique number");
		System.out.println(System.identityHashCode(arr[3]));
		System.out.println(System.identityHashCode(arr1[3]));
		System.out.println("============================================================");

		System.out.println("Is 127 in both Array have same unique number");
		System.out.println(System.identityHashCode(arr[4]));
		System.out.println(System.identityHashCode(arr1[4]));
		System.out.println("============================================================");

		System.out.println("Is 128 in both Array have same unique number");
		System.out.println(System.identityHashCode(arr[5]));
		System.out.println(System.identityHashCode(arr1[5]));
		System.out.println("============================================================");
			
		System.out.println("Is 129 in both Array have same unique number");
		System.out.println(System.identityHashCode(arr[6]));
		System.out.println(System.identityHashCode(arr1[6]));
		System.out.println("============================================================");
			
			


	}

}