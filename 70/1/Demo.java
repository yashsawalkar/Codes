class ThreadDemo extends Thread{


	public void run(){

		for(int i= 0 ; i < 5; i++){
			try{
				System.out.println("In anyFunc");
				Thread.sleep(700);
			}catch(InterruptedException ie){
				
			}
		}
	}
}

class Demo{

	public static void main(String[] args) throws InterruptedException{
		ThreadDemo td = new ThreadDemo();
		td.start();

		for(int i= 0 ; i < 5; i++){
			System.out.println("In main");
			Thread.sleep(700);
		}
		
	}
}