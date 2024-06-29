
class ArrayDemo{
	
	public static void main(String[] args){
				
		int arr[] = new int[]{10,20,30,100,127,128,129};

		int arr1[] = new int[]{10,20,30,100,127,128,129};

		System.out.println("What is inside arr and arr1?");
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println("============================================================");

		System.out.println("What is inside arr and arr1 at index 4 having value 127?");
		System.out.println(System.identityHashCode(arr[4]));
		System.out.println(System.identityHashCode(arr1[4]));
		System.out.println("============================================================");
		System.out.println("What is inside arr and arr1 at index 5 having value 128?");
		System.out.println(System.identityHashCode(arr[5]));
		System.out.println(System.identityHashCode(arr1[5]));
		System.out.println("============================================================");
		System.out.println("What is inside arr and arr1 at index 6 having value 129?");
		System.out.println(System.identityHashCode(arr[6]));
		System.out.println(System.identityHashCode(arr1[6]));
		System.out.println("============================================================");		


	}

}