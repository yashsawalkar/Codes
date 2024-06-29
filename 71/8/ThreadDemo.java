class ThreadClsA extends Thread{
	
	public void run(){
		
	
	}
	
}

class ThreadDemo{

	public static void main(String[] args){
		Thread t = Thread.currentThread();

		ThreadClsA obj = new ThreadClsA();
		obj.start();
		obj.start();
		
	}
	
}