
import java.io.*;

class Mall{

	int noOfShops = 0;
	String nameOfMall = null;
	int noOfParkingFloors = 0;
	String theatre = null ;
	in

t noOfTheatreScreens = 0;jaj

	Mall(){
		noOfShops = 0;
		nameOfMall = null;
		noOfParkingFloors = 0;
		theatre = null ;
		noOfTheatreScreens = 0;
	}

	Mall(int noOfShops,String nameOfMall,int noOfParkingFloors,String theatre,int noOfTheatreScreens ){
		this.noOfShops = noOfShops;
		this.nameOfMall = nameOfMall;
		this.noOfParkingFloors = noOfParkingFloors;
		this.theatre = theatre;
		this.noOfTheatreScreens = noOfTheatreScreens;



	}

	
	int getNoOfShops(){
		return this.noOfShops;
	}

	void setNoOfShops(int noOfShops){
		this.noOfShops = noOfShops;
	}

	String getNameOfMall(){
		return this.nameOfMall;
	}

	void setNameOfMall(String nameOfMall){
		this.nameOfMall = nameOfMall;
	}

	int getNoOfParkingFloors(){
		return this.noOfParkingFloors;
	}

	void setNoOfParkingFloors(int noOfParkingFloors){
		this.noOfParkingFloors = noOfParkingFloors;
	}

	String getTheatre(){
		return this.theatre;
	}

	void setTheatre(String theatre){
		this.theatre = theatre;
	}

	int getNoOfTheatreScreens(){
		return this.noOfTheatreScreens;
	}

	void setNoOfTheatreScreens(int noOfTheatreScreens){
		this.noOfTheatreScreens = noOfTheatreScreens;
	}

	void display(){
		System.out.println("No of Shops         :"+this.noOfShops);
		System.out.println("Name of Mall        :"+this.nameOfMall);
		System.out.println("No of Parking floor :"+this.noOfParkingFloors);
		System.out.println("Theatre             :"+this.theatre);
		System.out.println("No of Screens       :"+this.noOfTheatreScreens);
	}

}

class Client{

	public static void main(String[] args) throws IOException{

		Mall mall = new Mall(100, "Phoenix Millenium", 3, "INOX", 12);
		mall.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Shops, Name of Mall, No of Parking floor, Theatre and No of Screens");
		mall.setNoOfShops(Integer.parseInt(br.readLine()));
		mall.setNameOfMall(br.readLine());
		mall.setNoOfParkingFloors(Integer.parseInt(br.readLine()));
		mall.setTheatre(br.readLine());
		mall.setNoOfTheatreScreens(Integer.parseInt(br.readLine()));

		mall.display();

		
	}
}