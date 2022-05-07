package com.wjh.co.jp.testproject.day_shuzu;
/*数组遍历
对数组中每一个元素进行打印输出

  */

public class shuzu06 {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,7,8,3,6,2};
        //原始方式，一个一个输出需要手动加行
        System.out.println(array[0]);//
        System.out.println(array[1]);//
        System.out.println(array[2]);//
        System.out.println(array[3]);//
        System.out.println(array[4]);//
        System.out.println("==============");

        //使用循环 for循环但是需要更改数字长度
        for (int i = 0; i < 5; i++) {
          System.out.println(array[i]);
        } 
        System.out.println("==============");
      
          //输入数组长度array，length  不需要自己手动改长度，直接打印就能出数字
          
        for (int i = 0; i < array.length; i++) {
         
        System.out.println(array[i]); 
        }
    }




}
