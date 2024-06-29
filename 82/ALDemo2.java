import java.util.*;

class CricPlayer{

	String name = "";
	Integer runs = 0;
	Float average = 0.0f;

	CricPlayer(String name, int runs, float average){
		this.name = name;
		this.runs = runs;
		this.average = average; 
	}

	public String toString(){
		
		return this.name + " " + this.runs + " " + this.average;
	}

}

class SortByName implements Comparator{

	public int compare(Object obj1, Object obj2){
		
		CricPlayer cp1 = (CricPlayer)obj1;
		CricPlayer cp2 = (CricPlayer)obj2;

		return cp1.name.compareTo(cp2.name);

	}

}

class SortByRuns implements Comparator{

	public int compare(Object obj1, Object obj2){
		
		CricPlayer cp1 = (CricPlayer)obj1;
		CricPlayer cp2 = (CricPlayer)obj2;

		return cp1.runs.compareTo(cp2.runs);

	}

}

class SortByAverage implements Comparator{

	public int compare(Object obj1, Object obj2){
		
		CricPlayer cp1 = (CricPlayer)obj1;
		CricPlayer cp2 = (CricPlayer)obj2;

		//return (int)(cp1.average - cp2.average);
		return cp1.average.compareTo(cp2.average);

	}

}


class ALDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add(new CricPlayer("Sachin",14000,50.02f));
		al.add(new CricPlayer("Virat",13000,50.8f));
		al.add(new CricPlayer("Rohit",10000,49.5f));
		al.add(new CricPlayer("MSD",9000,35.1f));
		al.add(new CricPlayer("Sehwag",8000,42.8f));
		al.add(new CricPlayer("Sehwag",8000,42.8f));
	
		System.out.println("\n\nBefor Sorting:\n"+al+"\n\n");

		Collections.sort(al,new SortByAverage());
		System.out.println("After Sorting by average:\n"+al+"\n\n");

	
	}

}
