package level5_learn_switch;

import java.util.*;
public class SwitchDemo{
    public static void main(String[] args) {
        int mingCi = 3;  //名次
        switch (mingCi){
            case 1:
                System.out.println("奖励1万元");
                break;
            case 2:
                System.out.println("奖励hp笔记本一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一部");
                break;
            // 在下面填写第三名的奖励“奖励移动硬盘一部”
            default:
                System.out.println("没有任何奖励");
        }
    }
}