public class Implementation {

    public static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class LinkedList {

        private static Node head = null;
        private static Node tail = null;
        private static int size = 0;

        public static void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;

        }

        public static void display(Node head) {
            if (head == null) {
                System.out.println("List Empty!");
                return;

            } else {

                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + "->");
                    temp = temp.next;
                }
            }
            System.out.println();
        }

        public static void insertAtHead(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public static void insertAt(int index, int val) {
            if (index > size() || index < 0) {
                System.out.println(
                        "Invalid position!,Position should be greater than 0 or equal to or less than to size ");
                return;
            }
            if (index == size) {
                insertAtEnd(val);
                return;
            }
            Node newNode = new Node(val);
            if (head == null) {
                System.out.println("List Empty!");
            } else {

                Node temp = head;
                for (int i = 1; i <= index - 1; i++) {

                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            size++;
        }

        public static int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.display(null);
        list.insertAtEnd(10);
        // list.display(list.head);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        // list.display(list.head);
        // list.insertAtHead(5);
        // list.display(list.head);
        list.insertAtHead(0);
        list.insertAtEnd(50);
        list.insertAtHead(1);
        list.display(list.head);
        list.insertAt(3, 15);

        list.display(list.head);
        System.out.println(list.size());
        list.insertAt(8, 60);
        list.display(list.head);
        list.insertAt(10, 70);

    }
}
