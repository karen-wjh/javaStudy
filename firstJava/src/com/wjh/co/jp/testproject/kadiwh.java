package com.wjh.co.jp.testproject;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/*
public class kadiwh {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 0.9 / 10;
        //观察xy是否相等
        System.out.println(x);
        System.out.println(y);
    }
}
*/
//求和公式例：
/*
public class kadiwh {
    public static void main (String[] args){
        int n =100;
        int sum = (1+n)*n/2;
        System.out.println(sum);
    }
}
*/
//求根公式
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
*/
//三元运算
//判断这个年龄是不是小学生
/*
public class kadiwh{
    public static void main(String[] args){
        int age = 7 ;
       boolean isPrimaryStudent = (age>6 && age <11);

// boolean isprimarystudent = ???;\
   System.out.println(isPrimaryStudent);
}
    }
    */
    //字符串连接1
/*
    public class kadiwh{
        public static void main(String[] args) {
        
            String s1 = "Hello";
            String s2 = "world";
            String s = s1 + " " + s2 + "!";
            System.out.println(s);
        }
    }  
*/
//字符串连接2
/*
public class kadiwh {
    public static void main(String[] args) {
        int age = 25;
        String s = "age is " + age;
        System.out.println(s);
    }
} 
*/
/*
public class kadiwh  {
    public static void main(String[] args) {
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}
//t =hello

*/
public class kadiwh {
    public static void main(String[] args) {
        int a = 65;
        int b = 66;
        int c = 67;
      //  String s ="72"+" "+"105"+" " +"65281";
 // FIXME:
        String str1 = "\u0065\u0066\u0067";
        StringBuffer str2 = new StringBuffer();
        str2.append((char)a);
        str2.append((char)b);
        str2.append((char)c);
        //String s = a + b + c;
        System.out.println(str1);
        System.out.println(str2);
    }
}
