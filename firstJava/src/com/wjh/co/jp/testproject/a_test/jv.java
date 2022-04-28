//package com.zl.co.jp.wjhstudy;
package com.wjh.co.jp.testproject.a_test;


import java.util.Scanner;

public class jv {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int[] arrayInt = {3, 5, 6, 7};
        // for (int num : arrayInt){
        //     System.out.println(num);
        // }
        // System.out.println("hello".toUpperCase().equals("Hello, World!".substring(0, 5).toUpperCase()));
        Integer a = 10;
        Integer b = 10;
        Integer c = 1000;
        Integer d = 1000;
        System.out.printf(" %b,  %b \n", a==b, c==d);


        // 定义Input Handle
		System.out.print("请输入最新数据：");
		Scanner sc = new Scanner(System.in);

        // 读取行数
        int lineCnt = sc.nextInt();

        int [][]data = new int[lineCnt][4]; // 数据数组定义
        // 读取数据
        for(int i = 0; i < lineCnt; i ++){
             data[i][0] = sc.nextInt(); // i行价格1
             data[i][1] = sc.nextInt(); // i行价格2
             data[i][2] = sc.nextInt(); // i行票1数量
             data[i][3] = sc.nextInt(); // i行票2数量
        }

        // 计算最优解
        for(int i = 0; i < lineCnt; i ++){
            System.out.println(calcBestAnswer(data[i], 5, 2));
        }

        sc.close();
        return;
    }             

    /**************************************************************
    * 计算最优解
    * 输入 ： lineCnt : 行数；data ： 输入数据； m，n 打折Case
    * 输出 ： 最优解
    **************************************************************/
    private static int calcBestAnswer(int []data, int m, int n){

        //  一Case的价格
        int caseprice =  (int)((data[0] * m + data[1] * n) * 0.8);
        //  已满足多少套
        int caseCnt = Math.min(data[2] / m, data[3] / n);
        
        // 去除满足的caseCnt套后还剩多少张
        data[2] = data[2] - caseCnt * m;
        data[3] = data[3] - caseCnt * n;

        // 剩下的寻找最优解：票1大于m，票2小于n的情况
        if(data[2] > m ){
            // 票1剩余部分拆成两部分
            int cnt1 = data[2] / m; // 除数
            int tkt1 = data[2] % m; // 余数

            // 除数部分取最小值
            int price1 = Math.min(caseprice, data[0] * m) * cnt1;
            // 余数部分取最小值
            int price2 = Math.min(caseprice, data[0] * tkt1);

            //返回最小值
            return caseprice * caseCnt + price1 + price2;

        }else if (data[3] > n){
            // 票2大于n，票1小于m的情况
            int cnt1 = data[3] / n; // 除数
            int tkt1 = data[3] % n; // 余数

            // 除数部分取最小值
            int price1 = Math.min(caseprice, data[2] * n) * cnt1;
            // 余数部分取最小值
            int price2 = Math.min(caseprice, data[2] * tkt1);

            //返回最小值
            return caseprice * caseCnt + price1 + price2;

        }else{
            // 票2小于n，票1小于m的情况
            int price = Math.min(caseprice, data[0] * data[2] + data[1] * data[3]);

            return caseprice * caseCnt + price;
        }
        
    }
}
 