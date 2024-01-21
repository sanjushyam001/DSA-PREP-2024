package Array.Basic;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter " + (ar.length - 1) + " Elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
