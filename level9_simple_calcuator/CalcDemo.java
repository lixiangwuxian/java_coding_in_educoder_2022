package level9_simple_calcuator;

public class CalcDemo {
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public double getSum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        // 利用面向对象技术完成任务一、二
        // 任务一：计算67+89之和
        // 任务二：计算67+89+78.4之和      
        //System.out.println("任务1");
        System.out.println(new CalcDemo().getSum(67, 89));
        //System.out.println("任务2");
        System.out.println(new CalcDemo().getSum(67, 89, 78.4));
    }
}