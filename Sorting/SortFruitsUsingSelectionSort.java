package Sorting;

import java.util.Arrays;

public class SortFruitsUsingSelectionSort {

    public static void main(String[] args) {

        String fruits[] = new String[] { "e", "c", "b", "d", "a" };
        System.out.println(Arrays.toString(fruits));
        sort(fruits);
        Arrays.stream(fruits).forEach(System.out::println);
    }

    private static void sort(String fruits[]) {

        for (int i = 0; i < fruits.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < fruits.length; j++) {

                if (fruits[j].compareTo(fruits[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(i, minIndex, fruits);
        }
    }

    private static void swap(int i, int j, String fruits[]) {
        String temp = fruits[i];
        fruits[i] = fruits[j];
        fruits[j] = temp;
    }
}
