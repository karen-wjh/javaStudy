package com.wjh.co.jp.testproject.day_shuzu;
/*访问数组并获取
静态初始化例
访问数组元素格式   数组名称 [索引值]
!!!索引值从0开始  数组长度-1
* */


//
public class shuzu03 {
    public static void main(String[] args) {
        //静态初始化省略模式
        int[] array = {10,20,30};
            

        //System.out.println(array);//直接打印不出结果，出的是内存地址

        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println("===============");

        int num = array[0];
        System.out.println(num);//20
    }
}
