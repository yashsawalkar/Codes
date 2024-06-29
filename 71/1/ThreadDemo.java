class ClsThread extends Thread{

	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}

	public void start(){
		System.out.println("In start");
		run();
	}

}

class ThreadDemo{

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		ClsThread t = new ClsThread();
		t.start();
	}

}