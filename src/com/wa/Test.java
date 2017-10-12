package com.wa;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input time");
        int time = sc.nextInt();
        System.out.println("Input money");
        double money = sc.nextDouble();
        System.out.println("Input name");
        String human = sc.next();
        System.out.println("Input energy");
        boolean energy = sc.hasNextBoolean();

        boolean timeR = time < 24 && time > 8;
        boolean moneyR = money > 100;

        boolean finR = timeR && moneyR && energy;

        System.out.println("Did you go to the shop? - " + finR);
    }

}
