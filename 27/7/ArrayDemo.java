class ArrayDemo{
	
	public static void main(String[] args){
		
		float fArr[] = new float[]{10,20,30};
		System.out.println(fArr);
		
		for(int i = 0; i< fArr.length ; i++){
			System.out.println(System.identityHashCode(fArr[i]));
		}

	}
}