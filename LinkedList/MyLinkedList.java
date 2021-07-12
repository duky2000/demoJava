package LinkedList;

public class MyLinkedList<E> {
    private Node<E> head = null;
    private int numberNode = 0;

    public MyLinkedList() {

    }

    public void add(int index, E element) {
        if (index > numberNode) {
            System.out.println("index lớn hơn size");
        }
        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node<E> newTemp = new Node<>(element);
        newTemp = temp.next;
        temp.next = newTemp;
        numberNode++;

    }

    public void remove(int index) {
        if (index > numberNode) {
            System.out.println("index lớn hơn size");
        }
        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numberNode--;
    }

    public void addFirst(E element) {
        Node node = new Node(element);
        if(head == null) {
            head = node;
        }else {
            node.next = head;
            head.next = node;
        }
        numberNode++;
    }

    public void addLast(E e) {
        Node node = new Node(e);
        if(head == null) {
            head = node;
        }
        Node temp = head;
        for (int i = 0; i < numberNode - 1; i++) {
            temp = temp.next;
        }
        temp.next = node;
        numberNode++;

    }

    public boolean removeE(E e) {
        Node temp = head;
        for (int i = 0; i < numberNode - 1; i++) {
            temp = temp.next;
            if (temp.getData() == e) {
                break;
            }
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            numberNode--;
            return true;
        } else {
            return false;
        }

    }
    public void display() {
        Node tmp = head;
        while(tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.next;

        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
mll.addFirst("a");
mll.addFirst("aaaâ");
mll.addFirst("ccccc");
mll.addFirst("sssssss");
       mll.display();
    }
}
