package com.wjh.co.jp.testproject.day_shuzu;
/* 求出数组中的最值
最大值和最小值

 */
public class shuzu07 {
    public static void main(String[] args) {
         int[] array = {5,15,25,26,77 ,45,1864,844,9269};  
         
         //min是取最小值
         int max = array[0];//int min = array[0];
         for(int i = 1; i < array.length; i++){
            //如果当前元素大于max，则换下一个
            //当前元素小于min就下一个可以取最小值
            
            if(array[i] > max){    //if(array[i] < min)
                max= array[i];
            }
         }
         //
         System.out.println(max);

    }
    
}
