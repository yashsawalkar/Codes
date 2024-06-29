class ScopeDemo{

	public static void main(String[] args){
	
		int x = 10;
		int y = 20;

		{
			int  x = 10;
			//block - flat 1004
			System.out.println(x + " "+y);
		}

		{
			//block - flat 1001
			System.out.println(x + " "+y);
		}
	}


}