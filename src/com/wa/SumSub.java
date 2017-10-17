//4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

package com.wa;

import java.util.Scanner;

public class SumSub {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.println("Input 1st number");
        int one = tm.nextInt();
        System.out.println("Input 2nd number");
        int two = tm.nextInt();

        if (one > two){
            int result = one - two;
            System.out.println(one + " - " + two + " = " + result);
        } else {
            if(one < two){
                int result = one + two;
                System.out.println(one + " + " + two + " = " + result);
            } else {
                System.out.println(one + " = " + two);
            }
        }
    }
}
