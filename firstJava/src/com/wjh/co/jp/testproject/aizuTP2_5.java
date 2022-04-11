/*https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/2/ITP1_2_C
/*/


//３つの整数を読み込み、それらを値が小さい順に並べて出力するプログラムを作成して下さい。


/*
package com.wjh.co.jp.testproject;

import java.util.Scanner;

public class aizuTP2_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&b>c){
            System.out.println(a+" "+ b+" "+ c);
        }else if(a>b&&c>b){
            System.out.println(a+" "+ c+" "+ b);
        }else if (b>a&&a>c){
            System.out.println(b+" "+ a+" "+ c);
        }else if (b>c&&c>a){
            System.out.println(b+" "+ c+" "+ a);
        }else if (c>a&&a>b){
            System.out.println(c+" "+ a+" "+ b);
        }else if (c>b&&b>a){
            System.out.println(c+" "+ b+" "+ a);
        }

    }
}




*/
//第二种解法
package com.wjh.co.jp.testproject;
import java.util.Scanner;

public class aizuTP2_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t;

        if ( a > b ){
            t = a; a = b; b = t;
        }
        if ( b > c ){
            t = b; b = c; c = t;
        }
        if ( a > b ){
            t = a; a = b; b = t;
        }
        System.out.println(a + " " + b + " " + c);
    }
}