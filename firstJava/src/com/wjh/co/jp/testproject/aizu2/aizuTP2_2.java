/*https://onlinejudge.u- aizu.ac.jp/challenges/sources/PCK/Prelim/0358
*/
//比大小


package com.wjh.co.jp.testproject.aizu2;

import java.util.Scanner;

public class aizuTP2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();
        if (m > b){
            System.out.println("0");
        }else if ((m + f) < b){
            System.out.println("NA");
        }else if (m < b){
            System.out.println(b - m);
        }
        }
    }
    



