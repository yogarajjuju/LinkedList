public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    //INSERTION OF NODES
    // to insert a new node in head I.E INSERT A NODE @ FIRST
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size+=1;
    }// Insert a node at a give of particular position
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

// Insert a node at the last / tail position
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



    //DELETION OF NODES

    // Delete a node at first
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    // Deletion of last node


    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast=get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    // Delete a particular index node

    public int delete(int index){
        if(index==0){
            return deletefirst();
        } if(index==size-1){
            return deletelast();

        }
        Node prev=get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
    }













    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node =node.next;

        }
        return node;
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
