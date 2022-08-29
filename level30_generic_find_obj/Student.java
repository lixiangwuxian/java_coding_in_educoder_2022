package level30_generic_find_obj;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String name; // 学员姓名
	private String sex; // 学员性别

	public Student() {
	}

	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		// 1、创建学员对象
		Student student1 = new Student("李明", "男");
		Student student2 = new Student("刘丽", "女");
		// 2、创建保存“键-值对”的集合对象
		Map<String, Student> students = new HashMap<String, Student>();
		// 3、把英文名称与学员对象按照“键-值对”的方式存储在HashMap中
		students.put("Jack", student1);
		students.put("Rose", student2);
		// 4、打印键集
		System.out.println("键集：" + students.keySet());
		// 5、打印值集
		System.out.println("值集：" + students.values());
		// 6、打印键-值对集合
		System.out.println("键-值对集合:" + students);

		String key = "Jack";
		// 任务一：判断是否存在”Jack”这个键，将下列注释写在判断语句中并恢复
		if(students.containsKey(key)){
			// 8、如果存在，根据键获取相应的值
			Student student = students.get(key);
			System.out.println("学员姓名：" + student.getName());
		}
		
	}
}
