package com.wjh.co.jp.testproject.aizu4;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_B


import java.util.Scanner;

public class aizu4_2 {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            double r = num.nextDouble();
            double a = r*r*3.141592653589;
            double b = 2*r*3.141592653589;
            System.out.printf("%.6f",a);
            System.out.print(" ");
            System.out.printf("%.6f",b);
        }

    }
    
}
