//4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

package com.wa;

import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.println("Input 1st number");
        int one = tm.nextInt();
        System.out.println("Input 2nd number");
        int two = tm.nextInt();
        int sum = one + two;

        if (sum >= 11 && sum <= 19){
            System.out.println(one + " + " + two + " = " + sum + " is in the range from 11 to 19");
        }
    }
}