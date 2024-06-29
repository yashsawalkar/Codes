class ThreadAny extends Thread{

	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	
	}

}

class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadAny t1 = new ThreadAny();
		t1.start();
		
		Thread.sleep(3000);
		t1.setName("CompilePanda");
		System.out.println(t1.getName());
		
	}

}