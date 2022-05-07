package com.wjh.co.jp.testproject.day_diaoyong;
/*比较数据是否相等
* 参数分别为两个byte，两个short，两个int，两个long类型
* 并在main方法中进行测试*/

public class demo04 {
    public static void main(String[] args) {  //main方法然后自定义
        byte a = 10;
        byte b = 20;
        System.out.println(issame(a,b));
        System.out.println(issame((short) 20,(short) 20));
        System.out.println(issame(12,45));
        System.out.println(issame(10L,30L));

    }

    public static boolean issame(byte a, byte b) {
        System.out.println("zhixing byte");
        boolean same;
        if (a == b) {
        same=true;
        }
        else{
            same=false;
        }
        return same;
    }
    public static boolean issame(short a,short b){
        System.out.println("zhixing short");
        boolean same= a == b? true: false;
        return same;
    }
    public static boolean issame(int a ,int b){
        System.out.println("zhixing int");
        return a ==b;
    }
    public static boolean issame(long a , long b){
        System.out.println("zhixing long");
        if (a == b){
            return true;
        }
        else{
            return false;
        }
    }
}
