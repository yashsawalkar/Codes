import java.io.*;

class BRDemo{

public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter String:");
	String str = br.readLine();

	System.out.println("Enter char:");
	char ch = (char)br.read();
	
	//long val = br.skip(2);
	char ch1 = (char)br.read();
	System.out.println("Character 1 is:"+ch1+"!");

	char ch2 = (char)br.read();
	System.out.println("Character 2 is :"+ch2+"!");

		

}

}