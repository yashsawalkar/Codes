import java.io.*;

class IOExcDemo{


	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int i = Integer.parseInt(br.readLine());
			br.close();
			int i2 = Integer.parseInt(br.readLine());
			
		}catch(Exception e){
			System.out.println("Exception ala ahe");
		}catch(Throwable t){
			System.out.println("Throwable ala ahe");
		}


	}
}