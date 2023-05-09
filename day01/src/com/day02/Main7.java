package com.day02;
import java.util.Scanner;
public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double rad = Math.toRadians(n);
        System.out.printf("%.3f %.3f", Math.sin(rad), Math.cos(rad));
    }
}

