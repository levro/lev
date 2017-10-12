//4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
//     (целую часть от деления  и остачу)
//     в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

package com.wa;

import java.util.Scanner;

public class OneDivTwo {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.println("Input 1st number");
        int one = tm.nextInt();
        System.out.println("Input 2nd number");
        int two = tm.nextInt();

        if (one < two){
            int tmp = one;
            one = two;
            two = tmp;
        }
        int remainder = one % two;
        int quotient = (one - remainder) / two;

        System.out.println(remainder == 0);
        System.out.println(one + " / " + two + " = " + quotient + " and " + remainder + " in the remainder");
    }
}