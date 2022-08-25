package level20_thread_comity;
public class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
            if(i==3){
                System.out.print("线程礼让：");
                //请调用线程礼让方法
               Thread.yield();
            }
        }
    }
        public static void main(String[] args) {
       System.out.println("*****线程的礼让*****");
       MyThread my = new MyThread();
       Thread t1 = new Thread(my,"线程A");		
       Thread t2 = new Thread(my,"线程B");
       t1.start();
       t2.start();
   }
}


