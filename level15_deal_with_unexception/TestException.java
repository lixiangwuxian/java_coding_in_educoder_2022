package level15_deal_with_unexception;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		System.out.print("请输入课程代号(1～3之间的数字):");
		Scanner in = new Scanner(System.in);
		try {
			int courseCode = in.nextInt();//this line must be line 10
			// 任务：对courseCode进行异常处理
			// 如果捕获异常，则输出“输入不为数字!”，无论如何最后要输出"欢迎提出建议!"
			switch (courseCode) {
				case 1:
					System.out.println("C#编程");
					break;
				case 2:
					System.out.println("Java编程");
					break;
				case 3:
					System.out.println("SQL基础");
			}
		} catch (Exception e) {
			System.out.println("输入不为数字!");
			e.printStackTrace();
		} finally {
			System.out.println("欢迎提出建议!");
		}

	}
}
