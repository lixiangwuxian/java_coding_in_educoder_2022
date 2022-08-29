import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {

		/* 1、创建多个狗狗对象 */
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		/* 2、创建Map集合对象并把多个狗狗对象放入其中 */
		Map dogMap = new HashMap();
		dogMap.put(ououDog.getName(), ououDog);
		dogMap.put(yayaDog.getName(), yayaDog);
		dogMap.put(meimeiDog.getName(), meimeiDog);
		dogMap.put(feifeiDog.getName(), feifeiDog);
		/* 3、通过迭代器依次输出集合中所有狗狗的信息 */
		System.out.println("使用Iterator遍历，所有狗狗的昵称和品种分别是：");
		Set keys = dogMap.keySet();// 取出所有key的集合
		Iterator it = keys.iterator();// 获取Iterator对象
		while (it.hasNext()) {
			String key = (String) it.next(); // 取出key
			Dog dog = (Dog) dogMap.get(key); // 根据key取出对应的值
			System.out.println(key + "\t" + dog.getStrain());
		}
		// 任务一：使用foreach语句输出集合中所有狗狗的信息

		for (Object i : dogMap.values()) {
			System.out.println(((Dog) i).getName() + '\t' + ((Dog) i).getStrain());
		}
	}
}