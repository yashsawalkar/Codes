import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class BRDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your College name");
		String college = br1.readLine();
		System.out.println(college);

		System.out.println("Enter your Branch name");
		String branch = br1.readLine();
		System.out.println(branch);

		System.out.println("Enter your Div");
		char div = (char)br1.read();
		System.out.println(div);
		
		/*System.out.println("Enter your Year");
		String year = br1.readLine();
		System.out.println(year);*/

		System.out.println("Enter A Random String");
		String randomString = br1.readLine();
		System.out.println(randomString);

		

		

	}


} 