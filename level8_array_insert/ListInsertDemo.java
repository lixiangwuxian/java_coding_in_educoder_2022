package level8_array_insert;

import java.util.*;

public class ListInsertDemo {
    public static void main(String[] args) {

        int[] list = new int[6]; // 长度为为6的数组
        list[0] = 99;
        list[1] = 85;
        list[2] = 82;
        list[3] = 63;
        list[4] = 60;

        int index = list.length; // 保存新增成绩插入位置
        int num = 70; // 输入要插入的数据
        // 任务一：完成找到新元素的插入位置
        for(int i=4;i>=0;i--){
            if(list[i]>num){
                index=i+1;
                break;
            }
        }
        // 任务二：完成元素后移
        for(int i=4;i>=index;i--){
            list[i+1]=list[i];
        }
        list[index] = num;// 插入数据
        System.out.println("插入成绩的下标是：" + index);
        System.out.println("插入后的成绩信息是： ");
        for (int k = 0; k < list.length; k++) { // 循环输出目前数组中的数据
            System.out.print(list[k] + ",");
        }

    }
}