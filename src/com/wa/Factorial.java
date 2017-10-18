//5.2. Вычислить факториал числа.

package com.wa;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = tm.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println(num + "! = " + factorial);
    }
}