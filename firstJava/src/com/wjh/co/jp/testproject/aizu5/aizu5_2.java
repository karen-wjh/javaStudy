package com.wjh.co.jp.testproject.aizu5;
/* https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/5/ITP1_5_B
フレームの描画
 */
import java.util.Scanner;

public class aizu5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0){
                return;
            }for (int i = 0; i < H ; i++) {
                for (int j = 0; j < W; j++) {
                if(i ==0 || i == H-1){
                    System.out.print("#");
                }else if(j == 0 || j == W-1){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
                    }System.out.println();
                }System.out.println();
            }
        }
    }
