public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }
    // to insert a new node in head
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size+=1;
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        } if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node = new Node(temp.next, value);

        temp.next=node;
        size++;
    }


    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
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
