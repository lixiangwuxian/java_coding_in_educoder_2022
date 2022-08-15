package level17_create_thread_by_runable;


public class MyRunnable implements Runnable{
	//实现run()方法
	public void run(){
		for(int i=1;i<10;i++){	
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
    public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);		
        //启动线程
		myThread.start();
	}
}
