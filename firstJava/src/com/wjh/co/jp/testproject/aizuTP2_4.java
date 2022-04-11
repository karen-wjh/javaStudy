
/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/2/ITP1_2_Bpackage com.wjh.co.jp.testproject;
*/

//范围问题

package com.wjh.co.jp.testproject;
import java.util.Scanner;

public class aizuTP2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        } 
    }
}


