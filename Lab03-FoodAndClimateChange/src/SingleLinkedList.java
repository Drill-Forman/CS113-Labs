import java.util.NoSuchElementException;

public class SingleLinkedList<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            this.data = dataItem;
            this.next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            this.data = dataItem;
            this.next = nodeRef;
        }
    }

    private Node<E> head = null;
    private int size = 0;

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void addLast(E item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(item);
            size++;
        }
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty.");
        }
        E temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
