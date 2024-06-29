interface Interface1{

	void method1();

}

interface Interface2 extends Interface1{

	void method2();

}

interface Interface3 extends Interface2{

	void method3();

}

class Implementor implements Interface3{

	public void method1(){

	}

	public void method2(){

	}

	public void method3(){

	}

}


class Client{

	public static void main(String[] args){
		
		Implementor impl = new Implementor();
		
	}

}