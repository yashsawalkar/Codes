import java.util.*;

class ThrowDemo{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Except 0");
		int i = sc.nextInt();
		try{
			if(i == 0){
				throw new ArithmeticException();
			}
		}catch(ArithmeticException ae){
			System.out.println("Are Dada/Tai..0 button nahi dabana tha");
			System.out.println("Enter number again");
			i = sc.nextInt();
			try{
				if(i == 0)
				throw new ArithmeticException();
			}catch(ArithmeticException e){
				System.out.println("Are Dada/Tai..0 button nahi dabana tha");
			System.out.println("Enter number again");
			i = sc.nextInt();

			}
		}
		int j = 10/i;
		
		
	}
}