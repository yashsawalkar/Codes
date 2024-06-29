import java.util.concurrent.*;

class ThreadAny implements Runnable{

	int no = 0;

	ThreadAny(int no){

		this.no = no;
	}

	public void run(){
		
		try{
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName());

		}catch(InterruptedException ie){
			
			System.out.println(ie.toString());
		}	

	}

}

class ThreadPoolDemo{

	public static void main(String[] args){	

		ExecutorService serve = Executors.newFixedThreadPool(10);

		for(int i = 1; i <=20 ; i++){

			ThreadAny obj = new ThreadAny(i);
			serve.execute(obj);
		}
	}

}