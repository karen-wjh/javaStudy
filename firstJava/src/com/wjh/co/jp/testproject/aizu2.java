/*https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/1/ITP1_1_D
*/
//已知秒数和求时间对应的 时分秒

package com.wjh.co.jp.testproject;

import java.util.Scanner;

public class aizu2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int S =sc.nextInt();
        int h =S / 3600;
        int m =S % 3600 / 60;
        int s =S % 60;
        System.out.println(h +":"+m +":" +s);
    }
}