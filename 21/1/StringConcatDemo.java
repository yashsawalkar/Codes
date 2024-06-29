import java.io.*;

class StringConcatDemo{

  public static void main(String[] args) throws IOException{

	String str = "";
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	for(int i = 1; i < 5; i++)
	{
	   str = str + br.readLine(); 
	}

	System.out.println(str);

  }


}