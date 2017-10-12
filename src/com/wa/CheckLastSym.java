/*4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        124    4    -   true
        1456   567  -   false
        1      2    -   false
        18     98   -   true*/

package com.wa;

import java.util.Scanner;

public class CheckLastSym {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int one = tm.nextInt();
        System.out.print("Input 2nd number: ");
        int two = tm.nextInt();

        System.out.println(one % 10 == two % 10);
    }
}