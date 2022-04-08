package com.wjh.co.jp.testproject;

import javax.net.ssl.SSLSessionBindingListener;

//短路运算
public class test4{
  
  
  /*  public static void main(String[] args){
        boolean b =5 < 3 ;
        boolean result = b && (5 / 0 > 0);
    System.out.println(result);
    }
}
*/

public static void main(String[] args){
  double d = 3.1415926;
  int n = 12345000;
  System.out.printf("%.2f\n", d); // 显示两位小数3.14
  System.out.printf("%.4f\n", d); // 显示4位小数3.1416
  System.out.printf("%.5f\n", d); //3.14159
  System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个
 
}
}
