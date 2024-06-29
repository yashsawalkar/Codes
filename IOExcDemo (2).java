import java.io.*;

class IOExcDemo{

	void acceptData(BufferedReader br) throws IOException{
		String str = br.readLine();
	}

	public static void main(String[] args){
		
		IOExcDemo ioDemo = new IOExcDemo();		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		try{
			ioDemo.acceptData(br);
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