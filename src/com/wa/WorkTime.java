//4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//     Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

package com.wa;

import java.util.Scanner;

public class WorkTime {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.println("Input actual time (0..24)");
        int time = tm.nextByte();
        if (time < 0 || time > 24){
            System.out.println("Wrong time");
        } else {
            if (time >= 9 && time <= 18) {
                System.out.println("I'm working");
            } else {
                System.out.println("I'm relaxing");
            }
        }
    }
}
