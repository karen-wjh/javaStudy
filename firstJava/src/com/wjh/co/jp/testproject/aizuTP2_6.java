package com.wjh.co.jp.testproject;

import java.util.ArrayList;
import java.util.Scanner;

public class aizuTP2_6 {
    public static void main(String[] args) {
        // Scanner sc  =  new Scanner(System.in);
        // int a = sc.nextInt ();
        // int b = sc.nextInt ();
        // int c = sc.nextInt ();
        // int d = sc.nextInt ();
        // int e = sc.nextInt ();
        // int f = sc.nextInt ();
        // int t;
        // if (a>b&&b>c&&c>d){
        
        // }

        int input1 = getInput(4); // 获取前四个数据
        int input2 = getInput(2); // 获取后两个数据
        System.out.print(sumAll(input1) + sumAll(input2));
    }

    private int sumAll(int[] data){

        int sum = 0;
        int min = 0;
        for num in data:
            if num < min : min = num;
            sum = sum + num
        sum = sum - min;
        return sum;

    }

    private  int[]  getInput(int number){
        List<int> output = new ArrayList<>();

        return output;
    }
}
