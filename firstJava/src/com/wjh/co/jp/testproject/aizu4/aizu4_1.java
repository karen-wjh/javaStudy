package com.wjh.co.jp.testproject.aizu4;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_A

//混合演算
//取整，取余，浮点数
import java.util.Scanner;

public class aizu4_1 {
    public static void main(String[] args) {
    try (Scanner num = new Scanner(System.in)) {
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.print(a / b +" " );
        System.out.print(a % b + " ");
     //  System.out.println("============");
       System.out.printf("%.5f" ,((double)a / (double) b) );
    }
}
    }
