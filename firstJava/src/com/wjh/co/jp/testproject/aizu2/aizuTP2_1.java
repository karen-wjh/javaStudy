/*https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/2/ITP1_2_A

*/
//问题大小关系

package com.wjh.co.jp.testproject.aizu2;

import java.util.Scanner;
public class aizuTP2_1{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int a =sc.nextInt();
      int b =sc.nextInt();
      
      if (a < b ){
          System.out.println("a < b");
      }else if (a == b){
        System.out.println("a == b");
      }else {
          System.out.println("a > b");
      }
    }
    
}
