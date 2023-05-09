package com.day02;
import java.util.Scanner;
import java.lang.Math;
public class Main6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();
        double v = Math.PI * r * r * h;
        int tong = (int) Math.ceil(20000 / v);
        System.out.println(tong);
    }
}

