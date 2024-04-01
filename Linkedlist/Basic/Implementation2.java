package Basic;
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

        private static void display() {

            Node temp = head;
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
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;

            size++;

        }

        private static void deleteFirst() {

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

        private static void deleteLast() {
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

        private static void insertAt(int value, int p) {

            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (p < 1) {
                System.out.println("Invalid position ! position should not be less than 1");
                return;
            }
            if (p == 1) {
                insertAtHead(value);
                return;
            }
            if (p > size && p == size + 1) {
                insertAtEnd(value);
                return;
            }
            if (p > size + 1) {
                System.out.println(
                        "You cant put value at Invalid position,position should not be more than " + (size + 1));
                return;
            }
            int count = 1;

            Node temp = head;
            while (temp != null) {

                if (count == p - 1) {
                    break;
                }
                count++;
                temp = temp.next;
            }
            Node newNode = new Node(value);
            Node tempNextNode = temp.next;
            temp.next = newNode;
            newNode.next = tempNextNode;
            tempNextNode = null;
            size++;
            // System.out.println("Position : " + temp.value);

        }

        private static void deleteAt(int p) {

            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (p < 1) {
                System.out.println("Invalid position ! position should not be less than 1");
                return;
            }
            if (p == 1) {
                deleteFirst();
                return;
            }
            if (p == size) {
                deleteLast();
                return;
            }
            if (p > size) {
                System.out.println("Invalid position,position should not be greater than " + (size));
                return;
            }
            int count = 1;

            Node temp = head;
            while (temp != null) {

                if (count == p - 1) {
                    break;
                }
                count++;
                temp = temp.next;
            }
            Node tempNextNode = null;
            if (temp != null && temp.next != null) {
                tempNextNode = temp.next.next;
                temp.next = tempNextNode;
            }

        }

        private static int getAt(int index) {

            if (index < 1) {
                System.out.println("Invalid position,position should not be less than 1");
                return -1;
            }
            if (index > size()) {
                System.out.println("Invalid position,position should not be less than 1");
                return -1;
            }
            Node temp = head;
            int count = 1;
            while (temp != null) {
                if (count == index)
                    break;
                count++;
                temp = temp.next;
            }
            return temp.value;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // System.out.println(ll.size());
        ll.insertAtHead(0);
        ll.insertAtHead(5);
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAt(1, 1);
        ll.insertAt(40, 5);
        ll.insertAt(70, 7);
        ll.insertAt(0, 0);

        ll.display();

        System.out.println(ll.getAt(8));

    }
}
