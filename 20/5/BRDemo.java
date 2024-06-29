import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class BRDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your College name");
		String college = br1.readLine();
		System.out.println(college);

		System.out.println("Enter your Div");
		char div = (char)br1.read();
		System.out.println("Div :"+div);
		
		br1.skip(1);
		
		int randomInt = Integer.parseInt(br1.readLine());
		System.out.println(randomInt); 

		

	}


} 