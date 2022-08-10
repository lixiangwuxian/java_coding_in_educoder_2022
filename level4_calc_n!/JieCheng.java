import java.util.*;
public class JieCheng {

 public static void main(String[] args) {
 
  int n=10 ;
  int result=1;//阶乘的结果
    
  
  int sum = 0;
  //任务：利用for循环计算10的阶乘,以及1-10的阶乘之和
  for(int i=1;i<=n;i++){
        result*=i;
        sum+=result;
  }
  System.out.println(n+"的阶乘是："+result);
  System.out.println("1+2!+...+n!="+sum);
 }
}