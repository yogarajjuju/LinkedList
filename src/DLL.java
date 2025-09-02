public class DLL {

    private Node head;

    //Insertion

    //Insert at the first

    public void insertfirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;


    }

    // Insertion at the last and when tail was not given
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }















    public void display(){
        Node node=head;
        Node last = null;
        while(node!=null){
            System.out.print((node.val+ "-> "));
            last=node;
            node=node.next;

        }
        System.out.println("END");
        System.out.println("Reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

















    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }


}
