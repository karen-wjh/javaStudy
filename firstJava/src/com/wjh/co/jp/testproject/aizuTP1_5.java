/* 
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/1/ITP1_1_C 
*/
//计算长方形面积和周长


package com.wjh.co.jp.testproject;

import java.util.Scanner;

//import java.util.Scanner;
public class aizuTP1_5{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int s =a *b;
        int p =2 *(a+b);
        System.out.println(s+" "+p);
    }
}

