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
	System.out.println("Skipped Value chars are :"+ch1+"!");

	System.out.println("Enter Int:");
	int num = Integer.parseInt(br.readLine());

	System.out.println("str Is : "+str);
	System.out.println("ch Is: "+ch);
	System.out.println("num Is: "+num);

	


	

}

}