class DefaultThread {
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		t.setName("First Thread");
		t.setPriority(10);
		System.out.println("After name change: " + t);

		RunnableThread rt = new RunnableThread();
		rt.t.start();

		for(int n=5; n> 0; n--){
			try {
				System.out.println("Going to Sleep " +  n);
				Thread.sleep(1000);
				System.out.println("Awake Now " + n);
			    } catch (InterruptedException e){
				System.out.println("Main thread Interrupted");
			    }
		}

		System.out.println("===========================");
				
	}
}
