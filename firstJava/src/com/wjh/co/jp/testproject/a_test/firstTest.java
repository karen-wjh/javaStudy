package com.wjh.co.jp.testproject.a_test;

/*
public class firstTest {
    public static void Main(String [] args) {
        
       
        // 变量和数据类型 // 向屏幕输出文本:
        System.out.println("Hello, world!");
        
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println(x); // 打印该变量的值
    }
{//
//定义整型

    int i = 2147483647;
    int i2 = -2147483648;
    int i3 = 2_000_000_000; // 加下划线更容易识别
    int i4 = 0xff0000; // 十六进制表示的16711680
    int i5 = 0b1000000000; // 二进制表示的512
    long l = 9000000000000000000L; // long型的结尾需要加L
}

/*
下面是定义浮点数的例子：
float f1 = 3.14f;
float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
double d = 1.79e308;
double d2 = -1.79e308;
double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

*/
/*

//整数运算 求i和n的数值

    public static void main(String[] args) {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
}
}

//可以强制转型，但超出范围的强制转型会得到错误的结果； 适当的用int和long会更能得到结果


    public static void main(String[] args) {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }

//四舍五入

double d = 2.6;
int n = (int) (d + 0.5);
System.out.println(n);
}
}

//自增自减运算
public static void main(String[]args){
    int n = 3300;
    n++;
    n--;
    int y =100 + (n++)+(n--);
    System.out.println(y);

}
/*
4种类型
n++   n--   ++n   --n 
n++    n=n+1
n--    n=n-1 
++n    n=
--n    n=

char cl＝A
*/
/*
//浮点数运算误差
public class Main{
    public static void main(String[] args){
        double x = 1.0 /10;
        double y = 1 - 0.9 / 10;
        //观察xy是否相等
        System.out.println(x);
        System.out.println(y);
    }
}
/*
Nan    not a number
Infinity  无穷大
-Infinity  负无穷大

pingfang公式 a*a
求和公式 (1+n)*n/2
求平方根Math.sqrt()
*/
/*

public class kadiwh {
    public static void main(String [] args){
        double a = 1.0;
        double b =3.0;
        double c =-4.0;
        double d =( b * b )-(4 * a * c);
        double d1 =Math.sqrt(d);
      
        double e = ((-b+d1) / 2*a );
    double f = ((-b-d1) / 2 * a );
    System.out.println(d);
System.out.println(e );
System.out.println(f);

    }
}


public class kadiwh {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 0.9 / 10;
        //观察xy是否相等
        System.out.println(x);
        System.out.println(y);
    }
}

//求和公式例：

public class kadiwh {
    public static void main (String[] args){
        int n =100;
        int sum = (1+n)*n/2;
        System.out.println(sum);
    }
}

//求根公式

public class kadiwh {
    public static void main(String [] args){
        double a = 1.0;
        double b =3.0;
        double c =-4.0;
        double d =( b * b )-(4 * a * c);
        double d1 =Math.sqrt(d);
      
        double e = ((-b+d1) / 2*a );
    double f = ((-b-d1) / 2 * a );
    System.out.println(d);
System.out.println(e );
System.out.println(f);

    }
}

//三元运算
//判断这个年龄是不是小学生

public class kadiwh{
    public static void main(String[] args){
        int age = 7 ;
       boolean isPrimaryStudent = (age>6 && age <11);

// boolean isprimarystudent = ???;\
   System.out.println(isPrimaryStudent);
}
    }
    
    //字符串连接
    
    public class kadiwh{
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "world";
            String s = s1 + " " + s2 + "!";
            System.out.println(s);
        }
    }  

    */

    //数组类型
/*
    int n1 = 68;
    int n2 = 79;
    int n3 = 91;
    int n4 = 85;
    int n5 = 62;
    */
    /*
    public class firstTest{
        public static void main(String [] agrs){
            String[] names = {"ABC", "XYZ", "zoo"};
            String s = names[0];
            String a = names[1];
            names[0] = "cat";
            names [1] = "hhh";
            System.out.println(s); // ABC
            System.out.println(names[0]);//cat
            System.out.println(a);//XYZ
            System.out.println(names[1]);//hhh
        }
    }
        /*
         int[] ns =new int[5];
         ns [0] = 68;
         ns [1] = 79;
         ns [2] = 91;
         ns [3] = 85;
         ns [4] = 62;
         System.out.println(ns.length);


        }
    }/*?/*/
