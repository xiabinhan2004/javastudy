package com.day02;
// 题目描述

// 从键盘输入一指定金额（以元为单位，如345），然后输出支付该金额的各种面额的人民币数量，显示100元，50元，20元，10元，5元，1元各多少张，要求尽量使用大面额的钞票。

// 输入
// 一个小于1000的正整数。

// 输出
// 输出分行，每行显示一个整数，从上到下分别表示100元，50元，20元，10元，5元，1元人民币的张数

// 样例输入 Copy
// 735
// 样例输出 Copy
// 7
// 0
// 1
// 1
// 1
// 0

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money = sc.nextInt();
        int yibo = money/100;
        int sheng=money-yibo*100;
        int wushi=sheng/50;
        sheng=sheng-50*wushi;
        int ershi=sheng/20;
        sheng=sheng-20*ershi;
        int shi=sheng/10;
        sheng=sheng-10*shi;
        int wu =sheng/5;
        sheng=sheng-5*wu;
        System.out.println(yibo);
        System.out.println(wushi);
        System.out.println(ershi);
        System.out.println(shi);
        System.out.println(wu);
        System.out.println(sheng);


    }
}
