import java.util.Scanner;

class ScannerDemo{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		System.out.println("Your Name is:");
		System.out.println(name);

	}


}