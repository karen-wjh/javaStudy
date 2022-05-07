package com.wjh.co.jp.testproject.day_shuzu;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/* 数组元素转换
就是一条数组中对称位置的元素交换，
通常遍历数组只需要一个索引值
现在调换位置需要2个索引值，头尾互相交换
？如何交换两个变量的值
利用第三方交换
int temp = a ;
a = b;
b = temp;利用第三个变量倒手使元素变换位置 */
public class shuzu08 {
    public static void main(String[] args) {
    int[] array ={10,20,30,40,50,60,70,80,90};
    for(int i = 0;i <array.length;i++){
    System.out.println(array[i]);//打印出来的本来的数组，不是倒叙
    }
    System.out.println("==============");
    /* 初始化语句；int min =0,max = array.length-1
    条件判断:min < max
    步进表达:min++  min--
    循环体 :用第三个变量倒手
     */
    for (int min = 0,max = array.length-1 ; min < max ; min++ , max-- ){
        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;
    }
    //再次打印数组交换之后的样子
    for(int i = 0;i <array.length;i++){
        System.out.println(array[i]);
/* 
ps当数组交换时
什么时候停止交换
min==max
min>max
什么时候应该交换
min<max*/
        }
    }
}



