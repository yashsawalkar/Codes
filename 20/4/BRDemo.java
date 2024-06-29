import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class BRDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter A Random Integer");
		int randomInt = Integer.parseInt(br1.readLine());
		System.out.println(randomInt); 

		

	}


} 