package com.altun.Java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program in Java to display the pattern like right angle triangle with a number.

        System.out.println("Welcome!");
        System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);

        int i, j, n;
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
