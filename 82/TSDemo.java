import java.util.*;

class CricPlayer implements Comparable{

	String name = "";
	int runs = 0;

	CricPlayer(String name, int runs){
		this.name = name;
		this.runs = runs;
	}

	String getName(){

		return this.name;
	}

	public int compareTo(Object obj){
		
		CricPlayer cp = (CricPlayer)obj;
		String playerName = cp.getName();
		//return -(playerName.compareTo(this.name));
		return -(playerName.compareTo(this.name));
		
	}

	public String toString(){
		
		return this.name + " " + this.runs;
	}

}

class TSDemo{
	
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		ts.add(new CricPlayer("Sachin",14000));
		ts.add(new CricPlayer("Virat",13000));
		ts.add(new CricPlayer("Rohit",10000));
		ts.add(new CricPlayer("MSD",9000));
		ts.add(new CricPlayer("Sehwag",8000));

		System.out.println(ts);
	}
}