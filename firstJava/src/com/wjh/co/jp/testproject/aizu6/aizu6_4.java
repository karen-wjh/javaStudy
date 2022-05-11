package com.wjh.co.jp.testproject.aizu6;

import java.util.Scanner;


public class aizu6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
            array [i][j] = sc.nextInt();
            }
        }
        int [] arrayA =new int [b];
        for (int i = 0; i < b; i++) {
            arrayA [i] =sc.nextInt(); 
        }
        int num;
        for (int i = 0; i < a; i++) {
            num =0;
            for (int j = 0; j < b; j++) {
                num += array[i][j] * arrayA[j];
            }
            System.out.println(num);
        }
    }
}

