//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/3/ITP1_3_D
//求余数问题


package com.wjh.co.jp.testproject.aizu3;

import java.util.Scanner;
public class aizu3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int y = 0;
            for(int x =a ; x <= b ; x++){
                if(c % x == 0) {
                    y++;
                }
            }
            System.out.println(y);
        
    }
            
    }
    

