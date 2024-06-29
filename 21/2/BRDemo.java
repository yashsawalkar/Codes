import java.io.*;

class BRDemo{

  public static void main(String[] args) throws IOException{

	
	InputStreamReader isr = new InputStreamReader(System.in);
	InputStreamReader isr1 = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	BufferedReader br1 = new BufferedReader(isr);

	String str = br.readLine();

	System.out.println(str);

	isr.close();

	String str1 = br.readLine();

	//char ch = (char)isr.read();

	//String str1 = br1.readLine();

	char ch1 = (char)isr1.read();
	

  }


}