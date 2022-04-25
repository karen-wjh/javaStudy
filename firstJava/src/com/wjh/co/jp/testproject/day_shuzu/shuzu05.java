package com.wjh.co.jp.testproject.day_shuzu;
/* 获取数组长度
格式
数组名称。length
这会得到一个int 数字代表长度
数组创建之后，运行程序期间不可以改变长度 */
public class shuzu05 {
    public static void main(String[] args) {
        int[] arrayA = {7,9,4,5,1,76,84,53,78,99,43,124,67,85};
        int len = arrayA.length;
        System.out.println("長さは " + len);
    
    }
}