package com.day02;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String get = sc.next();
        StringBuilder sb=new StringBuilder(get);
        String rev=sb.reverse().toString();
        System.out.println(rev);
    }
}
