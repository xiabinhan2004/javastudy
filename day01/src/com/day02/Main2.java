package com.day02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext())
        {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double du = Math.acos((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c));
        // double cosa = (Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c);
        // double sina = Math.sqrt(1-(cosa*cosa));
        double r=(a/2)/Math.sin(du);
        // double r = a/2*sina;
        System.out.printf("%.2f\n", Math.PI * r * r);
        }
    }
}
// 题目描述
// 已知三角形三条边长L1，L2，L3(均为浮点型数据，均从键盘输入)，求其外接圆的面积。提示：L1为∠1所对边，利用公式R=(L1/2)/sin∠1求外接圆半径，其中∠1可通过余弦定理求得。

// 输入
// 有多组测试数据，每组测试数据有三个浮点型数据L1，L2，L3.

// 输出
// 每组测试数据输出占一行，每行一个浮点型数据，即面积，要求保留两位小数。

// 样例输入 Copy
// 2 3 4
// 4 5 6
// 1 2 2
// 样例输出 Copy
// 13.40
// 28.72
// 3.35