package com.wjh.co.jp.testproject.aizu7;

import java.util.Scanner;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_A

public class aizu7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if( m==-1 && f==-1 && r==-1 ){
                return;
            }
        if(( m + f ) >= 80){
            System.out.println("A");
        }else if ((m+f)<80&& (m+f)>=65){
            System.out.println("B");
        }else if((m+f)>=50 && (m+f)<65){
            System.out.println("C");
        }else if( m==-1 ||f ==-1 || (m+f)<30){
            System.out.println("F");
        }else if((m+f)>=30 && (m+f)<50){
            if(r>=50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
          }
        }
    }
}