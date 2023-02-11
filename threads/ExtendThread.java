class ExtendThread {
	public static void main(String[] args){
		NewThread nt = new NewThread();
		nt.start();
		try {
			for(int i=0; i<5 ; i++){
				System.out.println("Main Thread " + i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e){
			System.out.println(" Main Thread Interrupted ");
		}
		System.out.println("Completed the main thread");
	}
}

class NewThread extends Thread {
	NewThread(){
		super("My Thread");
		System.out.println("Thread created " + this);
	}

	public void run(){
		try {
			for(int i=0; i < 5; i++){
				System.out.println("Child Thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted ");
		}
		System.out.println("Child thread completed ");
	}
}
