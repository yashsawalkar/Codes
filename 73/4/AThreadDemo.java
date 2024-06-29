class ThreadAny extends Thread{
	
	ThreadAny(ThreadGroup tg, String str){
		
		super(tg,str);
	}
	

	public void run(){
		
		System.out.println(Thread.currentThread().getName());
	
	}

}

class AThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadGroup tg = new ThreadGroup("Instagram");
		
		ThreadAny t1 = new ThreadAny(tg, "Reels");
		t1.start();

		ThreadAny t2 = new ThreadAny(tg, "DM");
		t2.start();

		ThreadAny t3 = new ThreadAny(tg, "Story");
		t3.start();

		ThreadGroup tgChild = new ThreadGroup(tg, "@Threads");

		ThreadAny t4 = new ThreadAny(tgChild, "Repost");
		t4.start();

		ThreadAny t5 = new ThreadAny(tgChild, "Comment");
		t5.start();

		ThreadAny t6 = new ThreadAny(tgChild, "Tag");
		t6.start();

		Thread.sleep(1);

		System.out.println(tg.activeCount());

		System.out.println(tg.activeGroupCount());

					
	}

}