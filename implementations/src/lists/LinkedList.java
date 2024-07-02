package lists;

public class LinkedList implements MyList {
    private Node head;
    private Node tail;
    private int size;

    public void LinkedLis() {
        this.size = 0;
    }

    @Override
    public int get(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void add(int element) {
        Node newNode = new Node(element);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;

            newNode.next = null;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }

    @Override
    public void add(int element, int index) {
        if (index < 0 || index > this.size) {
            throw new RuntimeException("Invalid index: " + index);
        }

        Node newNode = new Node(element);
        if(index == 0 && this.size == 0) {
            newNode.next = null;
            this.head = newNode;
            this.tail = newNode;
        }

        //mudar esse codigo colocando um get
        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            newNode = this.head;
            Node nextNode = new Node(0);
            for (int i = 0; i <= index; i++) {
                if (i == index - 1) {
                    nextNode = newNode.next;
                    newNode.next = new Node(element);
                } else if (i == index) {
                    newNode.next = nextNode;
                    newNode = new Node(element);
                }
                newNode = newNode.next;
            }
        }
        this.size++;

    }

    public void replace(int element, int index) {
        // TODO Auto-generated method stub

    }
    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

    }
}
