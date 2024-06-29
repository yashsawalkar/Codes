class ThreadClsA extends Thread{
	
	public void run(){
		
		System.out.println("In run");
		System.out.println(Thread.currentThread());
		
		int i = 0;
		while(i < 30){

			System.out.println(i);
			i++;

		}
			

	}
	
}

class ThreadDemo{

	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t);

		ThreadClsA obj = new ThreadClsA();
		obj.start();
		
		t.setPriority(-5);
		System.out.println(t);

	}
	
}