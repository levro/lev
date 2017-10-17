//5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

package com.wa;

import java.util.Scanner;

public class Dec2bin {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input number in decimal system: ");
        int decemal_num = tm.nextInt();
        int remainder;
        String binary_num = "";

        while (decemal_num >= 1){
            remainder = decemal_num % 2;
            decemal_num = (decemal_num - remainder) / 2;
            binary_num = Integer.toString(remainder) + binary_num;
        }
        System.out.println("In binary system it is: " + binary_num);
    }
}