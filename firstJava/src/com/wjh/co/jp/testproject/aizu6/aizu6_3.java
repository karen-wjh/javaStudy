package com.wjh.co.jp.testproject.aizu6;
import java.util.Scanner;
public class aizu6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       int [][][] array = new int [4][3][10];
        for ( int i = 0; i < a ; i++ ) {
            int b = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;
            int e = sc.nextInt();
            array[b][c][d] += e;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(array[i][j][k]);
                }
            }
            System.out.println();
            }
        
        if( i != 3){
            System.out.println("####################");
        }
    }
}
