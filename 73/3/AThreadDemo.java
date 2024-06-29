class ThreadAny extends Thread{

	ThreadAny(String str){

		super(str);
	
	}

	ThreadAny(){
		super();
	}


	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	
	}

}

class AThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadAny t1 = new ThreadAny("CompilePanda");
		t1.start();

		ThreadAny t2 = new ThreadAny("CompilePanda_1");
		t2.start();

		ThreadAny t3 = new ThreadAny();
		t3.start();		
		
		Thread.sleep(3000);
		
	}

}