import java.io.*;

class ExceptionDemo {
		
	int m1() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());

	}

	public static void main(String[] args) throws IOException{
		
		ExceptionDemo obj = new ExceptionDemo();
		
		int x = obj.m1();

 
	}

}