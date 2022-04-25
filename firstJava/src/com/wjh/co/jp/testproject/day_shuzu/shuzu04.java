package com.wjh.co.jp.testproject.day_shuzu;
/* 
使用动态初始化
其中元素会自动拥有默认值
整数类型，默认为0
浮点类型，默认为0.0
字符类型，默认为'\u0000'
布尔类型，默认为false
引用类型，默认为null

注意事项
静态初始化也有默认值，系统会把默认值直接替换成大括号当中的具体数值
 */
public class shuzu04 {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("=================");
            //将数据123交给array当中1号元素
        array[1] = 123;
        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//123
        System.out.println(array[2]);//0
    }
    
}



 