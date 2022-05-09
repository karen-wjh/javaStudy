package com.wjh.co.jp.testproject.aizu6;

import java.util.Scanner;

public class aizu6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arrayA = new int[a];
        for (int i = 0; i < a; i++) {
            arrayA[i]=sc.nextInt();
        }
        for (int i = a-1 ; i >= 0; i--) {
            System.out.print(arrayA[i]);
            if(i == 0){
        break;
        }
        System.out.print(" ");
}
System.out.println();
}
}