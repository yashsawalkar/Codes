class ClsThreadA extends Thread{
	
	public void run(){
		System.out.println("In ClsThreadA : run");
		System.out.println(Thread.currentThread().getName());

	}

}

class ClsThreadB extends Thread{

	public void run(){
		System.out.println("In ClsThreadB : run");
		ClsThreadA t = new ClsThreadA();
		System.out.println(Thread.currentThread().getName());
		t.start();
	}
}

class ThreadDemo{

	public static void main(String[] args){

		ClsThreadB t = new ClsThreadB();
		t.start();

	}
}