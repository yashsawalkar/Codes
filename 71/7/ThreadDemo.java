class ThreadClsA extends Thread{
	
	public void run(){
		
		System.out.println(Thread.currentThread().getPriority());
		
	}
	
}

class ThreadDemo{

	public static void main(String[] args){
		Thread t = Thread.currentThread();

		t.setPriority(10);
		System.out.println(t.getPriority());

		ThreadClsA obj = new ThreadClsA();
		obj.start();
		
	}
	
}