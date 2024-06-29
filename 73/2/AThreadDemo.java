class ThreadAny extends Thread{

	ThreadAny(String str){

		super(str);
	
	}

	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	
	}

}

class AThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadAny t1 = new ThreadAny("CompilePanda");
		t1.start();

		
		Thread.sleep(3000);
		System.out.println(t1.getName());
		
	}

}