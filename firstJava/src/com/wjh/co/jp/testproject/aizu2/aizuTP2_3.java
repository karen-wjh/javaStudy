/ * https://onlinejudge.u - aizu.ac.jp/challenges/sources/JOI/Prelim/0630
 * /
//微波炉问题

package com.wjh.co.jp.testproject.aizu2;

import java.util.Scanner;

public class aizuTP2_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        if (A < 0){
            System.out.println((0  -  A) * C + D + (B - 0) * E);
        } else if (A == 0 ){
            System.out.println(D + (B - 0) * E);
        }else  if(A > 0){
            System.out.println((B - A) * E);
        } 
    }
}
