import java.util.*;

class CricPlayer{

	String name = "";
	Integer runs = 0;

	CricPlayer(String name, int runs){
		this.name = name;
		this.runs = runs;
	}

	public String toString(){
		
		return this.name + " " + this.runs;
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


class ALDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add(new CricPlayer("Sachin",14000));
		al.add(new CricPlayer("Virat",13000));
		al.add(new CricPlayer("Rohit",10000));
		al.add(new CricPlayer("MSD",9000));
		al.add(new CricPlayer("Sehwag",8000));
		al.add(new CricPlayer("Sehwag",8000));
	
		System.out.println("\n\nBefor Sorting:\n"+al+"\n\n");

		Collections.sort(al,new SortByName());
		System.out.println("After Sorting by name:\n"+al+"\n\n");

		Collections.sort(al,new SortByRuns());
		System.out.println("Befor Sorting by runs:\n"+al+"\n\n");

	}

}
