import java.io.*;

class BoilerPlate{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Initializing the Array
		System.out.println("Enter the Size of Array");
		int size = Integer.parseInt(br.readLine());

		/*int arr[] = new int[size];
		System.out.println(arr);*/

		float fArr[] = new float[]{10,20,30,40,50};
		System.out.println(fArr);
		
		System.out.println("============================================");

		//Displaying Elements in an Array
		System.out.println("Displaying Elements in an Array");
		for(int i = 0; i < fArr.length; i++){	
			
			System.out.println(fArr[i]);
		}


	}

}