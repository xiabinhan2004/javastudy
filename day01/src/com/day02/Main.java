package com.day02;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int[] x = new int[4];
            int[] y = new int[4];

            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            double area = 0;

            for (int i = 0; i < 4; i++) {
                int j = (i + 1) % 4;
                area += x[i] * y[j] - x[j] * y[i];
            }   
    

            area =  Math.abs(area) / 2;
            System.out.printf("area = %.4f%n", area);
        }
    }


}

