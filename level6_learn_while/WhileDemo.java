package level6_learn_while;

import java.util.Scanner;

public class WhileDemo {

    /*
     * 如何使用while循环
     */
    public static void main(String[] args) {
        String answer; // 标识是否合格
        Scanner input = new Scanner(System.in);
        System.out.print("合格了吗?(y/n)：");
        answer = "y";// 默认起始输入为y
        String st = "y"; // 此处为比较条件
        // 如果answer的结果不为y则利用while完成如下循环
        while (!st.equals(answer)) {
            System.out.println("上午阅读教材！");
            System.out.println("下午上机编程！\n");
            System.out.print("合格了吗?(y/n)：");
            answer = "y";
        }
        System.out.println("完成学习任务！");
    }
}