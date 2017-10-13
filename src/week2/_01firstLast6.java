package week2;

import java.util.Scanner;

public class _01firstLast6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        System.out.print("Input length of array: ");
        int array_ln = sc.nextInt();
        int[] ar = new int[array_ln];

        for (int i = 0; i < array_ln; i++){
            System.out.print("Input element " + i + ": ");
            ar[i]  = sc.nextInt();
        }
*/
        int[] ar = {1,2,3,4};
        int[] ar1 = new int[ar.length];
        if (ar[0] == 2 && ar[1] == 3) ar[1] = 0;



        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.print("-- ");
        System.out.print(ar[0] == 6 || ar[ar.length - 1] == 6);
    }
}
