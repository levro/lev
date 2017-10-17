//4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

package com.wa;

import java.util.Scanner;

public class Seven_div {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Input number");
        int num = n.nextInt();

        if (num % 7 == 0){
            System.out.println(num + " * 2 = " + num * 2);
        }
    }
}