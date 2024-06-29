import java.io.InputStreamReader;
import java.io.IOException;

class ISRDemo{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("Enter a character");
		char ch = (char)isr.read();
		System.out.println(ch);

		System.out.println("Enter another character");
		char ch1 = (char)isr.read();
		System.out.println(ch1);

		char ch2 = (char)isr.read();
		System.out.println(ch2);

		char ch3 = (char)isr.read();
		System.out.println(ch3);

		char ch4 = (char)isr.read();
		System.out.println(ch4);
		
		char ch5 = (char)isr.read();
		System.out.println(ch5);


	}


} 