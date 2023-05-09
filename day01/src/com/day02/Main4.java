package com.day02;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candies = new int[5];
        for (int i = 0; i < 5; i++) {
            candies[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int giveAway = candies[i] / 3;
            int duo=candies[i]%3;
            candies[i] -= giveAway * 2+duo;
            candies[(i + 1) % 5] += giveAway;
            candies[(i + 4) % 5] += giveAway;
        }


         for (int i = 0; i < 5; i++) {
             System.out.print(candies[i]+ " ");
         }
    }
}