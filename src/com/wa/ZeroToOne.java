//4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

package com.wa;

import java.util.Scanner;

public class ZeroToOne {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.println("Input decimal number");
        double dc = tm.nextDouble();

        if (dc >= 0 && dc <= 1){
            System.out.println("Number is in the range from 0 to 1");
        } else {
            System.out.println("Number is NOT in the range from 0 to 1");
        }
    }
}
