package level3_Lucky_Num;

import java.util.Scanner;

public class GoodLuck {
 /*
  * 幸运抽奖
  */
public static void main(String[] args) {
  int custNo; // 客户会员号（说明：customer---客户）
  System.out.println("请输入4为会员卡号：");
  Scanner input = new Scanner(System.in);
  custNo = 0 ;
  custNo=input.nextInt();
  int tmpcustNo=custNo;
  int gewei = 0;
  int shiwei = 0;
  int baiwei = 0;
  int qianwei =0;
  gewei=tmpcustNo%10;
  tmpcustNo/=10;
  shiwei=tmpcustNo%10;
  tmpcustNo/=10;
  baiwei=tmpcustNo%10;
  tmpcustNo/=10;
  qianwei=tmpcustNo%10;
  // 计算数字之和
  int sum = gewei + shiwei + baiwei + qianwei;
  System.out.println("会员卡号" + custNo + "各位之和： " + sum);
  boolean isLuck=sum>20;
  System.out.println("是幸运客户吗？" +isLuck);
  input.close();
 }
}