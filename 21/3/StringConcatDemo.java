import java.io.*;
import java.util.StringTokenizer;

class StringConcatDemo{

  public static void main(String[] args) throws IOException{
	
	String firstName, middleName, lastName, rollNo;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter your Full Name with Roll No.");	
	String fullString = br.readLine();
	StringTokenizer st = new StringTokenizer(fullString,".");

	System.out.println(fullString);

	System.out.println("Number of Tokens: "+st.countTokens());

	firstName = st.nextToken();
	System.out.println(firstName);

	middleName = st.nextToken();
	System.out.println(middleName);

	lastName = st.nextToken();
	System.out.println(lastName);

	rollNo = st.nextToken();
	System.out.println(rollNo);
	
  }


}