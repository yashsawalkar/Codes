import java.io.*;

class BRDemo{

	public static void main(String[] args) throws IOException{
		

		InputStreamReader isr = new InputStreamReader(System.in);
		//int num = isr.read();
		System.out.println("Enter The Character");
		char ch = (char)isr.read();
		
		System.out.println("Entered Character Is :"+ch);
	}


}