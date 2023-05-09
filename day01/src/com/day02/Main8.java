package com.day02;
import java.util.Scanner;
public class Main8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double xa = sc.nextDouble();
            double ya = sc.nextDouble();
            double xb = sc.nextDouble();
            double yb = sc.nextDouble();
            double distance = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
            System.out.printf("%.3f", distance);
        }
    }

