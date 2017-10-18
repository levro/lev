//4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

package com.wa;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int max;
        int min;

        System.out.println("Input 1st number");
        int one = n.nextInt();
        System.out.println("Input 2nd number");
        int two = n.nextInt();
        System.out.println("Input 3rd number");
        int three = n.nextInt();

        if (one > two){
            max = one;
            if (max < three){
                max = three;
            }
        }
        else {
            max = two;
            if (max < three) {
                max = three;
            }
        }

        if (one > two){
            min = two;
            if (min > three){
                min = three;
            }
        }
        else {
            min = one;
            if (min > three) {
                min = three;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}