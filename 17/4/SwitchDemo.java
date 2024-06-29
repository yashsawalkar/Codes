class SwitchDemo{

	public static void main(String[] args){
		
		int a = 1;
		int b = 2;
		int x = 3;
		switch(x){
		
			case a+0:
				System.out.println("1");
				break;
			/*default:
				System.out.println("Wrong Choice");
				break;*/
			case a+b:
				System.out.println("2");
				break;
			case a + 3:
				System.out.println("3");
				break;
			case b:
				System.out.println("4");
				break;
			case 1+4:
				System.out.println("5");
				break;
			default:
				System.out.println("Wrong Choice");
				break;

		}


	}


}