/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/PCK/Prelim/0317
*/

//蚂蚁搬家问题

package com.wjh.co.jp.testproject;

import java.util.Scanner;

public class aizu3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int D =sc.nextInt();
        int L =sc.nextInt();
       // int y = D / L;
        //int s =D % L /1;
        //System.out.println(y+s)
        System.out.println((D/L)+((D%L)/1));
//两种方法可以写这个运算
    }
}



