package com.wjh.co.jp.testproject.aizu7;
import java.util.Scanner;
public class aizu7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int list1 [][] = new int [a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                list1[i][j] = sc.nextInt();
            }
        }
        int list2 [][] = new int [b][c];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                list2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <c; j++) {
                long sum = 0 ;
                for (int k = 0; k < b; k++) {
                    sum += list1[i][k] * list2[k][j];
                }
                if (j == 0){
                    System.out.print(sum);
                }
                    else{
                        System.out.print(" " + sum);
                }
            }
            System.out.println();
        }
    }
}
