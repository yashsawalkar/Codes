import java.io.*;

class IOExcDemo{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String str = br.readLine();
			br.close();
			String str1 = br.readLine();
		}catch(IOException ie){
			System.out.println("Exception in Thread \""+Thread.currentThread().getName()+"\" :IOExceptiopn");
			ie.printStackTrace();

		}finally{
			System.out.println("In Finally");
			System.out.println("Closing all the existing connections");


		}
	}	

}