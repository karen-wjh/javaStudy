package com.wjh.co.jp.testproject.aizu7;

import java.util.Scanner;

public class aizu7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(n == 0 && x == 0){
            return;
        }
        int count=0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1 ; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if( (i + j + k) == x){
                        count++;  
                    }
                   }
                }
             }System.out.println(count);
         }  
    }
}
