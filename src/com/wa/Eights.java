/*5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
        5678  -   1
        5889  -   2
        8888  -   4
        989990  - 1*/

package com.wa;

import java.util.Scanner;

public class Eights {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input number: ");
        long num = tm.nextLong();
        int counter = 0;

        while (num > 0){
            if (num % 10 == 8){
                counter++;
            }
            num = num - num % 10;
            num = num / 10;
        }

        System.out.println(counter);
    }
}