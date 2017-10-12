//5.2. Вычислить факториал числа.

package com.wa;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {

        Scanner tm = new Scanner(System.in);
        System.out.print("Input number: ");
        int nm = tm.nextInt();
        int fac = 1;

        for (int i = 1; i <= nm; i++){
            fac = fac * i;
        }

        System.out.println(nm + "! = " + fac);
    }
}