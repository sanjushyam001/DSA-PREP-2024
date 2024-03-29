public class BasicLL1 {

    public static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();
        displayReverse(a);
        System.out.println("SIZE: " + size(a));

    }

    private static void display(Node temp) {

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    private static void displayReverse(Node temp) {
        if (temp == null)
            return;

        displayReverse(temp.next);
        System.out.print(temp.value + " ");
    }

    private static int size(Node temp) {

        int count = 0;
        while (temp != null) {

            count++;
            temp = temp.next;
        }
        return count;
    }

}
