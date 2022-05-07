package com.wjh.co.jp.testproject.day_diaoyong;



/*定义一个方法来求出1-100之间所有的数字和
* */
public class demo01 {
    public static void main(String[] args) {

        System.out.println(sum());
    }

    /*返回值
    * 计算int的数字
    * 方法名称sum*/
    public static int sum(){
        int sum =0;
        for(int i =1; i<= 100;i++){
sum += i;
        }
        return sum;
    }
}
