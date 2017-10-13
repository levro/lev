package week2;

import java.util.Scanner;

public class _02sameFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input length of array: ");
        int array_ln = sc.nextInt();
        int[] ar = new int[array_ln];

        for (int i = 0; i < array_ln; i++){
            System.out.print("Input element " + i + ": ");
            ar[i]  = sc.nextInt();
        }

        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.print("-- ");
        System.out.print(ar[0] == 6 || ar[array_ln - 1] == 6);
    }
}

