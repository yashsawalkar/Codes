import java.io.*;

class ArrayDemo{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100,110,120};
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);		
		}		
	
	}
	

}