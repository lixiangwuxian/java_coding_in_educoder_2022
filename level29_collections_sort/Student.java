package level29_collections_sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable {
	private int number = 0; // 学号
	private String name = ""; // 学生姓名
	private String gender = ""; // 性别

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int compareTo(Object obj) {
		Student student = (Student) obj;
		if (this.number == student.number) {
			return 0; // 如果学号相同，那么两者就是相等的
		} else if (this.number > student.getNumber()) {
			return 1; // 如果这个学生的学号大于传入学生的学号
		} else {
			return -1; // 如果这个学生的学号小于传入学生的学号
		}
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setNumber(5);
		Student student2 = new Student();
		student2.setNumber(2);
		Student student3 = new Student();
		student3.setNumber(1);
		Student student4 = new Student();
		student4.setNumber(4);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		System.out.println("-------排序前-------");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.println(stu.getNumber());
		}
		// 使用Collections的sort方法对list进行排序
		System.out.println("-------排序后-------");
		Collections.sort(list);
		iterator = list.iterator();
        //任务一：调用while循环输出排序后的结果
		while(iterator.hasNext()){
			Student stu = iterator.next();
			System.out.println(stu.getNumber());
		}
	}

}

