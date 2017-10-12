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
        long nm = tm.nextLong();
        int cnt = 0;

        while (nm > 0){
            if (nm % 10 == 8){
                cnt++;
            }
            nm = nm - nm % 10;
            nm = nm / 10;
        }

        System.out.println(cnt);
    }
}