package com.wjh.co.jp.testproject.aizu2;

import java.util.Arrays;
import java.util.Scanner;

public class aizuTP2_7 {
    private static int sum1 = 0;

    private int sum2 = 0;

    public static void main(String[] args) {
         Scanner sc  =  new Scanner(System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        int c = sc.nextInt ();
        int d = sc.nextInt ();
        int e = sc.nextInt ();
        int f = sc.nextInt ();
        // if(e<f){
        //     t=e;e=f;f=t;
        // }
        int max = 0;
        max = e > f ? e:f;//做判断，判断谁比较大如果e比较大max就是e的值，反之就是f比较大max就是发的值

        int[] ns ={a,b,c,d};
        Arrays.sort(ns);
        int sum = 0;
        for(int i = 1; i < 4; i++){
            sum = sum + ns[i]; 
          // System.out.println(i);
        }
        // System.out.println(i);
        System.out.println(max + sum);
       // System.out.println (Arrays.toString(ns));
    
    }

    //private void setSum1(){
        //this.sum1 = 1;
    }
    
//}
