package level14_use_interface;

/**
 * USB接口。
 */
interface UsbInterface {
	/**
	 * USB接口提供服务。
	 */
	void service();
}
/**
 * USB风扇。
 */
class UsbFan implements UsbInterface {
	public void service() {
		System.out.println("连接USB口，获得电流，风扇开始转动。");
	}
}
/**
 * U盘。
 */
class UDisk implements UsbInterface {
	public void service() {
		System.out.println("连接USB口，开始传输数据。");
	}
}
public class UsbInterfaceTest {	
	public static void main(String[] args) {
		
        UsbInterface uDisk = null;
		// 任务一：使用接口对象uDisk完成对U盘的实例化
		//1、U盘
		uDisk=new UDisk();
		uDisk.service();
		
        UsbInterface usbFan=null;
		// 任务二：使用接口对象usbFan完成对风扇的实例化
		//2、USB风扇
		usbFan=new UsbFan();
		usbFan.service();
	}
}
