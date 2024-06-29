import java.io.*;

class NFEDemo{


	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new 				InputStreamReader(System.in));
		
		try{
			int i = Integer.parseInt(br.readLine());
		}catch(NumberFormatException ne){
			System.out.println("NumberFormatException ala ahe");
		}

	}
}