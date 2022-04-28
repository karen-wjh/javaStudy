package com.wjh.co.jp.testproject.aizu3;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class aizu3_55 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);	
    int n = sc.nextInt();
    for( int i=0 ; i<n; i++ ){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int s = x*b + y*p;
      //  b = Math.max(b, 5);
      //  p = Math.max(p, 2);
        int t = x * b + y * p;
        int q = x*5 + y* 2;
        if(b > 5 && p > 2){
            System.out.println((b-5) *x + (p-2) * y + q * 8 / 10);
        }else if (b > 5 && p < 2 ){
            int sum1 = b * x + p * y ;
            int sum2 = q * 8 / 10 + (b-5)*x;
            System.out.println(Math.min(sum1,sum2));
        }else if(b < 5 && p > 2 ){
            int sum1 = b * x + p * y ;
            int sum2 = q * 8 / 10 + (p-2)*y;
            System.out.println(Math.min(sum1,sum2));
        }else if ( b < 5 && p < 2 ){
            int sum1 = b * x + p * y ;
            System.out.println(Math.min(q * 8 / 10, sum1));
        }else {
            System.out.println(q * 8 / 10);
        }
        //System.out.println((int)Math.min(s,t*0.8));   
    }
}
}