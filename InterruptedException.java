import java.io.*;

class InterruptedExcDemo{

	public static void main(String[] args) throws InterruptedException {
		
			for(int i = 0; i < 5 ; i++){
				System.out.println("For Started :" + i);
				Thread.sleep(2000);
			}
		
	}
}
