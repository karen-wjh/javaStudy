package com.wjh.co.jp.testproject.day_shuzu;
/*静态数组 , 静态初始化
在创建数组的时候，不指定数据个数多少，而是将数据内容进行指定
基本格式:
数据类型[] 数组名称 = new 数据类型[]{ 元素1, 元素2, 元素3}
省略格式
数据类型[] 数组名称 ={ 元素1, 元素2, 元素3}     这个也是正确的
注意事项
1，静态初始化不指定长度，但是会自己推算出长度
2，静态初始化可以拆分为两个步骤
3，动态初始化也可以拆分2 个步骤
4，静态初始化使用省略格式不能拆分为两个步骤
使用建议
如果不确定数组的具体内容，用动态初始化
否则已经确定具体内容，用静态初始化
*/
public class shuzu02 {
    public static void main(String[] args) {
        //创建一个数组是，里面是int数字，具体为5 15 25
        //基本格式的静态初始化
        int[] arrayA = new int[]{5,15,25};
        //创建一个数组，用来装字符串 hello world
        //静态初始化的省略格式
        String[] arrayB ={"hello","world"};
        //静态初始化的标准格式，可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[]{11, 12, 13 };
        //3，动态初始化也可以拆分2 个步骤
        int[] arrayD;
        arrayD= new int[7];

    }
}
