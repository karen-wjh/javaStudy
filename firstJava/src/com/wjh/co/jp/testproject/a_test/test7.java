package com.wjh.co.jp.testproject.a_test;

public class test7 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int second = 0; second < 60; second++) {
                    System.out.println(hour + "," + min + "," + second + ".");
                }
            }
        }
    }
}
