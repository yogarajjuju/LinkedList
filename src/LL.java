public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
