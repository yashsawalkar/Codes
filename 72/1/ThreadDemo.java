class ThreadImpl extends Thread{

	public void run(){
		
		System.out.println(Thread.currentThread());
	}

}

class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{

		System.out.println(Thread.currentThread());

		Thread thread = new ThreadImpl();
		thread.start();
		Thread.sleep(1000);
		Thread.currentThread().setName("CompilePanda");
		System.out.println(Thread.currentThread());

	}

}