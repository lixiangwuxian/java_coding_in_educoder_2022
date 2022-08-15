package level16_create_mulit_thread;

public class MyThread extends Thread{
    //重写run()方法
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args){
		MyThread thread = new MyThread();
        //启动线程thread
        thread.run();//Should be thread.start()
	}
}

