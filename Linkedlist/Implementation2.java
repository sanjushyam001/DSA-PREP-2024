public class Implementation2 {

    public static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class LinkedList {

        private static Node head;
        private static Node tail;
        private static int size = 0;

        private static void insertAtHead(int value) {

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;

            }
            size++;
        }

        private static void display(Node temp) {

            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        private static int size() {
            return size;
        }

        private static void insertAtEnd(int value) {

            Node newNode = new Node(value);

            if (head == null) {
                newNode.next = head;
                head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;

        }

        private static void deleteFirst(Node temp) {

            if (head == null) {
                System.out.println("Oops,List is empty!");
                return;
            } else {
                Node t = head.next;
                head = t;
                t.next = null;
            }
            size--;
        }

        private static void deleteLast(Node temp) {
            if (head == null) {
                System.out.println("Oops,List is empty!");
                return;
            } else {
                Node t = head;
                while (t.next != null && t.next.next != null) {
                    t = t.next;
                }
                System.out.println("Second last Node is : " + t.value);
                t.next = null;
                tail = t;
            }
            size--;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        System.out.println(ll.size());
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        System.out.println(ll.size());
        ll.display(ll.head);
        ll.insertAtHead(30);
        ll.display(ll.head);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.display(ll.head);
        ll.deleteLast(ll.head);
        ll.display(ll.head);
        System.out.println(ll.tail.value);

    }
}
