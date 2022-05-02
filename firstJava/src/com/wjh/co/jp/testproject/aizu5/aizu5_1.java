package com.wjh.co.jp.testproject.aizu5;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/5/ITP1_5_A
/* 長方形の描画
たてH cm よこ W cm の長方形を描くプログラムを作成して下さい。
1 cm × 1cm の長方形を '#'で表します。
*/
import java.util.Scanner;

public class aizu5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0){
            return;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++)
            {
            System.out.print("# ");
            }
            System.out.println();
           
            }
            System.out.println();
            }
                }
                    }