import java.io.InputStreamReader;
import java.io.IOException;

class ISRDemo{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("Enter a character");
		char ch = (char)isr.read();
		System.out.println(ch);

		isr.close();

		System.out.println("Enter another character");
		char ch1 = (char)isr.read();
		System.out.println(ch1);

		/*char ch2 = (char)isr.read();
		System.out.println(ch2);*/
		
		char ch2 = isr.read();
		System.out.println(ch2);
		

		


	}


} 