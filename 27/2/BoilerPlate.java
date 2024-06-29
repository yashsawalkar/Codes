import java.io.*;

class BoilerPlate{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Initializing the Array
		System.out.println("Enter the Size of Array");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("============================================");
		
		//Accepting input from Users
		for(int i = 0; i < arr.length; i++){	
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("============================================");

		//Displaying Elements in an Array
		System.out.println("Displaying Elements in an Array");
		for(int i = 0; i < arr.length; i++){	
			
			System.out.println(arr[i]);
		}
	}

}