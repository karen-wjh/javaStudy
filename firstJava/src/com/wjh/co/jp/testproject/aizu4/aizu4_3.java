package com.wjh.co.jp.testproject.aizu4;
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_C
//計算機問題
/* 
２つの整数 a, b と１つの演算子 op を読み込んで、a op b を計算するプログラムを作成して下さい。
ただし、演算子 op は、"+"(和)、"-"(差)、"*"(積)、"/"(商)、のみとし、
割り算で割り切れない場合は、小数点以下を切り捨てたものを計算結果とします。
 */
import java.util.Scanner;

public class aizu4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            char op = sc.next().charAt(0);
            int b = sc.nextInt();

        if(op == '+'){
            System.out.println(a+b);
        }else if (op == '-'){
            System.out.println(a-b);
        }else if(op =='*'){
            System.out.println(a*b);
        }else if (op =='/'){
            System.out.println(a/b);
        }else if(op == '?'){
           break;
           }
           else {
           System.out.println("Error");
    }
           }
                }
                    }
