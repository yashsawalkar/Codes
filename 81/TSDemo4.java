import java.util.*;

class MyClass implements Comparable{

	public String str = null;
	
	MyClass(String str){

		this.str = str;
	}

	public String getStr(){
		return this.str;
	}

	public int compareTo(Object obj){

		String s = ((MyClass)obj).str;
		return str.compareTo(s);
	}

	public String toString(){

		return this.str + " ";
	}
	
}

class TSDemo{

	public static void main(String[] args){
		
		TreeSet ts = new TreeSet();
		ts.add(new MyClass("Sejal"));
		ts.add(new MyClass("Janvi"));
		ts.add(new MyClass("Avanti"));
		ts.add(new MyClass("CompilePanda"));

		System.out.println(ts);
		
	}

}