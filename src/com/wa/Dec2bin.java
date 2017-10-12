//5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

package com.wa;

import java.util.Scanner;

public class Dec2bin {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input number in decimal system: ");
        int dec = tm.nextInt();
        int rem;
        String bin = "";

        while (dec >= 1){
            rem = dec % 2;
            dec = (dec - rem) / 2;
            bin = Integer.toString(rem) + bin;
        }
        System.out.println("In binary system it is: " + bin);
    }
}