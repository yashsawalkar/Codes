class ThreadImpl extends Thread{

	public void run(){
		
		for(int i = 0; i < 10 ; i++){
			
			System.out.println(i);
		}


	}

}

class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{

		Thread thread = new ThreadImpl();
		thread.start();	
		
		thread.join();

		for(int i = 10; i < 20 ; i++){
			
			System.out.println(i);
		}


	}

}