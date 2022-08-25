
package level21_sync_code_block;

public class SiteDemo2 implements Runnable {
	private int count = 10; // 记录剩余票数
	private int num = 0; // 记录买到第几张票

	public void run() {
		while (true) {
			// 同步代码块
			synchronized (this) {
				// 任务一：没有余票时，跳出循环
				if (count <= 0) {
					break;
				}
				// 任务二：第一步：修改数据
				try {
					Thread.sleep(500); // 模拟网络延时
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				num++;
				count--;
				// 第二步：显示信息
				System.out.println(Thread.currentThread().getName() + "抢到第"
						+ num + "张票，剩余" + count + "张票！");
			}
		}
	}

	public static void main(String[] args) {
		SiteDemo2 site = new SiteDemo2();
		Thread person1 = new Thread(site, "桃跑跑");
		Thread person2 = new Thread(site, "抢票代理");
		Thread person3 = new Thread(site, "黄牛党");
		System.out.println("********开始抢票********");
		person1.start();
		person2.start();
		person3.start();
	}
}
