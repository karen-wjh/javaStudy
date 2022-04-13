package com.wjh.co.jp.testproject.test;

public class test6{
  
  /*  public static void main(String[] args){
        int n = 3300;
        int y =30;
        double z =336 % 78;
      double  m =(n + y /z);
        System.out.println(m);
      }
}
*/

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

