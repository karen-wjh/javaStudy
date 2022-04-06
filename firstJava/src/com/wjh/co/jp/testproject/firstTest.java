package com.wjh.co.jp.testproject;


public class firstTest {
    public static void main(String[] args) throws Exception {
        
       
        // 变量和数据类型 // 向屏幕输出文本:
        System.out.println("Hello, world!");
        
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println(x); // 打印该变量的值
    }
{
定义整型

    int i = 2147483647;
    int i2 = -2147483648;
    int i3 = 2_000_000_000; // 加下划线更容易识别
    int i4 = 0xff0000; // 十六进制表示的16711680
    int i5 = 0b1000000000; // 二进制表示的512
    long l = 9000000000000000000L; // long型的结尾需要加L
}
}

下面是定义浮点数的例子：
float f1 = 3.14f;
float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
double d = 1.79e308;
double d2 = -1.79e308;
double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

//整数运算 求i和n的数值
public class Main {
    public static void main(String[] args) {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
}
}

//可以强制转型，但超出范围的强制转型会得到错误的结果； 适当的用int和long会更能得到结果

public class Main {
    public static void main(String[] args) {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }
}

