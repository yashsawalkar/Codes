class ThreadClassA implements Runnable{

	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
	
}

class ThreadDemo{

	public static void main(String[] args){

		System.out.println(Thread.currentThread().getName());
		ThreadClassA obj = new ThreadClassA();
		Thread t = new Thread(obj);
		t.start();
	}

}
