import java.io.*;

class IOExcDemo{


	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int i = Integer.parseInt(br.readLine());
			br.close();
			int i2 = Integer.parseInt(br.readLine());
			
		}catch(IOException ie){
			System.out.println("IOException ala ahe");
		}catch(Exception e){
			System.out.println("IOException ala ahe");
		}catch(Throwable t){
			System.out.println("IOException ala ahe");
		}


	}
}