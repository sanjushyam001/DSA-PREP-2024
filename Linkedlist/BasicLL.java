class BasicLL {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node node = new Node(10);

        Node a = new Node(10);
        System.out.println(a.val);
        Node b = new Node(20);
        System.out.println(b.val);
        Node c = new Node(30);
        System.out.println(c.val);
        Node d = new Node(40);
        System.out.println(d.val);
        a.next = b;
        System.out.println(a.next);

        b.next = c;
        System.out.println(b.next);

        c.next = d;
        System.out.println(c.next);

        Node temp = a;
        // display(temp);
        // displayr(temp);
        displayrReverse(temp);
        int length = size(temp);
        System.out.println(length);

    }

    private static void display(Node temp) {
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    private static void displayr(Node temp) {

        if (temp == null)
            return;
        System.out.println(temp.val);
        displayr(temp.next);

    }

    private static void displayrReverse(Node temp) {

        if (temp == null)
            return;
        displayrReverse(temp.next);
        System.out.print(temp.val + " ");

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