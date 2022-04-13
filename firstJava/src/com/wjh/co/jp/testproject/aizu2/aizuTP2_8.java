https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/2/ITP1_2_D

//长方形中的圆在不在长方形里面
//如果在长方形里面就是yes 否则就是no



package com.wjh.co.jp.testproject.aizu2;

import java.util.Scanner;

public class aizuTP2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if ( 0 <= x - r && x + r <= W && 0 <= y - r && y + r <= H ){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}
