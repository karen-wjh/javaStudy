package com.wjh.co.jp.testproject.aizu4;
/* n個の整数 
ai(i=1,2,...n)を入力し、それらの最小値、最大値、合計値を求めるプログラムを作成してください */
//最小値、最大値、合計値を空白区切りで１行に出力してください。
//https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_D
import java.util.Scanner;

public class aizu4_4 
{
    public static void main(String[] args) 
    {
        //创建一个数组因为不知道具体内容用动态初始化
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
         array[i] = sc.nextInt(); 
        }
        int max = array[0];
        for(int i = 1; i < n; i++)
        {
            if(array[i] > max)
            {  
                max= array[i];
            }
        }
        int min = array[0];
        for(int i = 1; i < n; i++)
        {
            if(array[i] < min)
            {
                min= array[i];
            }
        }
        long sum = 0 ;
        for (int i = 0; i < n; i++) {
            sum += array[i]; 
        }
    
        System.out.print(min+" ");
        System.out.print(max+" ");
        System.out.println(sum);
    }
}
                
