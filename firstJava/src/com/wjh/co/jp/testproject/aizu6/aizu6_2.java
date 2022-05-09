package com.wjh.co.jp.testproject.aizu6;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_B
//扑克牌问题
//4种花色，每种花色13张牌共计52张牌，找出缺失的扑克牌
import java.util.Scanner;

public class aizu6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] array= new int [4][13];
        for (int i = 0; i < a; i++) {
            String b = sc.next();
            int c = sc.nextInt();
            if(b.equals("S")){
                array[0][ c - 1 ] = 1;
            }else if (b.equals("H")){
                array[1][ c - 1 ] = 1;
            }else if(b.equals("C")){
                array[2][ c - 1 ] = 1;
            }else if(b.equals("D")){
                array[3][ c - 1 ] = 1;
            }
        } 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <13; j++) {
                if (array[i][j] == 0){
                  if(i == 0){
                      System.out.print("S"+" "+(j + 1));
                      System.out.println();
                  }else if(i == 1){
                      System.out.print("H"+" "+(j + 1));
                      System.out.println();
                  }else if (i == 2){
                      System.out.print("C"+" "+(j + 1));
                      System.out.println();
                  }else{
                      System.out.print("D"+" "+(j + 1));
                      System.out.println();
                      }
                 }
            }
        }
    }
}
