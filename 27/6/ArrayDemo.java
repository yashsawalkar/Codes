class ArrayDemo{
	
	public static void main(String[] args){
		
		float fArr[] = new float[]{10.2f,20.3f,30.3f,300.5f};
		System.out.println(fArr);
		
		for(int i = 0; i< fArr.length ; i++){
			System.out.println(System.identityHashCode(fArr[i]));
		}

	}
}