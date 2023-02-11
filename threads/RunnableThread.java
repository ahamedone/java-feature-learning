class RunnableThread implements Runnable {
	Thread t;
	RunnableThread(){
		t = new Thread(this);
		System.out.println("Runnable thread created : " + t);
	}

	public void run(){
		try {
			for(int i =5; i > 0 ; i--) {
				System.out.println("Runnable thread : " + t + "Loop :" + i);
				Thread.sleep(500); 
			}
		} catch(InterruptedException e) {
			System.out.println("Child interrupted. ");
		}
		System.out.println("Completed the thread run : " + t);		
	}

}
