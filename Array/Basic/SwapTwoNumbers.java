package Array.Basic;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        swap(10, 20);
    }

    private static void swap(int a, int b) {

        System.out.println("Before swapping");
        System.out.println("a: " + a + " b: " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping");
        System.out.println("a: " + a + " b: " + b);
    }
}
