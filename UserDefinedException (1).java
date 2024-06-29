import java.util.*;

class UserDefinedException extends RuntimeException{

	UserDefinedException(String msg){
		super(msg);
	}

}

class Client{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try{
			if(i == 10)
				throw new UserDefinedException("10 Enter kela ahe");

		}catch(UserDefinedException ue){
			
		}
	}

}