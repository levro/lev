package com.wa;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input int");
        int vr = sc.nextInt();
        long vr_d;
        vr_d = 123456789 * vr;

        System.out.println(vr);
        System.out.println(vr_d);

        double a = 56.9898;
        int b = (int)Math.round(a);

        System.out.println(b);
    }

}
