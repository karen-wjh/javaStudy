/*https://onlinejudge.u-aizu.ac.jp/challenges/sources/JOI/Prelim/0554
*/

//合计时间问题
package com.wjh.co.jp.testproject.aizu1;

import java.util.Scanner;

public class aizuTP1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = ( a + b + c + d) %  3600 / 60;
        int y = ( a + b + c + d) % 60;
        System.out.println(s);
        System.out.println(y);

    
    }    
}
s