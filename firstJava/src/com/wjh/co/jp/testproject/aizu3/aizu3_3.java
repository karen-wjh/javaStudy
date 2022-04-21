//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/3/ITP1_3_C


package com.wjh.co.jp.testproject.aizu3;

import java.util.Scanner;

public class aizu3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int x = sc.nextInt();
       // int y = sc.nextInt();
        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
            break;}
            else if ( x > y ){
                    int num = x ; x = y ; y = num ;
                  }
                  System.out.println( x + " " + y );
            }
        
        
    }
    
}


