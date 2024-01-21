package Array.Basic;

import java.util.Scanner;

public class FrequencyArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Number of queries: ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the number to be searched: ");
            int number = sc.nextInt();

            if (makeFrequencyArray(ar)[number] > 0) {
                System.out.println("YES!");
            } else {
                System.out.println("NO!");
            }
            q--;
        }
    }

    private static int[] makeFrequencyArray(int ar[]) {

        int frequencyArray[] = new int[10010];
        for (int i = 0; i < ar.length; i++) {
            frequencyArray[ar[i]]++;
        }
        return frequencyArray;
    }
}
