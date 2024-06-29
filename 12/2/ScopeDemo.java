class ScopeDemo{

	public static void main(String[] args){
	
		int x = 10;
		int y = 20;

		{
			int  x = 10;
			System.out.println(x + " "+y);
		}

		{
			System.out.println(x + " "+y);
		}
	}


}