package com.wjh.co.jp.testproject.test;

import java.util.Scanner;

public class he11 {
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
