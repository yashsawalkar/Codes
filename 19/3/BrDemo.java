import java.io.*;

class BRDemo{

	public static void main(String[] args) throws IOException{
		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter The String");
		String str = br.readLine();
		
		System.out.println("Entered String Is :"+str);
	}


}