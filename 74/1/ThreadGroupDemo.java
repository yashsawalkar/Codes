class ThreadAny implements Runnable{

	public void run(){
		
		try{
			Thread.sleep(50000);
			System.out.println(Thread.currentThread().getName());

		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}

}

class ThreadGroupDemo{

	public static void main(String[] args){

		ThreadGroup pTg = new ThreadGroup("Instagram");

		ThreadAny t1 = new ThreadAny();
		ThreadAny t2 = new ThreadAny();
		ThreadAny t3 = new ThreadAny();

		Thread obj1 = new Thread(pTg,t1,"Reels");
		Thread obj2 = new Thread(pTg,t2,"Story");
		Thread obj3 = new Thread(pTg,t3,"DM");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cTg = new ThreadGroup(pTg,"@Threads");

		ThreadAny t4 = new ThreadAny();
		ThreadAny t5 = new ThreadAny();
		ThreadAny t6 = new ThreadAny();

		Thread obj4 = new Thread(cTg,t4,"Repost");
		Thread obj5 = new Thread(cTg,t5,"Trending");
		Thread obj6 = new Thread(cTg,t6,"Repost");

		obj4.start();
		obj5.start();
		obj6.start();
		
			
	}

}