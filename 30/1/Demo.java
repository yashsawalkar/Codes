class Demo{

	static void fun(int x, int y){
		
		System.out.println("In Method fun");
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

		x = x + 10;
		y = y + 10;

		System.out.println(x); //30
		System.out.println(y); //30

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));


	} 

	public static void main(String[] args){

		int x = 20;
		int y = 20;

		System.out.println("In Main");


		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(x));
		
		fun(x,y);	

		System.out.println("Again In Main");
		System.out.println(x); //20
		System.out.println(y); //20

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		

	}

}