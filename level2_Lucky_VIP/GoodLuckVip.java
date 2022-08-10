package level2_Lucky_VIP;

import java.util.*;

/*
 * 使用if-else结构实现幸运抽奖
 */
public class GoodLuckVip {

    public static void main(String[] args) {
        /* 产生随机数 */
        int random = (int) (Math.random() * 10);

        /* 从控制台接收一个4位会员号 */
        System.out.println(" 幸运抽奖\n");
        System.out.print("请输入4位会员号： ");
        Scanner input = new Scanner(System.in);
        int custNo = input.nextInt();

        /* 分解获得百位(将下面的0替换掉) */
        int baiwei = custNo/100%10;

        /* 判断是否是幸运会员 */
        if (baiwei == random) {
            System.out.println(custNo + "是幸运客户，获精美Mp3一个。");
        } else {
            System.out.println(custNo + "  谢谢您的支持！");
        }
    }
}