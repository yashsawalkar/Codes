import java.io.*;

class InterruptedExcDemo{

	public static void main(String[] args){
		
			for(int i = 5; i > 0 ; i--){
				System.out.println("For Started :" + i);
				try{
					Thread.sleep(3500);
				}catch(InterruptedException ie){
					System.out.println("InterruptedException occured");

				}
				System.out.println("For End :" + i);
			}
		
	}
}
