import java.util.*;
import java.io.*;

class ExcHandling{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		try{
			int y = 10 / x;
			sc = null;
			y = sc.nextInt();
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e ){
			System.out.println("Arithmetic Exception");
			//ae.printStackTrace();
		}
	}
}