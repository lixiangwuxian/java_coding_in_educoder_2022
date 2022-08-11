package level7_get_min_price;

import java.util.*;

public class MinPrice {
    public static void main(String[] args) {
        /**
         * 输出最低价格
         */

        int[] prices = { 34, 67, 24, 15 };

        // 计算最低价
        int min = prices[0];
        // 计算最低价格赋值给min
        for (int i = 1; i < 4; i++) {
            if(min>prices[i]){
                min=prices[i];
            }
        }

        System.out.println("最低价格是：" + min);
    }
}